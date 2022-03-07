import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author hienv
 *
 */
public class BAI4 {
	
	public static void XS_SinhVien(String sv[], float diemSV[]) 
	{
        for (int i = 0; i < sv.length - 1; i++) 
        {
            for (int j = i + 1; j < sv.length; j++) 
            {
                if (diemSV[i] > diemSV[j]) 
                {
                    float temp = diemSV[i];
                    diemSV[i] = diemSV[j];
                    diemSV[j] = temp;
                    String svTemp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = svTemp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String sv[] = new String[4];
        float diemSV[] = new float[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.printf("Nhập họ và tên cho sinh viên thứ %d : ", i + 1);
            sv[i] = scanner.nextLine();
            System.out.printf("Nhập điểm cho sinh viên thứ %d : ", i + 1);
            diemSV[i] = scanner.nextFloat();
            scanner.nextLine();
        }
        System.out.println("Mảng sinh viên: " + Arrays.toString(sv));
        System.out.println("Mảng điểm của sinh viên: " + Arrays.toString(diemSV));
        
        
        XS_SinhVien(sv, diemSV);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ho ten: " + sv[i]);
            System.out.println("Diem: " + diemSV[i]);
            if (diemSV[i] >= 9) {
                System.out.println("Học Lực: Xuất Xắc!");
            } else if (diemSV[i] >= 7.5) {
                System.out.println("Học Lực: Giỏi!");
            } else if (diemSV[i] >= 6.5) {
                System.out.println("Học Lực: Khá!");
            } else if (diemSV[i] >= 5) {
                System.out.println("Học Lực: Trung Bình!");
            } else {
                System.out.println("Học Lực: Yếu!");
            }
            System.out.println();
        }
    }
}