/**
 * 
 */
package VONGOCHIEN_60130285_bai2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
	
				while(true){
					int a;
					String chuoiNhan=buffR.readLine();
					System.out.print(chuoiNhan);
					a = Integer.parseInt(chuoiNhan);
					
					

					
				}
				
//				socketClient.close();

		}
			catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage());
			}

	}
}