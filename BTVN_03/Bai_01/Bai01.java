package Bai_01;

import java.util.Scanner;

public class Bai01 {
	// in ra số lớn thứ 3 của dãy n số nguyên
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập n: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Nhập a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length - 1; i++) {// Sap xep mang giam dan
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int max1 = a[0], index = 0;
		while (index < a.length && a[index] == max1)
			index++;
		if (index == a.length)
			System.out.print("Không có số lớn thứ 3");
		else {
			int max2 = a[index];
			while (index < a.length && a[index] == max2)
				index++;
			if (index == a.length)
				System.out.print("Không có số lớn thứ 3");
			else
				System.out.println(a[index] + " là số lớn thứ 3 của mảng");
		}
	}

}
