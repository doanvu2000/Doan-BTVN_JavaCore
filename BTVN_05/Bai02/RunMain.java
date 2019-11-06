package Bai02;

public class RunMain {
	public static void main(String[] args) {
		Knight Doan = new Knight();
		Doan.setName("Doan");
		Doan.setHP(20);
		Doan.setMP(230);
		Doan.show();
		while (Doan.getMP() >= 50) {
			Doan.Heal();
		}
		System.out.println("MP của bạn <50, nạp thẻ garena 50k để có thêm mana chơi tiếp!");
	}
}
