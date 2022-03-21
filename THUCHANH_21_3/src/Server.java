import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 */

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
			// mở cổng và bắt đầu nghe
			ServerSocket socketServer = new ServerSocket(8888);
			System.out.println("Đang lắm nghe cổng 8888 ..... ");
			//luôn luôn lắng nghe bằng vòng lặp while không giới hạn
			while(true)
			{
				Socket socketClient = socketServer.accept();
				OutputStream osToClient = socketClient.getOutputStream();
					// để gửi chuỗi cho tiện
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				BufferedWriter bufferWriter = new BufferedWriter(write2Client);
				// gửi 
				bufferWriter.write("Xin Chào Client \n");
				bufferWriter.flush();
				// đóng socket
				socketClient.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
