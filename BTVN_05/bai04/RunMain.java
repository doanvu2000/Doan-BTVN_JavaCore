package bai04;

import java.util.Scanner;

public class RunMain {
	//bài 4
	public static void main(String[] args) {
		Human a = new Human();
		Human b = new Human();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên người chơi 1: ");
		a.setName(sc.nextLine());
		System.out.print("Nhập tên người chơi 2: ");
		b.setName(sc.nextLine());
		a.attack(b);
	}
}
