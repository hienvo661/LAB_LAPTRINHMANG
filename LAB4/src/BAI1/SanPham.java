package BAI1;

import java.util.Scanner;

public class SanPham {
	String tenSP;
	double donGia, giamGia;
	//------------------------------------
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String sanpham) {
		this.tenSP = sanpham;
	}
	//-----------------------------------
	public double getDongia() {
		return donGia;
	}
	public void setDongia(double dongia) {
		this.donGia = dongia;
	}
	
	//------------------------------------
	// hàm tạo thứ nhất có 3 tham số
	public SanPham(String Ten_SP, double Gia_SP, double GiamGia_SP) {
		this.tenSP = Ten_SP;
		this.donGia = Gia_SP;
		this.giamGia = GiamGia_SP;
	}
	// hàm tạo thứ hai có 2 tham số 
	public SanPham(String Ten_SP, double Gia_SP) {
		this.tenSP = Ten_SP;
		this.donGia = Gia_SP;
		this.giamGia = 0;
	}
	
	
	//
	private double getThueNhapKhau() {
		return donGia*0.1;
	}
	//
	public void nhap() 
	{
		Scanner banphim = new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm: ");
		tenSP = banphim.nextLine();
		System.out.println("Nhập đơn giá: ");
		donGia = banphim.nextDouble();
		System.out.println("Nhập giảm giá: ");
		giamGia = banphim.nextDouble();
	}
	//
	public void xuat() 
	{
//		System.out.printf("Tên sản phẩm: %s \nĐơn giá: %f \nGiảm giá: %f \n Thuế nhập khẩu: %f", sanpham, dongia, giamgia, getThueNhapKhau());
		System.out.println("Tên sản phẩm: " +tenSP);
		System.out.println("Giá sản phẩm: " +String.valueOf(donGia));
		System.out.println("Giảm giá: " +String.valueOf(giamGia));
		System.out.println("Thuế nhập khẩu: " +String.valueOf(getThueNhapKhau()));
	}

}
