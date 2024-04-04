import java.io.*;
import java.net.*;

public class UDPServer {

    public static void main(String[] args) throws IOException{
        
        DatagramSocket  datagramSocket = new DatagramSocket(6066);
        byte buffer[] = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);

        while(true){
            datagramSocket.receive(datagramPacket);
            String inputString = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println("Recieved from client: " + inputString);
            datagramSocket.send(datagramPacket);
        }
    }
}
