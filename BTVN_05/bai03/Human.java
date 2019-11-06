package bai03;

public class Human {
	// bài 3
	private String name;
	private int HP = 100;
	private int MP = 100;
	private int dame;
	int count = 0;
	public void attack(Human x) {
		dame = (int) (Math.random() * 20);
		x.dame = (int) (Math.random() * 15);
			for (int i = 1; i <= 4 && x.getHP() > 0; i++) {
				x.setHP(x.getHP() - dame);
				count++;
				System.out.println("==============Lượt đánh thứ " + count + "==============");
				System.out.print("HP " + name + ": " + HP);
				System.out.println("\t==vs==\tHP " + x.getName() + ": " + x.getHP());
				if (HP <= 0) {
					System.out.println(x.getName() + " chiến thắng");
					return;
				}	
				else if(x.getHP()<=0){
					System.out.println(name + " chiến thắng");
					return;
				}
			}
				
			for (int i = 1; i <= 5 && HP > 0; i++) {
				HP -= x.dame;
				count++;
				System.out.println("==============Lượt đánh thứ " + count + "==============");
				System.out.print("HP " + name + ": " + HP);
				System.out.println("\t==vs==\tHP " + x.getName() + ": " + x.getHP());
				if (HP <= 0) {
					System.out.println(x.getName() + " chiến thắng");
					return;
				}	
				else if(x.getHP()<=0){
					System.out.println(name + " chiến thắng");
					return;
				}
			}
		if (HP > x.getHP()) System.out.println(name + " chiến thắng");
		else if (x.getHP()>HP) System.out.println(x.getName() + " chiến thắng");
		else System.out.println("Hai người hòa nhau");
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
