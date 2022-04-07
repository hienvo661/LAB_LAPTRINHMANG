/**
 * 
 */
package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @author hienv
 *
 */
public class Server extends Thread{
	Socket socketClient;
	int id = -1;
	

	public Server(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;	
	}
	
	// Gửi file
	void GuiFile(String tenFile) throws IOException{
		
		FileReader fr = new FileReader(tenFile);
		BufferedReader buffRead = new BufferedReader(fr);
		OutputStream osToClient = socketClient.getOutputStream();	
		OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
		BufferedWriter buffW = new BufferedWriter(write2Client);
		String line;
		while((line = buffRead.readLine()) != null) {
			buffW.write(line);
			buffW.flush();
		}
		fr.close();
		
	}
	@Override
	public void run() {
		try {
			System.out.print(socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			OutputStream osToClient = socketClient.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2Client);
		
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);
			while(true) {
				String chuoiNhan=buffR.readLine();
				System.out.print("\n"+chuoiNhan);
				
				if(chuoiNhan.equals("1")) {
					GuiFile("F:\\ECLIPSE\\Eclipse_Workspace\\LAB_LAPTRINHMANG\\KIEMTRA_DOCFILE\\src\\Server\\1.txt");
					buffW.write("\n");
					buffW.flush();
				}
				else if(chuoiNhan.equals("2")) {
					GuiFile("F:\\\\ECLIPSE\\\\Eclipse_Workspace\\\\LAB_LAPTRINHMANG\\\\KIEMTRA_DOCFILE\\\\src\\\\Server\\\\1.txt");
					buffW.write("\n");
					buffW.flush();
				}
				else if(chuoiNhan.equals("3")) {
					GuiFile("F:\\\\ECLIPSE\\\\Eclipse_Workspace\\\\LAB_LAPTRINHMANG\\\\KIEMTRA_DOCFILE\\\\src\\\\Server\\\\1.txt");
					buffW.write("\n");

					buffW.flush();
				}else if(chuoiNhan.equals("4")) {
					GuiFile("F:\\\\ECLIPSE\\\\Eclipse_Workspace\\\\LAB_LAPTRINHMANG\\\\KIEMTRA_DOCFILE\\\\src\\\\Server\\\\1.txt");
					buffW.write("\n");

					buffW.flush();
				}
				else if(chuoiNhan.equals("5")) {
					GuiFile("F:\\\\ECLIPSE\\\\Eclipse_Workspace\\\\LAB_LAPTRINHMANG\\\\KIEMTRA_DOCFILE\\\\src\\\\Server\\\\1.txt");
					buffW.write("\n");

					buffW.flush();
				}
				else if(chuoiNhan.equals("6")) {
					GuiFile("F:\\\\ECLIPSE\\\\Eclipse_Workspace\\\\LAB_LAPTRINHMANG\\\\KIEMTRA_DOCFILE\\\\src\\\\Server\\\\1.txt");
					buffW.write("\n");

					buffW.flush();
				}
				else if(chuoiNhan.equals("7")) {
					GuiFile("F:\\\\ECLIPSE\\\\Eclipse_Workspace\\\\LAB_LAPTRINHMANG\\\\KIEMTRA_DOCFILE\\\\src\\\\Server\\\\1.txt");
					buffW.write("\n");

					buffW.write(chuoiNhan+"\n");
					buffW.flush();
				}
				else if(chuoiNhan.equals("8")) {
					GuiFile("F:\\\\ECLIPSE\\\\Eclipse_Workspace\\\\LAB_LAPTRINHMANG\\\\KIEMTRA_DOCFILE\\\\src\\\\Server\\\\1.txt");
					buffW.write("\n");

				
					buffW.flush();
				}
				else if(chuoiNhan.equals("9")) {
					GuiFile("F:\\ECLIPSE\\\\Eclipse_Workspace\\\\LAB_LAPTRINHMANG\\\\KIEMTRA_DOCFILE\\\\src\\\\Server\\\\1.txt");
					buffW.write("\n");

					buffW.flush();
				}
				else if(chuoiNhan.equals("10")) {
					GuiFile("F:\\\\ECLIPSE\\\\Eclipse_Workspace\\\\LAB_LAPTRINHMANG\\\\KIEMTRA_DOCFILE\\\\src\\\\Server\\\\1.txt");
					buffW.write("\n");

					buffW.flush();
				}
			}
}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
	}
	
}

