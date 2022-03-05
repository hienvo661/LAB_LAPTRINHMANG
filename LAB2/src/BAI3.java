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
		double sodien;
		Scanner banphim = new Scanner(System.in);
		System.out.println("Số điện= ");
		sodien = banphim.nextDouble();
		if (sodien>=50) {
			System.out.println("Số tiền: " +(sodien*1000));
		}
		else {
			System.out.println("Số tiền: "+(50*1000+(sodien-50)*1200));
			
		}
		

	}

}
