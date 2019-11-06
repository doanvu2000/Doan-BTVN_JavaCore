package Bai01;

import java.util.Scanner;

public class Student {
	private String maSV;
	private String name;
	private int age;
	private String lop;

	public void inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter MaSV: ");
		maSV = sc.nextLine();
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter Age:");
		age = sc.nextInt();
		System.out.print("Enter class: ");
		sc.nextLine();
		lop = sc.nextLine();
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	@Override
	public String toString() {
		return "maSV: " + maSV + ", name: " + name + ", age: " + age + ", lop: " + lop;
	}

}
