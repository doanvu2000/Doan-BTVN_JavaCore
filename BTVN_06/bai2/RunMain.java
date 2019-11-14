package bai2;

public class RunMain {
	public static void main(String[] args) {
		MayTinh computer = new MayTinh();
		System.out.println(computer.TinhTong(3.2f, -1.3f));
		System.out.println(computer.TinhTong(3.2f, -1.3f, 6.0f));
		float a[] = {1.1f,2.2f,3.3f};
		System.out.println(computer.TinhTong(a));
	}
}
