package baitap1.dangkyxe;

public class DangKyXe {
	private String chuXe;
	private String loaiXe;
	private double triGiaXe;
	private double dungTichXylanh;
	public DangKyXe() {
		super();
	}
	public DangKyXe(String chuXe, String loaiXe, double triGiaXe, double dungTichXylanh) {
		super();
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		this.triGiaXe = triGiaXe;
		this.dungTichXylanh = dungTichXylanh;
	}
	public double getTriGiaXe() {
		return triGiaXe;
	}
	public void setTriGiaXe(double triGiaXe) {
		if(triGiaXe >= 0)
			this.triGiaXe = triGiaXe;
		else {
			this.triGiaXe = 0;
		}
	}
	public double getDungTichXylanh() {
		return dungTichXylanh;
	}
	public void setDungTichXylanh(double dungTichXylanh) {
		if(dungTichXylanh >= 0) {
			this.dungTichXylanh = dungTichXylanh;
		}
		else {
			this.dungTichXylanh = 0;
		}
	}
	public String getChuXe() {
		return chuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
//ham tinh thue
	public double Thue() {
		if(dungTichXylanh < 100) {
			return triGiaXe * 0.01;
		}
		else if(dungTichXylanh >= 100 && dungTichXylanh <= 200) {
			return triGiaXe * 0.03;
		}
		else{
			return triGiaXe * 0.05;
		}
	}
	@Override
	public String toString() {
		return "Chu xe " + chuXe + ", Loai xe: " + loaiXe + ", Gia: " + triGiaXe + ", Dung Tich Xylanh: " + dungTichXylanh +", Thue: " + Thue();
	}
	
}

