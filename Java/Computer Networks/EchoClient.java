import java.net.*;
import java.util.Scanner;
import java.io.*;


public class EchoClient extends Thread{
    Socket socket;
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("localhost",3000);
        // DataInputStream in = new DataInputStream(socket.getInputStream());
        // DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        // Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.print("Message:");
            String str = br.readLine();
            out.println(str);
            System.out.println("Echo back from " + socket.getRemoteSocketAddress() + ": " + in.readLine());
                
            }
         

        }


}
