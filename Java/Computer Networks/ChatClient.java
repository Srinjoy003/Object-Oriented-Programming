import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ChatClient {
     public static void main(String[] args) throws IOException{

        Socket socket = new Socket("localhost",3000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(socket.getOutputStream());

        while(true){
            String str, str1;
            while((str1 = br.readLine()) != null){
                out.println(str1);
                str = in.readLine();
                System.out.println(str);


            }

            in.close();
            br.close();
            out.close();
            socket.close();
        }
        
    }
}
