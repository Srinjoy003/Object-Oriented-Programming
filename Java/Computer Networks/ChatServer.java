import java.io.*;
import java.net.*;


public class ChatServer {
    public static void main(String[] args) throws IOException{

        ServerSocket socket = new ServerSocket(3000);
        Socket s = socket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream out = new PrintStream(s.getOutputStream());

        while(true){
            // System.out.print("Message:");
            String str, str1;
            while((str = in.readLine()) != null){
                System.out.println(str);
                str1 = br.readLine();
                out.println(str1);

            }

            in.close();
            br.close();
            out.close();
            socket.close();
        }
        
    }
}
