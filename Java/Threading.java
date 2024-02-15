// Your program will have two threads - the main thread and a thread that you create. The thread that you create will be responsible for calculating max value in an array of 5 integers.
// a) Create thread for the above program by extending the thread class.
// b) By implementing the runnable interface

class ThreadExtension extends Thread{

    ThreadExtension(){
        super();
        start();
        try{
            join();
        }
        catch(InterruptedException e){}
    }

    @Override
    public void run(){
        int max = -1;
        System.out.print("Numbers: ");

        for (int i = 0; i < 5; i++){
            int x = (int) (Math.random() * 100);
            System.out.print(x + " ");

            if (x > max)
                max = x;
        }

        System.out.println("\nMax: " +  max);
    }

    
}

class RunnableImplementation implements Runnable{
    Thread t;
    RunnableImplementation(){
        t = new Thread(this);
        t.start();

        try{
            t.join();

        }
        catch(InterruptedException e){}
    }

    public void run(){
        int max = -1;
        System.out.print("Numbers: ");

        for (int i = 0; i < 5; i++){
            int x = (int) (Math.random() * 100);
            System.out.print(x + " ");

            if (x > max)
                max = x;
        }

        System.out.println("\nMax: " +  max);
    }

    
}

public class Threading{
    public static void main(String[] args) {
        ThreadExtension threadExtend = new ThreadExtension();
        RunnableImplementation runnableImplement = new RunnableImplementation();
        // Thread threadImplement = new Thread(runnableImplement);

        // threadExtend.start();

        // try{
        //     threadExtend.join();
        // }

        // catch(InterruptedException e){
        //     System.out.println("Interrupted");
        // }

        // threadImplement.start();

        // try{
        //     // threadExtend.join();
        //     threadImplement.join();
        // }
        // catch(InterruptedException e){
        //     System.out.println("Interrupted");

        // }




    }
}