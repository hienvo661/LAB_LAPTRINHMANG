import java.util.Scanner;

/**
 * 
 */

/**
 * @author hienv
 *
 */
public class BAI3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sodien, tiendien;
		Scanner banphim = new Scanner(System.in);
		System.out.println("Số điện= ");
		sodien = banphim.nextFloat();
		if (sodien>=50) {
			tiendien = sodien*1000;
		}
		else {
			tiendien = 50 * 1000 + (sodien-50) *1200;
		}
		System.out.println("Tiền Điện= " +tiendien);

	}

}
