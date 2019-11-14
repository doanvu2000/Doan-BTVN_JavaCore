package bai4;

public class Monsters {
	private int HP;
	private int armor;
	public Monsters() {
		HP = 500;
		armor = 20;
	}
	public int hit() {
		return 30;
	}
	public boolean dead() { //ktra xem con HP khong
		if (HP <= 0) return true;
		return false;
	}
	public void get_dame(int x) {
		HP = HP - x + armor;
	}
	
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public void show_infor() {
		System.out.println("Monsters HP: "+HP);
		System.out.println("Monsters armor: "+armor);
		System.out.println("-------------Monsters SKILL-------------");
		System.out.println(0+"- Attack(dame = 30, mana = 0, arp = 0");
	}
}
