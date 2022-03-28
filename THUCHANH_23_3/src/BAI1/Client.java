/**
 * 
 */
package BAI1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
		double Numa=0; double Numb=0; 
		char kt;
		Scanner banphim = new Scanner(System.in);
		try {
			System.out.println("Client is connecting...");
			Socket socket = new Socket("localhost",8888);
			System.out.println("Client connected");
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			DataInputStream input = new DataInputStream(socket.getInputStream());
			while(true) {
				// truyền dữ liệu bằng flush
				System.out.println("Nhập vào số A: ");
				output.writeDouble(banphim.nextDouble());
				output.flush();
				System.out.println("Nhập vào số B: ");
				output.writeDouble(banphim.nextDouble());
				output.flush();
				// nhận
				System.out.println("Nhập phép toán (+, -, *, /): ");
//		        kt = banphim.next().charAt(0);
//		        String a=String.valueOf(Numa);
//		        String b=String.valueOf(Numb);
//		        String PT =String.valueOf(kt);

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}

}
