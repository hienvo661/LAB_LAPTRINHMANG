/**
 * 
 */
package Calculator_Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author hienv
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socClient = new Socket("Localhost",8989);
			System.out.print("Connected!!\n");
			//Lấy luồng nhập
			InputStream in = socClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			
			OutputStream osToClient = socClient.getOutputStream();
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2Client);
			
			//--------------------------------------------
			//Lấy chuỗi từ bàn phím
			Scanner banPhim = new Scanner(System.in);
			
			
//---------------------------------------------------------
			//Giao tiếp theo giao thức thiết kế
			String chuoiHoiA = buffRead.readLine();
			//In ra màn hình
			System.out.println("Server: "+chuoiHoiA);

			// gửi sang server
			System.out.print("Client: [Nhập a] ");
			String a = banPhim.nextLine();
			buffW.write(a+"\n");
			buffW.flush();
//------------------------------------------------------------
			String chuoiHoiB = buffRead.readLine();
			//In ra màn hình
			System.out.println("Server: "+chuoiHoiB);
			
			// gửi sang server
			System.out.print("Client: [Nhập b] ");
			String b = banPhim.nextLine();
			buffW.write(b+"\n");
			buffW.flush();
			
//-------------------------------------------------------------
			String chuoiHoiPheptinh = buffRead.readLine();
			//In ra màn hình
			System.out.println("Server: "+chuoiHoiPheptinh);
			
			// gửi sang server
			System.out.print("Client: [Nhập phép tính] ");
			String pheptinh = banPhim.nextLine();
			buffW.write(pheptinh+"\n");
			buffW.flush();
//--------------------------------------------------------------
			// đọc và in ra màn hình chuỗi "Tôi đang tính toán..."
			String chuoiDangTinh = buffRead.readLine();
			//In ra màn hình
			System.out.println("Server: "+chuoiDangTinh);
			buffW.flush();
			
//-------------------------------------------------------------
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
