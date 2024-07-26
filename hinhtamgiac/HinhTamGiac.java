package baitap1.hinhtamgiac;

public class HinhTamGiac {
	private double ma,mb,mc;
//	Constructor đủ tham số: nếu giá trị truyền có số âm hoặc nếu 3 giá trị không lập thành hình tam giác thì gán 3 thuộc tính bằng 0. 
	public HinhTamGiac(double ma, double mb, double mc) {
		if(ma <= 0 || mb <=0 || mc  <=0 || ma + mc < mb || ma + mb < mc || mb + mc < ma) {
			this.ma = this.mb = this.mc = 0;
		}else {
		this.ma = ma ;
		this.mb = mb;
		this.mc = mc; 
		}
	}

	
//	Constructor mặc định (không tham số).
	public HinhTamGiac() {
		super();
	}
//	Các phương thức getter/setter: nếu giá trị không hợp lệ thì không gán (giữ lại giá trị cũ). 
	public double getMa() {
		return ma;
	}

	public void setMa(double ma) {
		if(ma > 0) {
			this.ma = ma;
		}
	}

	public double getMb() {
		return mb;
	}

	public void setMb(double mb) {
		if(mb > 0) {
			this.mb = mb;
		}
	}

	public double getMc() {
		return mc;
	}

	public void setMc(double mc) {
		if(mc > 0) {
			this.mc = mc;
		}
	}
//Tinh Chu Vi
	public double tinhChuVi() {
		return ma + mb + mc;
	}
//Tinh Dien Tich
	public double tinhDienTich() {
		double p = tinhChuVi()/ 2;
		return Math.sqrt(p * (p - ma) * (p - mb) * (p -mc));
		
	}
//Kiem Tra Tam Giac
	public String kiemTraTamGiac() {
		if(ma <= 0 || mb <=0 || mc  <=0 || ma + mc < mb || ma + mb < mc || mb + mc < ma) {
			return "Khong phai tam giac !";
		}else if(ma == mb || ma == mc) {
			return "Tam giac can";
		}else if(ma == mb && mb == mc){
			return "Tam giac deu";
		}else{
		return "Tam giac thuong";
		}
}
	@Override
	public String toString() {
		return "Canh a = " + ma + ", Canh b = " + mb + ", Canh c = " + mc + "\n Loai tam giac : " + kiemTraTamGiac() + "\n Chu Vi = " + tinhChuVi() + "\n Dien Tich: " + tinhDienTich();
	}
	
}
