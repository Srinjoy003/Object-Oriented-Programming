import java.util.*;

public class Lottery{
    public static void main(String[] args){
        int lotteryNum = (int) (Math.random() * 90) + 10;
        // int lotteryNum = 24;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 10 and 99: ");
        int userNum = scanner.nextInt();

        int l1 = lotteryNum % 10;
        int l2 = lotteryNum / 10;


        int u1 = userNum % 10;
        int u2 = userNum / 10;

        System.out.println("Lottery Winner Number: " + lotteryNum);

        System.out.print("You won: Rs. ");

        if(lotteryNum == userNum)
            System.out.print("10000");
        else if(l1 == u2 &&  l2 == u1)
            System.out.print("3000");
        
        else if(l1 == u1 ||  l1 == u2 || l2 == u1 || l2 == u2)
            System.out.print("1000");
        
        else    
            System.out.print("0");

        scanner.close();

    }
}