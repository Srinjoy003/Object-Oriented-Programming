import java.io.*;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException{

        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            String inputString = br.readLine();
            DatagramPacket datagramPacket = new DatagramPacket(inputString.getBytes(), inputString.length(), address, 6066);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(datagramPacket);
            String recievedString = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println("Recieved from server: " + recievedString);
        }
    }
}
