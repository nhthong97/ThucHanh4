import java.util.Scanner;

public class SanPham {
	private String tenSP;
	private double donGia;
	private double giamGia;
	// 10% don gia
	public double getThueNhapKhau() {
		return donGia*0.1;
	}
	
	//hàm tạo đủ 3 tham số luôn
	public SanPham(String _tenSP,double _donGia,double _giamGia)
	{
		tenSP = _tenSP;
		donGia = _donGia;
		giamGia = _giamGia;
	}
	
	public SanPham(String _tenSP,double _donGia)
	{
		tenSP = _tenSP;
		donGia = _donGia;
		giamGia = 0;
	}
	
	
	//nhap du lieu
	public void nhap() {
		
		Scanner bp = new Scanner(System.in);
		
		System.out.println(" Nhập tên SP:");
		tenSP =  bp.nextLine();
		
		System.out.println(" Nhập giá SP:");
		donGia =  bp.nextDouble();
		
		System.out.println(" Nhập giá giảm SP:");
		giamGia =  bp.nextDouble();
		
	}
	//xuat du lieu
	public void xuat() {
		
		System.out.println("Ten SP:" + tenSP);
		System.out.println("Gia SP:" + String.valueOf(donGia));
		System.out.println("Giam gia SP:" + String.valueOf(giamGia));
		System.out.println("Thue nhap khau:" + String.valueOf(getThueNhapKhau()));
		//phương thức valueof chuyển đổi thành kiểu chuỗi
	
	}
}