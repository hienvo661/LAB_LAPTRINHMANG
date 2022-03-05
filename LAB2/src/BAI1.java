import java.text.DecimalFormat;
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
	public static void main(String[] args) {
		int a, b;
		double nghiem;
		//DecimalFormat decimalFormat = new DecimalFormat("#.##");  // làm tròn đến 2 chữ số thập phân
		Scanner banphim = new Scanner(System.in);
		System.out.println("Nhập vào số a: ");
		a = banphim.nextInt();
		System.out.println("Nhập vào số b: ");
		b = banphim.nextInt();
		if (a==0) {
			if (b==0) {
				System.out.println("Phương trình này có vô số nghiệm.");
			}
			else {
				System.out.println("Phương trình vô nghiệm.");
				}
			}
		else {
			nghiem = (double) -b/a; //ép kiểu cho ra nghiệm chính xác 
			System.out.println("Phương trình có nghiệm x= " +nghiem);
		}
	}
}
