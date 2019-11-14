package bai3;

import java.util.Arrays;

public class Support {
//	Support được định nghĩa như sau:
//
//		thuộc tính: tên, tuổi, tên các thành viên trong nhóm.
//		phương thức: Hiển thị thông tin
	private String name;
	private int age;
	private String listname[];
	public Support(String name, int age, String[] listname) {
		this.name = name;
		this.age = age;
		this.listname = listname;
	}
	@Override
	public String toString() {
		return "Support [name=" + name + ", age=" + age + ", listname=" + Arrays.toString(listname) + "]";
	}
	
}
