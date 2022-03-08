package BAI2;


import java.util.Arrays;
import java.util.Scanner;

public class SanPham {
	private double giaSP,GiamGia;
	private String tenSP;
	
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tensp) {
		this.tenSP = tensp;
	}
	public double getgiaSP() {
		return giaSP;
	}
	public void setGiaSP(double giasp) {
		// setter trong vùng giá cố định
		if (giasp < 1 || giasp > 10000) {
		    throw new IllegalArgumentException();
		  }
		 this.giaSP = giasp;
	}
	public double getGiamgia() {
		return GiamGia;
	}
	public double setGiamGia(double giamgia) {
		this.GiamGia = giamgia;
		return giaSP - GiamGia;
	}
	
//	private SanPham(String _tenSP, double _GiaSP,double _GiamGia) {
//		this.tenSP = _tenSP;
//		this.giaSP = _GiaSP;
//		this.GiamGia = _GiamGia;
//	}
//	public SanPham(String _tenSP, double _GiaSP) {
//		this.tenSP = _tenSP;
//		this.giaSP = _GiaSP;
//		this.GiamGia = 0;
//	}
	private double getThueNhapKhau() {
		return giaSP*0.1;
	}
	public double Hoadon() {
		return giaSP-GiamGia;
	}
	public void nhap() 
	{
		Scanner banphim = new Scanner(System.in);
		System.out.println("Nhập vào tên sản phẩm: ");
		tenSP = banphim.nextLine();
		
		System.out.println("Nhập giá sản phẩm : ");
		giaSP = banphim.nextDouble();
		
		System.out.println("Nhập giảm giá: ");
		GiamGia = banphim.nextDouble();
	}
	public void xuat() 
	{
		System.out.println("Tên sản phẩm: " +String.valueOf(tenSP)); // kiểu 1 dùng String.valueOf
		System.out.println("Giá sản phẩm: " +giaSP); //Kiểu 2 dùng trực tiếp
		System.out.println("Giảm giá: " +GiamGia);
		System.out.println("Thuế nhập khẩu: " +getThueNhapKhau());
		System.out.println("Thành tiền: " +Hoadon());
		System.out.println("------------------------------------");
	}
	
}
