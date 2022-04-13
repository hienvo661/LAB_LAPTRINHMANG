/**
 * 
 */
package VONGOCHIEN_60130285;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



/**
 * @author hienv
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket socketServer = new ServerSocket(8888);
		System.out.print("Tôi lắng nghe trong cổng 8888  ...");
		int id =0;
		while(true) {
			Socket s = socketServer.accept();
			//new LuongLamViec(s, id++).start();
			Server luongTask = new Server(s, id);
			luongTask.start();
		}

	}

}
