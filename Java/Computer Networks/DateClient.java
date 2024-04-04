import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DateClient {
     public static void main(String[] args) throws IOException{
        
        Socket socket = new Socket("localhost",3000);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str;
        while((str = in.readLine()) != null){
            System.out.println("From Server: " + str);
        }
    }
}
