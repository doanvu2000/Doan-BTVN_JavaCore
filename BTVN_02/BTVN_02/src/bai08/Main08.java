package bai08;

import java.util.Scanner;

public class Main08 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so thu nhat: ");
		float x = input.nextFloat();
		System.out.print("Nhap so thu hai: ");
		float y = input.nextFloat();
		System.out.print("Nhap so thu ba: ");
		float z = input.nextFloat();
		float max = Math.max(Math.max(x, y), z);
		float min = Math.min(Math.min(x, y), z);
		System.out.println("max: "+ max + "\tmin: "+ min);
		
	}

}
