package Bai_01;

public class RunMain {
	public static void main(String[] args) {
		Person DiepPig = new Person();
		Person KhanhDuck = new Person();
		DiepPig.setAge(20);
		DiepPig.setHobby("Anime + Lol");
		DiepPig.setName("Con lợn Điệp");
		DiepPig.setSex("Nữ");
		KhanhDuck.setAge(20);
		KhanhDuck.setHobby("solo với Ryze máy");
		KhanhDuck.setName("Giám đốc Khánh");
		KhanhDuck.setSex("Nữ");
		System.out.println(DiepPig.toString());
		System.out.println(KhanhDuck.toString());
	}
}
