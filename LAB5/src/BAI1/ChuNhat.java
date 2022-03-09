package BAI1;

import java.util.Scanner;

public class ChuNhat {
	protected double dai, rong;
	
	public void tinhtoan() {
		Scanner banphim = new Scanner(System.in);
		dai = banphim.nextDouble();
		System.out.println("Nhập chiều dài: " +dai);
		rong = banphim.nextDouble();
		System.out.println("Nhập chiều rộng: " +rong);
		// tính chu vi
//		double (dai+rong)*2;
		
	}
	public void getchuvi(double daii, double rongg) {
		this.dai = daii;
		this.rong = rongg;
	}
	
	public void getDientich(double _dai, double _rong) {
		this.dai = _dai;
		this.rong = _rong;
	}
	public void xuat() {
		System.out.println("Chiều dài: " +String.valueOf(dai));
		System.out.println("Chiều rộng: "+String.valueOf(rong));
		System.out.println("Diện tích: ");
		System.out.println("Chu vi: ");
	}
}
