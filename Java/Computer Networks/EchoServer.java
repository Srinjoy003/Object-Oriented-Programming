import java.net.*;
import java.io.*;
import java.util.Scanner;

public class EchoServer{
    public static void main(String[] args) throws IOException{
        ServerSocket socket = new ServerSocket(3000);
        Socket s = socket.accept();
        // DataInputStream in = new DataInputStream(s.getInputStream());
        // DataOutputStream out = new DataOutputStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream out = new PrintStream(s.getOutputStream());

        while(true){
            String str = in.readLine();
            out.println(str);
            System.out.println("Got Message: " + str);

          
            
        }
        // socket.close();


    }
}