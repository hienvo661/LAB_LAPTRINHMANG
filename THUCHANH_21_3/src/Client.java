import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 
 */

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
			Socket soc = new Socket("localhost", 8888);
			System.out.println("Connect ..... ");
			// lấy luồng
			InputStream input = soc.getInputStream();
			InputStreamReader inputReader = new InputStreamReader(input);
			BufferedReader buffer = new BufferedReader(inputReader);
			System.out.println(buffer.readLine());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
