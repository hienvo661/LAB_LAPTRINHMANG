/**
 * 
 */
package BAI1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hienv
 *
 */
public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket svSocket = new ServerSocket(8888);
			System.out.println("Server is connecting...");
			Socket socket = svSocket.accept();
			System.out.println("Server connected");
			// nhận data từ client
			DataInputStream input = new DataInputStream(socket.getInputStream());
			DataOutputStream output = new DataOutputStream(socket.getOutputStream()); 
			while(true) {
				double a = input.readDouble();
				double b = input.readDouble();
				System.out.println("Số A: "+a);
				System.out.println("Số B: "+b);
//				output.writeDouble();
				output.flush();
			}
			
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}

