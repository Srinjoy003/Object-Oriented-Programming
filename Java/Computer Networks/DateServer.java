import java.net.*;
import java.io.*;
import java.util.*;

public class DateServer {
    public static void main(String[] args) throws IOException{
        
        ServerSocket socket = new ServerSocket(3000);
       
        
        while(true){
            Socket s = socket.accept();
            PrintStream out = new PrintStream(s.getOutputStream());
            String str;
            Date date = new Date();
            out.println(date.toString());
        }
    }

}
