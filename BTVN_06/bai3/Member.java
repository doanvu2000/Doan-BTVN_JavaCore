package bai3;

public class Member {
//	Member được định nghĩa như sau:
//
//		thuộc tính: tên, ngày hoạt động, số ngày nghỉ trong lớp.
//		phương thức: Hiển thị thông tin
	private String name;
	private int activedays;
	private int inactivitydays;
	public Member(String name, int activedays, int inactivitydays) {
		this.name = name;
		this.activedays = activedays;
		this.inactivitydays = inactivitydays;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", activedays=" + activedays + ", inactivitydays=" + inactivitydays + "]";
	}
	
}
