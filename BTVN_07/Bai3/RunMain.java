package Bai3;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		SINHVIEN[] svList = new SINHVIEN[n];
		svList[0] = new SINHVIEN("Vũ Văn Doan", "20/12/2000", "VN", "111", "CNTT", 13);
		svList[1] = new SINHVIEN("Nguyễn Đức Điệp", "21/12/2000", "VN", "112", "CNTT", 13);
		svList[2] = new SINHVIEN("Hoàng Duy Khánh", "22/12/2000", "VN", "113", "CNTT", 13);
		svList[3] = new SINHVIEN("Nguyễn Anh Linh", "23/12/2000", "VN", "114", "CNTT", 13);
		svList[4] = new SINHVIEN("anh Sơn Nghiện", "20/12/2000", "VN", "211", "CNTT", 12);
		svList[5] = new SINHVIEN("anh Sờ guốt", "21/12/2000", "VN", "212", "CNTT", 12);
		svList[6] = new SINHVIEN("anh Tú xà phòng", "22/12/2000", "VN", "213", "CNTT", 12);
		svList[7] = new SINHVIEN("Đức Điệp", "20/12/2000", "VN", "011", "CNTT", 11);
		svList[8] = new SINHVIEN("Duy Khánh", "21/12/2000", "VN", "012", "CNTT", 11);
		svList[9] = new SINHVIEN("Anh Linh", "22/12/2000", "VN", "013", "CNTT", 11);
		LopHoc lh = new LopHoc("HIT01", "Java HIT", "23/09", svList, "anh Sơn nghiện");
		int dem = 0;
		for (int i = 0; i < svList.length; i++) {
			if(svList[i].getK() == 11) dem++;
		}
		System.out.println("Có "+dem+" sinh viên khóa 11");
		for (int i = 0; i < svList.length-1; i++) { //sort by K
			for (int j = i+1; j < svList.length; j++) {
				if(svList[i].getK() > svList[j].getK()) {
					SINHVIEN temp = svList[i];
					svList[i] = svList[j];
					svList[j] = temp;
				}
			}
		}
		System.out.println("\n\t>>>>>>>>>>>>Danh sách sinh viên lớp học "+lh.getName()+" theo khóa<<<<<<<<<<<\n");
		for (int i = 0; i < svList.length; i++) {
			System.out.println((i+1)+"."+svList[i].toString());
		}
	}
}
