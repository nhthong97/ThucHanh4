
public class HangHoa {
	//Phuong thuc public de thuc hien gan ,lay gia tri tu no
	private String tenHH;
	private double donGia;
	private double giamGia;
	
	//xây dựng các hàm khởi tạo
	//khởi tạo giá trị ban đầu cho các thuộc tính
	// được gọi khi ta khai báo.xin mới một đối tượng của lớp này
public HangHoa() {
	}

	public HangHoa(String tenHH,double donGia,double giamGia) {
		this.tenHH = tenHH;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public HangHoa(String tenHH,double donGia) {
		this.tenHH = tenHH;
		this.donGia = donGia;
		this.giamGia = 0;
}
	// xây dựng các setter(các phương thức gán dữ liệu  cho thuộc tính)
	void setTenHH(String tenHH) {
		this.tenHH = tenHH;
	}	
	void setDonGia(double donGia) {
		this.donGia = donGia;
	}	
	void setGiamGia(double GiamGia) {
		this.giamGia = giamGia;
	}	
	// xây dựng các getter
	String getTenHH() {
		return this.tenHH;
	}
	double getDonGia() {
		return this.donGia;
	}
	double getGiamGia() {
		return this.giamGia;
	}
}
