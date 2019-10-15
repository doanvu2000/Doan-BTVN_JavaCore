package Bai_04;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String str = sc.nextLine();
		if (check(str))
			System.out.println("Yes");
		else System.out.println("No");
	}
	static boolean check(String s) {
		int h = s.indexOf('h');
		int e = s.indexOf('e',h+1);
		int l1 = s.indexOf('l',e+1);
		int l2 = s.indexOf('l',l1+1);
		int o = s.indexOf('o',l2+1);
		if (h > -1 && e >-1 && l1 >-1 && l2 >-1 && o >-1)
			return true;
		else return false;
	}
}
