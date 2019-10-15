package Bai_03;

import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class Bai03 {
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static int[] a = new int[100];

	public static void menu() {
		System.out.println("=====================================================");
		System.out.println("\t1.Tạo và nhập mảng mới với n số nguyên");
		System.out.println("\t2.Hiển thị mảng vừa tạo");
		System.out.println("\t3.Thêm một phần tử vào vị trí thứ k");
		System.out.println("\t4.Xóa một phần tử ở vị trí thứ k");
		System.out.println("\t5.Đảo ngược mảng");
		System.out.println("\t6.Hiển thị số a[1] và các số chia hết cho a[1]");
		System.out.println("\t7.Thoát");
		System.out.println("=====================================================");
	}

	public static void main(String[] args) {
		int chose;
		menu();
		do {
			System.out.print("\tMời bạn nhập lựa chọn: ");
			chose = sc.nextInt();
			switch (chose) {
			case 1:
				function1();
				break;
			case 2:
				System.out.print("Mảng vừa tạo: ");
				function2();
				break;
			case 3:
				function3();
				break;
			case 4:
				function4();
				break;
			case 5:
				function5();
				break;
			case 6:
				function6();
				break;
			case 7:
				System.out.println("Chương trình đã thoát");
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ");
				break;
			}
		} while (true);
	}

	public static void function1() {
		System.out.println("===Nhập mảng n số nguyên===");
		System.out.print("Nhập n: ");
		n = sc.nextInt();
		a = new int[n + 100];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

	}

	public static void function2() {
		if (n == 0) {
			System.out.print(" Mảng không có phần tử nào\n");
			return;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void function3() {
		System.out.println("=====Thêm 1 phần tử vào vị trí k===");
		System.out.print("Nhập phần tử cần thêm: ");
		int x = sc.nextInt();
		System.out.print("Nhập vị trí cần thêm: ");
		int k = sc.nextInt();
		if (k < 0 || k > n) {
			System.out.println("Vị trí chèn không hợp lệ");
			return;
		}
		for (int i = n; i >= k + 1; i--) {
			a[i] = a[i - 1];
		}
		a[k] = x;
		n++;
		System.out.print("Mảng sau khi chèn: ");
		function2();
	}

	public static void function4() {
		System.out.print("Nhập vị trí cần xóa: ");
		int k = sc.nextInt();
		if (k < 0 || k > n) {
			System.out.println("Vị trí xóa không hợp lệ");
			return;
		}
		for (int i = k; i < n; i++) {
			a[i] = a[i + 1];
		}
		n--;
		System.out.print("Mảng sau khi xóa: ");
		function2();
	}

	public static void function5() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		System.out.print("Mảng sau khi đảo: ");
		function2();
	}

	public static void function6() {
		System.out.println("a[1] = " + a[1]);
		System.out.println("Các phần tử chia hết a[1]: ");
		for (int i = 0; i < n; i++) {
			if (a[i] % a[1] == 0)
				System.out.print(a[i] + " ");
		}
	}
}
