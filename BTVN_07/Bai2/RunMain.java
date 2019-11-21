package Bai2;

public class RunMain {
	public static void main(String[] args) {
		OTO oto = new OTO("Avedator", "2017", "Lambogini", 2, 300);
		MOTO moto = new MOTO("R15", "2016", "Ninja", 150);
		System.out.println(oto.toString());
		System.out.println(moto.toString());
	}
}
