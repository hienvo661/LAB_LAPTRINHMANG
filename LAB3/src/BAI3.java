import java.util.Arrays;
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
		int mang[] = new int[5];
		Scanner banphim = new Scanner(System.in);
		for(int i=0;i< mang.length;i++) 
		{
			System.out.printf("Nhập phần tử thứ %d: ", (i+1));
			mang[i] = banphim.nextInt();
			
		}
		System.out.println("Phần tử mảng " +Arrays.toString(mang));
		// Phương thức sort để sắp sếp mảng theo thứ tự 
		Arrays.sort(mang);
		System.out.println("Phần tử mảng sau khi sắp sếp " +Arrays.toString(mang));
		// hàm kiểm tra và tìm giá trị nhỏ nhất bằng biến Min
		int min = mang[0];
		for (int i=1;i < mang.length; i++)
		{
			min = Math.min(min, mang[i]);
		}
		System.out.println("Giá trị nhỏ nhất của mảng là: " +min);
		// tính tổng và tính trung bình
		int sum = 0, dem =0;
		for(int i=0; i < mang.length ; i++ ) 
		{
			if (mang[i] % 3 == 0) {
				sum += mang[i];
				dem++;
			}
		}
		float trungbinh = (float) sum/dem;
		System.out.println("Giá trị trung bình của biến là: " +trungbinh);
		
	}

}
