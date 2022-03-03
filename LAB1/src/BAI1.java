import java.util.Scanner;

/**
 * 
 */

/**
 * @author hienv
 *
 */
public class BAI1 {

	/**
	 * @param args
	 */
	static float a,b;
	static double DTB;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banphim = new Scanner(System.in);
		System.out.print("Mời nhập họ tên: ");
		String hoten = banphim.nextLine();
		// cách 1: nhập điểm trung bình bằng tay
//		System.out.print("Nhập điểm trung bình của bạn : ");
//		DTB = banphim.nextDouble();
//		System.out.println("Điểm trung bình của bạn là: " +DTB);
		// cách 2: nhập dữ liệu a,b để tính ĐTB
		System.out.println("Mời nhập số a : ");
		a = banphim.nextFloat();
		System.out.println("Mời nhập số b : ");
		b = banphim.nextFloat();
		DTB = (a+b)/2;
		System.out.print("Họ tên của bạn là: " +hoten + "\nĐiểm trung bình của bạn là: " +DTB);

	}
}