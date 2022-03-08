package BAI2;


import java.util.Scanner;

public class SanPham {
	double giaSP,GiamGia;
	String tenSP;
	
	public SanPham(String _tenSP, double _GiaSP,double _GiamGia) {
		this.tenSP = _tenSP;
		this.giaSP = _GiaSP;
		this.GiamGia = _GiamGia;
	}
	public SanPham(String _tenSP, double _GiaSP) {
		this.tenSP = _tenSP;
		this.giaSP = _GiaSP;
		this.GiamGia = 0;
	}
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
		System.out.println("Tên sản phẩm: " +tenSP);
		System.out.println("Giá sản phẩm: " +giaSP);
		System.out.println("Giảm giá: " +GiamGia);
		System.out.println("Thuế nhập khẩu: " +getThueNhapKhau());
		System.out.println("Thành tiền: " +Hoadon());
	}
	
}
