package Bai1;

import java.util.Scanner;

public class KYSU extends PERSON{
	public String major;
	public int year;
	public void NHAP() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên: ");
		this.name = sc.nextLine();
		System.out.print("Nhập ngành sinh: ");
		this.birth = sc.nextLine();
		System.out.print("Nhập quê quán: ");
		this.country = sc.nextLine();
		System.out.print("Nhập ngành học: ");
		this.major = sc.nextLine();
		System.out.print("Nhập năm tốt nghiệp: ");
		this.year = sc.nextInt();
	}
	public void XUAT() {
		System.out.print("Tên: "+this.name+"\tNgày sinh: "+this.birth+"\t"+"Quê: "+this.country);
		System.out.println("\tNgành: "+this.major+"\tNăm tốt nghiệp: "+this.year);
	}
}
