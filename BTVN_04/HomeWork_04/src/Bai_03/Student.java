package Bai_03;

import java.util.Scanner;

public class Student {
	private String name;
	private String code;
	private int age;
	static Scanner sc = new Scanner(System.in);

	public void InputInfo() {
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter code: ");
		code = sc.nextLine();
		System.out.print("Enter age: ");
		age = sc.nextInt();
		String str = sc.nextLine();
	}

	public void ShowInfo() {
		System.out.println("name: " + name + ", code: " + code + ", age: " + age);
	}
}
