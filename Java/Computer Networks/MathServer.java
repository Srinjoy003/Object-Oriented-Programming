import java.net.*;
import java.util.StringTokenizer;
import java.io.*;

public class MathServer {
    public static void main(String[] args) throws Exception{
        
        ServerSocket sc = new ServerSocket(3000);
        Socket socket = sc.accept();
        // DataInputStream in = new DataInputStream(socket.getInputStream());
        // DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(socket.getOutputStream());

        while (true){
            // String input = in.readUTF();
            String input = in.readLine();
            StringTokenizer tokenizer = new StringTokenizer(input);
            Double op1 = Double.parseDouble(tokenizer.nextToken());
            String operation = tokenizer.nextToken();
            Double op2 = Double.parseDouble(tokenizer.nextToken());
            Double ans = 0.0;

            System.out.println("WOrking " + operation);

            if(operation.equals("edges")){
                ans = op1 * ((op2) / 2);
            }

            else if(operation.equals("bitrate")){
                ans = op1 * op2;
            }

            else if(operation.equals("efficiency1")){
                ans = (1 / (1 + 2*(op1 / op2))) * 100;
            }

            else if(operation.equals("efficiency2")){
                int time = 100 / 2;
                ans = (1 / (1 + 2*time*(op1 / op2))) * 100;
            }

            else{
                System.out.println("Exited");
                System.exit(0);
            }

            System.out.println("Calculation Sent");
            // out.writeUTF(ans.toString());
            out.println(ans.toString());


        }
    }
}
