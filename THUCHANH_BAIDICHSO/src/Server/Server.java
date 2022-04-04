/**
 * 
 */
package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hienv
 *
 */
public class Server extends Thread {

	Socket socketClient;
	int id = -1;
	

	public Server(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
		
	}



	@Override
	public void run() {
		try {
			System.out.print(socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			OutputStream osToClient = socketClient.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2Client);
		
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);
	
			String chuoiNhan = buffR.readLine();
			

			//Gửi trả
				switch (chuoiNhan) {
				  case "0":
				    System.out.println("Zero");
				  case "1":
				    System.out.println("One");
				  case "2":
				    System.out.println("Two");
				  case "3":
				    System.out.println("Three");
				  case "4":
				    System.out.println("Four");
				  case "5":
				    System.out.println("Five");
				  case "6":
				    System.out.println("Six");
				  case "7":
					System.out.println("Seven");
				  case "8":
					System.out.println("Eight");
				  case "9":
					System.out.println("Nine");
				  case "10":
					System.out.println("Ten");
					break;
				}
				String chuoiGui = chuoiNhan;
				buffW.write(chuoiNhan+"\n");
				buffW.flush();
		}
		
				
			catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage());
			}

	}
}
		

