/**
 * 
 */
package BAI1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author hienv
 *
 */
public class CLIENT1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String a, b, dau, tong, send;
        String check = "Có";
        Socket ClientSocket = new Socket("Localhost", 1);

        DataInputStream inFromUser = new DataInputStream(System.in);
        DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream());
        DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream());
        do {
            try {

                System.out.print("nhap a:");
                a = inFromUser.readLine();
                System.out.print("nhap b:");
                b = inFromUser.readLine();
                System.out.print("nhap phep tinh:");
                dau = inFromUser.readLine();
                send = a + " " + b + " " + dau;

                outToServer.writeBytes(send + '\n');
            } catch (UnknownHostException e) {
                System.err.println("Server Not Found");
                System.exit(1);
            } catch (IOException e) {
                System.err.println("Cannot make a connection");
                System.exit(1);
            }


            tong = inFromServer.readLine();

            System.out.println("-> kết quả: " + tong);
            System.out.printf("Bạn muốn làm tiếp (Có/Không):");

            check = new Scanner(System.in).nextLine();

        }while (!check.equals("K"));

        outToServer.close();

        inFromServer.close();

        ClientSocket.close();
		
	}
}
