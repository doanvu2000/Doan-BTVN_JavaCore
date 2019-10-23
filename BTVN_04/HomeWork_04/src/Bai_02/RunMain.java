package Bai_02;

public class RunMain {
	public static void main(String[] args) {
		Dog Diep = new Dog();
		Diep.InputName("Điệp");
		for (int i = 1; i <= 3; i++) {
			Diep.Bark();
			Diep.ShowMP();
		}
	}
}
