package bai4;

public class Archers {
	private int HP;
	private int MP;
	private int armor;
	public Archers() {
		HP = 200;
		MP = 150;
		armor = 10;
	}
	public int hit() {
		return 30;
	}
	public int aim(Monsters x) {
		//Mất 30 MP , gây 100 sát thương và giảm giáp đối phương đi 10
		MP-=30;
		return 100+10;
	}
	public void get_dame(int x) {
		HP-=(x-armor);
	}
	public boolean dead() { //ktra xem con HP khong
		if (HP <= 0) return true;
		return false;
	}
	public boolean checkMP() { //ktra xem con MP khong
		if (MP <= 0) return true;
		return false;
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
		System.out.println("Archers HP: "+HP);
		System.out.println("Archers MP: "+MP);
		System.out.println("Archers armor: "+armor);
		System.out.println("-------------HERO SKILL-------------");
		System.out.println(0+"- Attack(dame = 30, mana = 0, arp = 0");
		System.out.println(1+"- Aim(dame = 100, mana = 30, arp = 10");
	}
	@Override
	public String toString() {
		return "Archers [HP=" + 200 + ", MP=" + 150 + ", armor=" + 10 + "]";
	}
	
}
