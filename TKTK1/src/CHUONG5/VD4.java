package CHUONG5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class VD4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* Copy nội dung của một file text đến file text khác*/
		int i;
		FileInputStream file;
		FileOutputStream copy;
		try
		{
			// open input file
			try
			{
				file = new FileInputStream("F:\\ECLIPSE\\Eclipse_Workspace\\LAB_LAPTRINHMANG\\TKTK1\\src\\CHUONG5\\test.txt");
			}
			catch(FileNotFoundException exc)
			{
				System.out.println("Input File Not Found");
				return;
			}
		// open output file
			try
			{
				copy = new FileOutputStream("F:\\ECLIPSE\\Eclipse_Workspace\\LAB_LAPTRINHMANG\\TKTK1\\src\\CHUONG5\\coppy_vd4.txt");
			}
			catch(FileNotFoundException exc)
			{
				System.out.println("Error Opening Output File"); 
				return;
			}
		}
		catch(ArrayIndexOutOfBoundsException exc)
		{
			System.out.println("Usage: CopyFile From To"); return;
		}
		// Copy File
		try
		{
			do{ 
			i = file.read();
			if(i != -1) copy.write(i);
			} while(i != -1);
		}
		catch(IOException exc)
		{
			System.out.println("File Error");
		}
			file.close(); 
			copy.close();
	}
		
}
