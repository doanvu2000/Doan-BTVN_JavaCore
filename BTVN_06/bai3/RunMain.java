package bai3;

public class RunMain {
	public static void main(String[] args) {
		Leader Son = new Leader("Son", 21, 42);
		String[] a = {"Điệp","Khánh","Linh"};
		Support Thu = new Support("Thụ", 21,a);
		Member Doan = new Member("Doan", 42, 1);
		CauLacBo HIT = new CauLacBo(Son, Thu, Doan);
		System.out.println(HIT.toString());
	}
}
