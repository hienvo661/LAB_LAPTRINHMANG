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
		double gia = sp1.getDongia();
		System.out.println("Giá sản phẩm: " +gia);
		sp1.setDongia(20000);
		
		
		String tensp2 = sp2.getTenSP(); 
		System.out.println("Tên sản phẩm: " +tensp2);
		sp2.setTenSP("strongbow");
		//-------------------------------
		double giasp2 = sp2.getDongia();
		System.out.println("Giá sản phẩm: " +giasp2);
		sp2.setDongia(20000);
		
		
//		sp1.nhap();
//		sp2.nhap();
		// xuất dữ liệu
		sp1.xuat();
		sp2.xuat();
	}

}
