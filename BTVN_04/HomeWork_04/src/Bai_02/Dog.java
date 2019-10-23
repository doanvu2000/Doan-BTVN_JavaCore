package Bai_02;

public class Dog {
	private String name;
	private int MP=100;
	public void InputName(String name) {
		this.name = name;
	}
	public void ShowMP() {
		System.out.println("MP: "+MP);
	}
	public void Bark () {
		System.out.println(name+" sủa");
		MP-=20;
	}
}
