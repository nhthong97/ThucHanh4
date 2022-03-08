import java.util.Scanner;

public class ChuongTrinhChinh {

	public static void main(String[] args) {
		
		
	// khai bao,tao moi 2 doi tuong sp1 sp2
	//SanPham sp1 = new SanPham("DienThoai",10000,0.1);
	//SanPham sp2 = new SanPham("Laptop",250000);
	//nhap dulieu cho 2 dt
	//sp1.nhap();
	//sp2.nhap();
		
	HangHoa hh1 = new HangHoa();
	HangHoa hh2 = new HangHoa();
	
	//nhap du lieu cho cac thuoc tinh
	Scanner bp = new Scanner(System.in);
	System.out.println("-------");
	System.out.print("HH1: ten:");
	String tenHang = bp.nextLine();
	hh1.setTenHH(tenHang);
	
	System.out.print("HH1: gia:");
	hh1.setDonGia(bp.nextDouble());
	
	System.out.print("HH1: giamgia:");
	hh1.setGiamGia(bp.nextDouble());
	
	// xoa dem
	String s = bp.nextLine();
	System.out.println("----------");
	
	System.out.print("HH2: ten:");
	hh2.setTenHH(bp.nextLine());
	
	System.out.print("HH2: gia:");
	hh2.setDonGia(bp.nextDouble());
	
	System.out.print("HH2: giamgia:");
	hh2.setGiamGia(bp.nextDouble());
	
	
	//xuat dulieu cho 2 dt
	//sp1.xuat();
	//sp2.xuat();
	
	// xuat thong tin
	System.out.println("=====");
	System.out.println("Ten hh1:" + hh1.getTenHH());
	System.out.println("Gia hh1:" + hh1.getDonGia());
	System.out.println("Giam gia hh1:" + hh1.getGiamGia());
	System.out.println("Thue nhap khau hh1:" + hh1.getDonGia()*0.1);
	
	System.out.println("=====");
	System.out.println("Ten hh2:" + hh2.getTenHH());
	System.out.println("Gia hh2:" + hh2.getDonGia());
	System.out.println("Giam gia hh2:" + hh2.getGiamGia());
	System.out.println("Thue nhap khau hh2:" + hh2.getDonGia()*0.1);
}
}