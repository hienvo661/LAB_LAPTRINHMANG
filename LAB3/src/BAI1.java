import java.util.Scanner;

/**
 * 
 */

/**
 * @author hienv
 *
 */
public class BAI1 {
	static int n;
	static boolean ok = true;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banphim = new Scanner(System.in);
		System.out.println("Nhập vào một số bất kì: ");
		n = banphim.nextInt();
	
		for (int i=2;i < n-1; i++)
		{
			if (n % i==0) 
			{
				ok = false;
				break;
			} 
			i++;
		}
		if (ok == true) 
		{
			System.out.println( "Số " +n+ " là số nguyên tố");
		}else {
			System.out.println("Số " +n+ " không phải là số nguyên tố ");
		}
		

	}

}
