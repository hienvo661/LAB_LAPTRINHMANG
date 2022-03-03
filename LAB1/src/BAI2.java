import java.util.Scanner;

/**
 * 
 */

/**
 * @author hienv
 *
 */
public class BAI2 {

	/**
	 * @param args
	 */
	static int dai,rong, dientich, chuvi, canhnhonhat;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banphim = new Scanner(System.in);
		System.out.println("Mời bạn nhập chiều dài: ");
		dai = banphim.nextInt();
		System.out.println("Mời bạn nhập chiều rộng: ");
		rong = banphim.nextInt();
		// tính toán
		chuvi = (dai + rong)*2;
		dientich = (dai*rong);
		canhnhonhat = Math.min(dai, rong);
		// in ra màn hình 
		System.out.println("Chu vi hình chữ nhật: " +chuvi +"\nDiện tích hình chữ nhật: " +dientich +"\nCạnh nhỏ nhất :" +canhnhonhat);

	}

}
