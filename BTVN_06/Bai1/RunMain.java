package Bai1;

public class RunMain {
	public static void main(String[] args) {
		Pick pick1 = new Pick();
		Pick pick2 = new Pick(3);
		Pick pick3 = new Pick("Diep");
		Pick pick4 = new Pick(100, 20);
		Pick pick5 = new Pick("Diep", 100, 20);
		System.out.println(pick1.toString());
		System.out.println(pick2.toString());
		System.out.println(pick3.toString());
		System.out.println(pick4.toString());
		System.out.println(pick5.toString());
	}
	
}
