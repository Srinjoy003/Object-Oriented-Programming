import java.net.*;
import java.io.*;
public class UDPEchoClient
{

   	public static void main(String[] args) throws IOException{
	  	InetAddress address = InetAddress.getByName("localhost");
		DatagramSocket datagramSocket = new DatagramSocket();
		BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
 
 	
		System.out.println("Ready to send your messages...");
		
		while (true){
			// read input from the keyboard
			String input = keyboardReader.readLine();
			// send datagram packet to the server
			DatagramPacket datagramPacket = new DatagramPacket(input.getBytes(), input.length(), address, 6500);
			datagramSocket.send(datagramPacket);
			datagramSocket.receive(datagramPacket);
			String inpuString = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
			System.out.println("Recieved from server" +  inpuString);

		}
		
 	}
} 