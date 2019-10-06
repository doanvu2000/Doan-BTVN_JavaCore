package bai06;

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so nguyen n1: ");
		int n1 = input.nextInt();
		System.out.print("Nhap so nguyen m1: ");
		int m1 = input.nextInt();
		System.out.print("Nhap so thuc n2: ");
		float n2 = input.nextFloat();
		System.out.print("Nhap so thuc m2: ");
		float m2 = input.nextFloat();
		System.out.println("tong 2 so nguyen: " + " = "+(n1+m1));
		System.out.println("tong 2 so thuc" + " = "+(n2+m2));
		System.out.println("n1 + n2" + " = "+(n1+n2));
	}
}
