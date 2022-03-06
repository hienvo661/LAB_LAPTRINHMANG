import java.util.Scanner;

/**
 * 
 */

/**
 * @author hienv
 *
 */
public class BAI4 {
	static String Hoten;
	static double DTB;
	public void nhap() 
	{
		Scanner banphim = new Scanner(System.in);
		System.out.println("Nhập vào họ và tên: ");
		Hoten = banphim.nextLine();
		
		System.out.println("Điểm trung bình: ");
		DTB = banphim.nextDouble();
		
	}
	public void xuat() 
	{
		System.out.println("\n ----------------------");
		System.out.printf("Họ và tên sinh viên: %s \nĐiểm trung bình: %f \nHọc lực: %s", Hoten, DTB, xeploai());
	}
	public String xeploai()
	{
		if (DTB >= 9 )
			return "Xuất sắc";
		else 
			return "Giỏi";
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BAI4 sv = new BAI4();
		sv.nhap();
		sv.xuat();
		sv.xeploai();
	}

}
