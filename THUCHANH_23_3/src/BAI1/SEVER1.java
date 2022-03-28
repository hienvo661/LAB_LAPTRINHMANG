/**
 * 
 */
package BAI1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author hienv
 *
 */
public class SEVER1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String chuoi,dau,c;
        int a ,b;
        int result = 0;

        ServerSocket server = new ServerSocket(1);
        System.out.println("Server is now already");
        Socket connectionSocket = server.accept();
        DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream());
        DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
        chuoi = inFromClient.readLine();
        String[] arr = chuoi.split(" ");
        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[1]);
        dau = arr[2];
        if (dau.equals("+")){
            result = a + b;
        }else if (dau.equals("-")){
            if (a>b){
                result = a-b;
            }else {
                result = b - a;
            }
        }else if (dau.equals("*")){
            result = a*b;
        }else if (dau.equals(("/"))){
            if (a>b){
                result=a/b;
            }else {
                result=b/a;
            }
        }
        c = String.valueOf(result);
        
        outToClient.writeBytes(c+'\n');
        inFromClient.close();
        outToClient.close();
        server.close();
    }

}

