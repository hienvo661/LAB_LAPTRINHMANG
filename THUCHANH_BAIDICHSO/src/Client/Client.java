/**
 * 
 */
package Client;

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
			Socket soc = new Socket("localhost",9999);
			System.out.print("Conected!\n");
			
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);

			OutputStream osToClient = soc.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2Client);
			
			Scanner banPhim = new Scanner(System.in);
			//=====THIẾT KẾ GIAO THỨC ======

			while(true) {
				System.out.print("\nClient:");
				String chuoiGui = banPhim.nextLine();
				buffW.write(chuoiGui+"\n");
				buffW.flush();
				String chuoiNhan = buffR.readLine();
				System.out.print("Server: "+ chuoiNhan);
				if(chuoiGui.equals("10"));
				
				if(chuoiGui.equals("0")) break;
			}
//			soc.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
