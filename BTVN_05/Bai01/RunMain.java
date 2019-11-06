package Bai01;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so thanh vien: ");
		int n;
		do {
			n = sc.nextInt();
			if (n<=0) System.out.print("so thanh vien phai lon hon 0,nhap lai: ");
		} while (n<=0);
		Student[] HITClub = new Student[n];
		for (int i = 0; i < HITClub.length; i++) {
			System.out.println("\t==Nhập thàn viên thứ "+(i+1)+" ==");
			HITClub[i] = new Student();
			HITClub[i].inputStudent();
		}
		System.out.print("Các thành viên của CLB: \n");
		for (int i = 0; i < HITClub.length; i++) {
			System.out.println((i+1)+"."+HITClub[i].toString());
		}
	}
}
