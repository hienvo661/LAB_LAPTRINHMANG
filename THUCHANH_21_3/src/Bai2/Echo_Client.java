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
import java.net.Socket;
import java.util.Scanner;

/**
 * @author hienv
 *
 */
public class Echo_Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket soc;
		try {
			soc = new Socket("localhost", 9999);
			System.out.println("Connect ..... ");
			// lấy luồng
			InputStream input = soc.getInputStream();
			InputStreamReader inputReader = new InputStreamReader(input);
			BufferedReader buffRead = new BufferedReader(inputReader);
			
			OutputStream osToClient = soc.getOutputStream();
			OutputStreamWriter Write2client = new OutputStreamWriter(osToClient);
					
			BufferedWriter buffWrite = new BufferedWriter(Write2client);
			
			// lấy chuỗi từ bàn phím
			Scanner banphim = new Scanner(System.in);
			while(true) {
				System.out.println("\nClient gửi messenger:  ");
				String chuoiGui = banphim.nextLine();
				// gửi đi nếu chuỗi không đúng -> in ra Bye!!!
				buffWrite.write(chuoiGui+ "\n");
				buffWrite.flush();
				// nhận về
				String chuoiNhan = buffRead.readLine();
				System.out.println("Server: "+chuoiNhan);
				if(chuoiGui.equals("Bye!!!")); break;
			}
			soc.close();
//			System.out.println(buffRead.readLine());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
