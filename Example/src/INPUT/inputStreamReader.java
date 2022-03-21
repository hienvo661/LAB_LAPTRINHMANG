/**
 * 
 */
package INPUT;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hienv
 *
 */
public class inputStreamReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader banphim = new InputStreamReader(System.in);
		System.out.println("Nhập vào 1 ký tự: ");
		int kt = banphim.read();
		System.out.println("Ký tự bạn vừa nhập vào là: " +(char)kt);
		
	}

}
