import java.util.Scanner;

/**
 * 
 */

/**
 * @author hienv
 *
 */
public class BAI4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------");
		System.out.println("---- 1. Giải phương trình bật nhất -----");
		System.out.println("---- 2. Giải phương trình bật hai  -----");
		System.out.println("---- 3. Tính tiền điện  ----------------");
		System.out.println("---- 4. Thoát chương trình -------------");
		System.out.println("----------------------------------------");
		System.out.println("Chọn chức năng: ");
		Scanner banphim = new Scanner(System.in);
		int chon = banphim.nextInt();
		switch(chon) {
		case 1: 
			BAI1.main(args);
			break;
		case 2: 
			BAI2.main(args);
			break;
		case 3: 
			BAI3.main(args);
			break;
		case '4' : 
			System.exit(0);
			
			break;
		}
		System.out.println("Tạm Biệt Và Hẹn Gặp Lại!!!");
		
	}
}
