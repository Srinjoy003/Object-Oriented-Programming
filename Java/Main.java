class SharedResource {
    private String message;
    private boolean messageSet = false;

    synchronized void setMessage(String message) {
        while (messageSet) {
            try {
                wait(); // Wait for the consumer to consume the message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.message = message;
        messageSet = true;
        notify(); // Notify the consumer that a new message is available
    }

    synchronized String getMessage() {
        while (!messageSet) {
            try {
                wait(); // Wait for the producer to produce a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        messageSet = false;
        notify(); // Notify the producer that the message has been consumed
        return message;
    }
}

class Thread1 extends Thread {
    private SharedResource sharedResource;

    Thread1(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String statement = "Thread 1: Statement " + (i + 1);
            sharedResource.setMessage(statement);
            System.out.println(statement);
        }
    }
}

class Thread2 extends Thread {
    private SharedResource sharedResource;

    Thread2(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String response = "Thread 2: Response " + (i + 1);
            System.out.println(sharedResource.getMessage());
            sharedResource.setMessage(response);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread1 thread1 = new Thread1(sharedResource);
        Thread2 thread2 = new Thread2(sharedResource);

        thread1.start();
        thread2.start();
    }
}
