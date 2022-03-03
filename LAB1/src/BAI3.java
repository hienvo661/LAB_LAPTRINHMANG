import java.util.Scanner;

/**
 * 
 */

/**
 * @author hienv
 *
 */
public class BAI3 {

	static int a, thetich, Sxq, Stp;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banphim = new Scanner(System.in);
		System.out.println("Nhập cạnh khối lập phương: ");
		a = banphim.nextInt();
//		thetich = a*a*a;
		thetich = (int) Math.pow(a,3);
		// diện tích xung quanh
		Sxq = (int) (4*Math.pow(a,2));
//		Sxq = (int) a*a*4;
		// diện tích toàn phần
		Stp = (int) (6*Math.pow(a,2));
		System.out.println("Thế tích khối lập phương là: " +thetich + "\nDiện tích xung quanh: " +Sxq + "\nDiện tích toàn phần: " +Stp);
	}

}
