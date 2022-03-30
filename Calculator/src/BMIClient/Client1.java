/**
 * 
 */
package BMIClient;

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
public class Client1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket soc = new Socket("localhost",8989);
			System.out.print("Conected!\n");
			
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);

			OutputStream osToClient = soc.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2Client);
			
			Scanner banPhim = new Scanner(System.in);
			//=====THIẾT KẾ GIAO THỨC ======
			String chuoiHello_Nhan = buffR.readLine();
			System.out.println("BMI server: " + chuoiHello_Nhan);
			
			String chuoiXinChao_Gui = "Xin Chào";
			buffW.write(chuoiXinChao_Gui +"\n");
			buffW.flush();
			
//			System.out.println("BMI server: " + chuoiHoiTen_Nhan);
			
				//Trả lời tên bằng bàn phím
//				System.out.print("BMI client: (Nhập tên bạn): ");
//				String chuoiTraLoiTen_Gui = banPhim.nextLine();
//				buffW.write(chuoiTraLoiTen_Gui);
//				System.out.println("BMI Server :" +chuoiTraLoiTen_Gui);
//				buffW.flush();
				
				//Nhận và gửi tên
				String name = buffR.readLine();
				System.out.println("BMI Server: "+name);
				System.out.print("BMI client: (Nhập tên bạn): ");
				String chuoiTraLoiTen_Gui = banPhim.nextLine();
				buffW.write(chuoiTraLoiTen_Gui+"\n");
				System.out.println("BMI Server: Bạn tên là: "+chuoiTraLoiTen_Gui);
				buffW.flush();
				
				// nhận và gửi cân nặng
				

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
