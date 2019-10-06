package bai09;

import java.util.Scanner;

public class Main09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Giai phuong trinh ax+b=0");
		System.out.print("nhap a = ");
		float a = input.nextFloat();
		System.out.print("nhap b = ");
		float b = input.nextFloat();
		if (a == 0) {
			if(b ==0) {
				System.out.println("Phuong trinh co vo so nghiem");
			}
			else System.out.println("Phuong trinh vo nghiem");
		}
		else {
			System.out.println("Phuong trinh co 1 nghiem: "+(-b/a));
		}
	}
}
