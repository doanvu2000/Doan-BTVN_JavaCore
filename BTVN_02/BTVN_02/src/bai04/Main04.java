package bai04;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so nguyen n: ");
		int n = input.nextInt();
		System.out.println("So nguyen vua nhap: "+n);
		System.out.print("Nhap so thuc m: ");
		double m = input.nextDouble();
		System.out.println("So thuc vua nhap: "+m);
		System.out.print("Nhap chuoi ky tu str: ");
		input.nextLine();
		String str = input.nextLine();
		System.out.println("Chuoi vua nhap: "+str);
	}
}
