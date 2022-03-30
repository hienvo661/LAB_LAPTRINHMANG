/**
 * 
 */
package BMIClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
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
public class BMIClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
			
			//Lấy chuỗi từ bàn phím
			Scanner banPhim = new Scanner(System.in);
			//Giao tiếp theo giao thức thiết kế
			String chuoiHello = buffRead.readLine();
			
			//In ra màn hình
			System.out.println("BMI Server: "+chuoiHello);
			String chuoiXinChao = "Xin chào";
			buffW.write(chuoiXinChao+"\n");
			buffW.flush();
			
			//Nhận và gửi tên
			String name = buffRead.readLine();
			System.out.println("BMI Server: "+name);
			System.out.print("BMI client: (Nhập tên bạn): ");
			String chuoiTraLoiTen_Gui = banPhim.nextLine();
			buffW.write(chuoiTraLoiTen_Gui+"\n");
			System.out.println("BMI Server: Bạn tên là: "+chuoiTraLoiTen_Gui);
			buffW.flush();
			
			
			//Nhận và gửi cân nặng
			String weight = buffRead.readLine();
			System.out.println("BMI Server: "+weight);
			System.out.print("BMI client: (Nhập cân nặng của bạn): ");
			
			String ClientWeight = banPhim.nextLine();
			buffW.write(ClientWeight+"\n");
			buffW.flush();
			System.out.println("BMI Server: Bạn nặng "+ClientWeight+" "+"kg");
			
			//Nhận và gửi chiều cao
			String height = buffRead.readLine();
			System.out.println("BMI Server: "+height);
			System.out.print("BMI client: (Nhập chiều cao của bạn): ");
			String ClientHeight = banPhim.nextLine();
			buffW.write(ClientHeight+"\n");
			buffW.flush();
			System.out.println("BMI Server: Bạn cao "+ClientHeight+" "+"m");
			
			//
			String chuoiDangTinh = buffRead.readLine();
			System.out.println("BMI Server: "+chuoiDangTinh);
			
			//
			String chuoiKQ = buffRead.readLine();
			System.out.println("BMI Server: "+chuoiKQ);
			socClient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
