package bai4;

public class Knight {
	private int HP;
	private int MP;
	private int armor;
	public Knight() {
		HP = 150;
		MP = 100;
		armor = 20;
	}
	public boolean dead() { //ktra xem con HP khong
		if (HP <= 0) return true;
		return false;
	}
	public boolean checkMP() { //ktra xem con MP khong
		if (MP <= 0) return true;
		return false;
	}
	public void get_dame(int x) {
		HP-=(x-armor);
	}
	public int hit() {
		return 40;
	}
	public int shield(Monsters x) {
		//Mất 50 MP để sự dụng, gây 100 sát thương và giảm giáp đối phương đi 30
		MP-=50;
		return 100+30;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		MP = mP;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public void show_infor() {
		System.out.println("Knight's HP: "+HP);
		System.out.println("Knight's MP: "+MP);
		System.out.println("Knight's armor: "+armor);
		System.out.println("-------------HERO SKILL-------------");
		System.out.println(0+"- Attack(dame = 40, mana = 0, arp = 0");
		System.out.println(1+"- Shield(dame = 100, mana = 50, arp = 30");
	}
	@Override
	public String toString() {
		return "Knights [HP=" + 150 + ", MP=" + 100 + ", armor=" + 20 + "]";
	}
}
