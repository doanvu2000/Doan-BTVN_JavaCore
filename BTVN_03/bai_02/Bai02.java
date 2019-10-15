package bai_02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào 1 chuỗi: ");
		String str = sc.nextLine();
		int sum = 0;
		boolean check = false;
		for (int i = 0; i < str.length(); i++) {
			char k = str.charAt(i);
			if (k >= '1' && k <= '9') {
				sum += k - 48;
				check = true;
			}
		}
		if (check)
			System.out.println("Tổng các chữ số trong chuỗi: " + sum);
		else
			System.out.println("Trong chuỗi không có chữ số nào!");
	}
}
