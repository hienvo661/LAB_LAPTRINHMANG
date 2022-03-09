/**
 * 
 */
package CHUONG5;
import java.io.*;

/**
 * @author hienv
 *
 */
public class VD3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Hiển thị nội dung của một file tên test.txt lưu tại D:\test.txt
		int i;
		FileInputStream file;
		try
		{
		file = new FileInputStream("F:\\ECLIPSE\\Eclipse_Workspace\\LAB_LAPTRINHMANG\\TKTK1\\src\\CHUONG5\\test.txt");
		}
		catch(FileNotFoundException exc)
		{
		System.out.println("File Not Found"); return;
		}
		catch(ArrayIndexOutOfBoundsException exc)
		{
		System.out.println("Usage: ShowFile File"); return;
		}
		// read bytes until EOF is encountered
		do {
		i = file.read();
		if(i != -1) System.out.print((char) i);
		} while(i != -1);
		file.close();

	}

}
