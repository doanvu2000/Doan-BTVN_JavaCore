package bai10;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Giai phuong trinh ax^2 + bx + c = 0");
		System.out.print("nhap a = ");
		float a = input.nextFloat();
		System.out.print("nhap b = ");
		float b = input.nextFloat();
		System.out.print("nhap c = ");
		float c = input.nextFloat();
		if (a==0) {
			System.out.println("Khong phai PT bac 2");
		}else {
			float delta = b*b - 4*a*c;
			if (delta < 0) System.out.println("PT vo nghiem");
			else if(delta ==0){
				System.out.println("PT co nghiem kep: x1 = x2 = "+(-b/a/2));
			}
			else {
				System.out.println("PT co 2 nghiem phan biet: ");
				float x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
				float x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
				System.out.print("x1  = "+x1);
				System.out.print("\tx2  = "+x2);
			}
		}
	}
}
