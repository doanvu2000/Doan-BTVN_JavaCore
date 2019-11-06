package Bai02;

public class Knight {

	private String name;
	private float HP;
	private float MP;
	int count = 0;

	public void Heal() {
		count++;
		if (MP <= 50)
			System.out.print("Cảnh báo: Năng lượng dưới 50, nạp thêm thẻ garena 50k để thêm 10 mana!");
		else {
			HP += 30;
			MP -= 50;
			System.out.println("Lần " + count + ": HP: " + HP + " MP: " + MP);
		}
	}

	public void show() {
		System.out.println("Knight: " + name + " HP: " + HP + " MP: " + MP);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHP() {
		return HP;
	}

	public void setHP(float hP) {
		HP = hP;
	}

	public float getMP() {
		return MP;
	}

	public void setMP(float mP) {
		MP = mP;
	}

}
