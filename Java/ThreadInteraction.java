// Write a Java program to show the communication between two threads using the concept of producer consumer problem.
// Thread 1 types a statement, to which Thread 2 types a response and the control keeps alternating between thread 1 and thread 2.

class Buffer{
    boolean sent = false;
    String message;

    synchronized void send(String message){
        while(sent){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("Interrupted");
            }
        }

        sent = true;
        this.message = message;
        notify();

    }

    synchronized String recieve(){
        while(!sent){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("Interrupted");
            }
        }

        sent = false;
        notify();
        return message;

    }
}

class StatementThread implements Runnable{
    Buffer buffer;
    String name;

    StatementThread(Buffer buffer, String name){
        this.buffer = buffer;
        this.name = name;
    }

    public void run(){
        for(int i = 0; i < 5; i++){
            String message =  name + " sending message" + i;
            System.out.println(message);
            buffer.send(Integer.toString(i));
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
}

class ResponseThread implements Runnable{
    Buffer buffer;
    String name;

    ResponseThread(Buffer buffer, String name){
        this.buffer = buffer;
        this.name = name;
    }

    public void run(){
        for(int i = 0; i < 5; i++){
            String response =  name + " recieving message" + buffer.recieve();
            System.out.println(response);
            
        }
    }
}


public class ThreadInteraction{
    public static void main(String[] args){
        Buffer buffer = new Buffer();
        StatementThread cT1 = new StatementThread(buffer, "Thread 1");
        ResponseThread cT2 = new ResponseThread(buffer, "Thread 2");

        Thread T1 = new Thread(cT1);
        Thread T2 = new Thread(cT2);

        T1.start();
        T2.start();


    }
}