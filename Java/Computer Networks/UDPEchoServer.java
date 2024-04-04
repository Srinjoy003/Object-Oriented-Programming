
import java.net.*;
import java.io.*;

public class UDPEchoServer
{
 	public static void main(String args[]) throws IOException{
		int port = 6500;


		DatagramSocket serverDatagramSocket = new DatagramSocket(port);
		System.out.println("Created UDP Echo Server on port "+port);

		byte buffer[] = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
		String Inputstring;

		while(true){
		// listen for datagram packets
			serverDatagramSocket.receive(datagramPacket);
			Inputstring = new String(datagramPacket.getData(), 0,datagramPacket.getLength());
			System.out.println("Received from Server the given Input String: "+ Inputstring);

			// send received packet back to the client
			serverDatagramSocket.send(datagramPacket);
		}
	}
}