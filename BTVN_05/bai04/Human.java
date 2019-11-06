package bai04;


public class Human {
	// bài 4
	private String name;
	private float HP = 100;
	private float MP = 100;
	private float dame;
	int count = 0;

	public void attack(Human x) {
		dame = (float) (Math.random() * 20);
		x.dame = (float) (Math.random() * 15);
		while (HP > 0 && x.getHP() > 0) {
			for (int i = 1; i <= 4 && x.getHP() > 0; i++) {
				x.setHP(x.getHP() - dame);
				count++;
				System.out.println("\t=======Lượt đánh thứ " + count + "=======");
				System.out.print("HP " + name + ": " + HP);
				System.out.println("\tHP " + x.getName() + ": " + x.getHP());
				if (HP <= 0) {
					System.out.println(name+" đã chết, "+x.getName() + " chiến thắng");
					return;
				} else if (x.getHP() <= 0) {
					System.out.println(x.getName()+" đã chết, "+name + " chiến thắng");
					return;
				}
			}

			for (int i = 1; i <= 5 && HP > 0; i++) {
				HP -= x.dame;
				count++;
				System.out.println("\t=======Lượt đánh thứ " + count + "=======");
				System.out.print("HP " + name + ": " + HP);
				System.out.println("\tHP " + x.getName() + ": " + x.getHP());
				if (HP <= 0) {
					System.out.println(name+" đã chết, "+x.getName() + " chiến thắng");
					return;
				} else if (x.getHP() <= 0) {
					System.out.println(x.getName()+" đã chết, "+name + " chiến thắng");
					return;
				}
			}
		}

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

	public float getDame() {
		return dame;
	}

	public void setDame(float dame) {
		this.dame = dame;
	}
}
