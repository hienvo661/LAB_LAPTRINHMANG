/**
 * 
 */
package BMIServer;

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
public class BMIServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// Mở cổng và bắt đầu nghe
			ServerSocket server = new ServerSocket(8989);
			System.out.println("I'm listening on 8989 port...");
			// Luôn luôn lắng nghe
			while (true){
				//Khi có 1 yêu cầu thì accept
				//Mở 1 Socket để làm việc với Client
				Socket socServer = server.accept();
				
				//Lấy về luồng xuất, nhập
				InputStream in = socServer.getInputStream();
				InputStreamReader inRead = new InputStreamReader(in);
				BufferedReader buffRead = new BufferedReader(inRead);
				
				OutputStream osToClient = socServer.getOutputStream();
				OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
				BufferedWriter buffW = new BufferedWriter(write2Client);
				
				//========Giao tiếp theo giao thức thiết kế=====
				
					String chuoiHello = "Hello";
					buffW.write(chuoiHello+"\n");
					buffW.flush();
					
					String chuoiXinChao = buffRead.readLine();
					System.out.println("CLient: "+chuoiXinChao);
					
					//Gửi và nhận tên
					String name = "Gửi tên cho tôi (nhập tên của bạn)";
					buffW.write(name+"\n");
					buffW.flush();
					
					String ClientName = buffRead.readLine();
					System.out.println("Client: Tên = "+ClientName);
					
					
					//Gửi và nhận cân nặng
					String weight = "Cân nặng của bạn là?";
					buffW.write(weight+"\n");
					buffW.flush();
					String ClientWeight = buffRead.readLine();
					System.out.println("Client: Cân nặng = "+ClientWeight);
					
					
					
					//Gửi và nhận chiều cao
					String height = "Chiều cao của bạn là?";
					buffW.write(height+"\n");
					buffW.flush();
					String ClientHeight = buffRead.readLine();
					System.out.println("Client: Chiểu cao = "+ClientHeight);
					
					// gửi message đang tính
					String chuoiDangTinh = "Tôi đang tính toán...";
					buffW.write(chuoiDangTinh+"\n");
					buffW.flush();
					
					//Tính toán BMI
					double BMI;
					String chuoiKQ;
					BMI = Double.parseDouble(ClientWeight)/(Double.parseDouble(ClientHeight)*2);
						//Các lệnh ở đây
						//Đổi tham số từ chuỗi sang số
					if(BMI < 18) {
						chuoiKQ = "Bạn là người gầy";
					}
					else if(BMI <= 24.9){
						chuoiKQ = "Bạn là người bình thường";
					}
					else if(BMI <= 29.9){
						chuoiKQ = "Bạn bị béo phì độ I";
					}
					else if(BMI <= 34.9) {
						chuoiKQ = "Bạn bị béo phì độ II";
					}
					else{
						chuoiKQ = "Bạn bị béo phì độ III";
					}
					
					//
					buffW.write(chuoiKQ+"\n");
					buffW.flush();
				//Đóng luồng
				socServer.close();	
			}
			//server.close();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

	}

}
