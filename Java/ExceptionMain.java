


// Create two user defined exceptions viz. TooHot and TooCold. Write a Java program and throw TooHot if the temperature exceeds 40 degrees and throw TooCold if the temperature is less than 20 degrees.

import java.util.Scanner;

class TooHot extends Exception{
    public String message;

    TooHot(String message){
        this.message = message;
    }
    
}

class TooCold extends Exception{
    public String message;

    TooCold(String message){
        this.message = message;
    }
    
}

class TempChecker{

    static void check() throws TooHot, TooCold {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        int temp = scanner.nextInt();

        if (temp > 40)
            throw new TooHot("Too hot");
        
        else if (temp < 20)
            throw new TooCold("Too Cold");
        
        else
            System.out.println("Normal temperature");

    }

}

public class ExceptionMain{
    public static void main(String[] args){

        try{
            TempChecker.check();
        }

        catch(TooHot e){
            System.out.println(e.message);
        }

        catch(TooCold e){
            System.out.println(e);
        }

    }
}
