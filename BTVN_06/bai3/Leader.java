package bai3;

public class Leader {
//	Leader được định nghĩa như sau:
//
//thuộc tính: tên, tuổi, số ngày lãnh đạo.
//phương thức: Hiển thị thông tin
	private String name;
	private int age;
	private int daywork;
	public Leader(String name, int age, int daywork) {
		this.name = name;
		this.age = age;
		this.daywork = daywork;
	}
	@Override
	public String toString() {
		return "Leader [name=" + name + ", age=" + age + ", daywork=" + daywork + "]";
	}
	
}
