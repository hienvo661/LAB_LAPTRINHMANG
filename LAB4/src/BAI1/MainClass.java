package BAI1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham("COCA COLA", 19000, 20);
		SanPham sp2 = new SanPham("PEPSI", 18500);
		// nhập dữ liệu
		String ten = sp1.getTenSP(); 
		System.out.println("Tên sản phẩm: " +ten);
		sp1.setTenSP("number one");
		//-------------------------------
		
//		sp1.nhap();
//		sp2.nhap();
		// xuất dữ liệu
		sp1.xuat();
		sp2.xuat();
	}

}
