import java.util.Scanner;

/**
 * 
 */

/**
 * @author hienv
 *
 */
public class BAI4 {

	static int a,b,c;
	static float delta;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nhập từ bàn phím abc
		Scanner banphim = new Scanner(System.in);
		System.out.println("Nhập a: ");
		a = banphim.nextInt();
		System.out.println("Nhập b: ");
		b = banphim.nextInt();
		System.out.println("Nhập c: ");
		c = banphim.nextInt();
		// tính toán
		delta = (int) Math.pow(b,2) - 4*a*c;
		System.out.println("Delta:" +delta + "\nCăn bậc 2 của delta là: " +Math.sqrt(delta));
	}

}
