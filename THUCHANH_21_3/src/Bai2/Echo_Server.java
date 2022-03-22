/**
 * 
 */
package Bai2;

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
public class Echo_Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// mở cổng và bắt đầu nghe
			ServerSocket socketServer = new ServerSocket(9999);
			System.out.println("Đang lắm nghe cổng 9999 ..... ");
			//luôn luôn lắng nghe bằng vòng lặp while không giới hạn
			while(true)
			{
				//accept khi có người gửi yêu cầu đến server
				Socket socketClient = socketServer.accept();
				// lấy về luồng nhập, xuất
				OutputStream osToClient = socketClient.getOutputStream();
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				BufferedWriter buffWriter = new BufferedWriter(write2Client);
				
				InputStream input = socketClient.getInputStream();
				InputStreamReader inputReader = new InputStreamReader(input);
				BufferedReader BuffRead = new BufferedReader(inputReader); 
//				// gửi 			
//				bufferWriter.write("Xin Chào Client \n");
//				bufferWriter.flush();
//				// đóng socket
//				socketClient.close();
				while(true) 
				{
					// nhận dữ liệu 
					String chuoinhan = BuffRead.readLine();
					String chuoiGui = chuoinhan;
					buffWriter.write(chuoiGui+"\n");
					buffWriter.flush();
					if(chuoiGui.equals("Bye!!!")); break;
					
				}
				socketClient.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}