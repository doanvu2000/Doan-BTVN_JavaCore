package bai04;

public class Human {
	// bài 4
	private String name;
	private int HP = 100;
	private int MP = 100;
	private int dame;
	int count = 0;

	public void attack(Human x) {
		dame = (int) (Math.random() * 20);
		x.dame = (int) (Math.random() * 20);
		while (HP > 0 && x.getHP() > 0) {
			x.setHP(x.getHP() - dame);
			count++;
			System.out.println("==============Lượt đánh thứ " + count + "==============");
			System.out.print("HP " + name + ": " + HP);
			System.out.println("\t==vs==\tHP " + x.getName() + ": " + x.getHP());
			if (x.getHP() <= 0) {
				System.out.println(x.getName() + " đã chết, " + name + " chiến thắng");
				return;
			}
			HP -= x.dame;
			count++;
			System.out.println("==============Lượt đánh thứ " + count + "==============");
			System.out.print("HP " + name + ": " + HP);
			System.out.println("\t==vs==\tHP " + x.getName() + ": " + x.getHP());
			if (HP <= 0) {
				System.out.println(name + " đã chết, " + x.getName() + " chiến thắng");
				return;
			}
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getDame() {
		return dame;
	}

	public void setDame(int dame) {
		this.dame = dame;
	}
}
