package Bai_05;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		String str1 = sc.nextLine();
		System.out.print("b = ");
		String str2 = sc.nextLine();
		BigInteger A = new BigInteger(str1);
		BigInteger B = new BigInteger(str2);
		BigInteger C = A.add(B);
		System.out.println(C);
	}
	
}
