package Bai1;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số kỹ sư: ");
		int n = sc.nextInt();
		KYSU[] listKYSU = new KYSU[n];
		for (int i = 0; i < listKYSU.length; i++) {
			listKYSU[i] = new KYSU();
			System.out.println("===Nhập thông tin kỹ sư thứ "+(i+1)+"===");
			listKYSU[i].NHAP();
		}
		int max = listKYSU[0].year;
		for (int i = 0; i < listKYSU.length; i++) {
			if (listKYSU[i].year>max) {
				max = listKYSU[i].year;
			}
		}
		System.out.println("Kỹ sư tốt nghiệp gần đây nhất: ");
		for (int i = 0; i < listKYSU.length; i++) {
			if (listKYSU[i].year == max) {
				listKYSU[i].XUAT();
			}
		}
	}
}
