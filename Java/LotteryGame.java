// 3. Write a Java program to play lottery. The program randomly generates a lottery of a 2-digit number, prompts
// the user to enter a two-digit number and determines whether the user wins according to the following rule:
//   If the user input matches the lottery in exact order, the award is Rs.10000.
//   If the user input matches the lottery, the award is Rs.3000
//   If one digit in the user input matches a digit in the lottery, the award is Rs. 1000.


import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        // Generate a random lottery number between 10 and 99
        int lottery = (int) (Math.random() * 90) + 10;

        // Initialize a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your two-digit lottery guess (e.g., 23): ");
        int userGuess = scanner.nextInt();

        // Extract digits from the lottery and user's guess
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;
        int userDigit1 = userGuess / 10;
        int userDigit2 = userGuess % 10;

        System.out.println("The lottery number is: " + lottery);

        // Check for a perfect match
        if (userGuess == lottery) 
            System.out.println("Congratulations! You win Rs. 10,000!");
        
        // Check for a match in reverse order
        else if (userDigit2 == lotteryDigit1 && userDigit1 == lotteryDigit2) 
            System.out.println("Congratulations! You win Rs. 3,000!");
        
        // Check for a match in individual digits
        else if (userDigit1 == lotteryDigit1 || userDigit1 == lotteryDigit2 || userDigit2 == lotteryDigit1 || userDigit2 == lotteryDigit2) 
            System.out.println("Congratulations! You win Rs. 1,000!");
        else 
            System.out.println("Sorry, no matches. Try again!");
        

        // Close the scanner
        scanner.close();
    }
}
