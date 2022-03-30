/**
 * 
 */
package Calculator_Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					//------------------------------------------------------------------
					// gửi chuỗi hello sang client
					String chuoiNhap_a = "Mời Nhập a";
					buffW.write(chuoiNhap_a+"\n");
					buffW.flush();
					// nhận chuỗi xin chào từ client
					String chuoi_A = buffRead.readLine();
					System.out.println("Client: a= "+chuoi_A);
					
					//------------------------------------------------------------------
					
					// gửi chuỗi hello sang client
					String chuoiNhap_b = "Mời Nhập b";
					buffW.write(chuoiNhap_b+"\n");
					buffW.flush();
					// nhận chuỗi từ client
					String chuoi_B = buffRead.readLine();
					System.out.println("Client: b= "+chuoi_B);
					
					//------------------------------------------------------------------
					
					// gửi chuỗi hello sang client
					String chuoiNhap_calculator = "Mời Nhập phép toán";
					buffW.write(chuoiNhap_calculator+"\n");
					buffW.flush();
					// nhận chuỗi từ client
					String chuoi_tinh = buffRead.readLine();
					System.out.println("Client: phép tính "+chuoi_tinh);
					
					//------------------------------------------------------------------
					String chuoiDangTinh = "Tôi đang tính toán...";
					buffW.write(chuoiDangTinh+"\n");
					buffW.flush();
					//------------------------------------------------------------------
					//Tính toán 
					double calculator;
					String chuoiKQ;
					calculator = Double.parseDouble(chuoi_A)/(Double.parseDouble(chuoi_B)*2);
					
					// hàm trả về kết quả cho client
					System.out.println("kết quả = " +calculator);
					
				}	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
