package Bai1;

public class Pick {
	private String name;
	private int weight;
	private int age;

	public Pick() {
	}

	public Pick(String name, int weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}

	public Pick(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Pick(int weight, int age) {
		this.weight = weight;
		this.age = age;
	}

	public Pick(String name) {
		this.name = name;
	}

	public Pick(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pick [name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}
	
}
