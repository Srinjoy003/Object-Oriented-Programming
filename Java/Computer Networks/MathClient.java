import java.net.*;
import java.io.*;
import java.util.*;

public class MathClient {
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("localhost", 3000);
        Scanner sc = new Scanner(System.in);
        // DataInputStream in = new DataInputStream(socket.getInputStream());
        // DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(socket.getOutputStream());
        String input = "";

        while (true){
            System.out.print("Choose Operation: 1.Edges 2.Bitrate 3.Efficiency1 4.Efficiency2 5.Exit: ");
            int choice = sc.nextInt();

            if(choice == 1){
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                input = Integer.toString(n) + " edges " + Integer.toString(n-1);
            }

            if(choice == 2){
                System.out.print("Enter baud rate: ");
                int br = sc.nextInt();
                System.out.print("Enter no of signals per baud: ");
                int sig = sc.nextInt();
                input = Integer.toString(br) + " bitrate " + Integer.toString(sig);
            }

            if(choice == 3){
                System.out.print("Enter Propagation time: ");
                int tp = sc.nextInt();
                System.out.print("Enter Transmission time: ");
                int tt = sc.nextInt();
                input = Integer.toString(tp) + " efficiency1 " + Integer.toString(tt);
            }

            if(choice == 4){
                System.out.print("Enter bandwidth: ");
                int b = sc.nextInt();
                System.out.print("Enter packet length: ");
                int p = sc.nextInt();
                input = Integer.toString(b) + " efficiency2 " + Integer.toString(p);
            }

            if(choice == 5){
               break;
            }
            // out.writeUTF(input);
            out.println(input);
            System.out.println("Sent Input");
            // System.out.println("Answer: " + in.readUTF());
            System.out.println("Answer: " + in.readLine());


        }

        socket.close();

    }
}
