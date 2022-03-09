/**
 * 
 */
package CHUONG5;

import java.io.IOException;
import java.io.*;

/**
 * @author hienv
 *
 */
public class VD1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// đọc mảng byte từ System.in
		
		byte mang[] = new byte[100];
		System.out.print("Nhập vào thông tin của bạn: ");
		System.in.read(mang);
		System.out.print("Thông tin của bạn là: ");
		for(int i = 0; i< mang.length;i++)
			{
			System.out.print((char)mang[i]);
			}
		

	}

}
