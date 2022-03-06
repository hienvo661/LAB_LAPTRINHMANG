/**
 * 
 */

/**
 * @author hienv
 *
 */
public class BAI2 {
	static int x,i;
	static int ketqua;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (x=2;x<=9;x++)
		{
			for(i=1;i<=10;i++) {
				ketqua = x * i;
				System.out.printf("%d x %d = %d \n", x, i, ketqua);
			}
			
		}

	}

}
