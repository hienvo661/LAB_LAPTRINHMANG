package BAI2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SanPham sp1 = new SanPham("Đậu", 1900, 50);
//		SanPham sp2 = new SanPham("Măng", 1800);
//		sp1.nhap();
//		sp2.xuat();
		// sử dụng getter - setter
		SanPham sp1 = new SanPham();
		sp1.setTenSP("Đậu đen");
//		System.out.println(sp1.getTenSP());
		sp1.setGiaSP(1900);
		sp1.setGiamGia(100);
//		System.out.println("Giá sản phẩm: " +sp1.getgiaSP());
		sp1.xuat();
	}

}
