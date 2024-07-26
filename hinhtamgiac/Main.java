package baitap1.hinhtamgiac;

public class Main {
	public static void main(String[] args) {
		HinhTamGiac[] tamGiac1 = new HinhTamGiac [2];
		tamGiac1[0] = new HinhTamGiac(3, 4, 5);
		tamGiac1[1] = new HinhTamGiac(2, 2, 2);
		tamGiac1[2] = new HinhTamGiac(5, 5, 3);	
		
		for (int i = 0; i < tamGiac1.length; i++) {
			System.out.printf("%-3d | %-7.2f | %-7.2f | %-7.2f | %-12s | %-6.2f | %-9.2f%n", i+1, tamGiac1[i].getMa(), tamGiac1[i].getMb(), tamGiac1[i].getMc(), tamGiac1[i].tinhChuVi(), tamGiac1[i].kiemTraTamGiac(), tamGiac1[i].tinhDienTich());
		}
	}
}