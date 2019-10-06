package bai07;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so thu nhat: ");
		float x = input.nextFloat();
		System.out.print("Nhap so thu hai: ");
		float y = input.nextFloat();
		float max = (x > y)?x:y;
		float min = (x < y)?x:y;
		System.out.println("max: "+ max + "\tmin: "+ min);
	}

}
