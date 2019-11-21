package Bai1;

public class PERSON {
//	Xây dựng lớp PERSON gồm các thông tin: Họ và tên, Ngày sinh, Quê quán.
	public String name;
	public String birth;
	public String country;
	public PERSON() {
	
	}
	public PERSON(String name, String birth, String country) {
		super();
		this.name = name;
		this.birth = birth;
		this.country = country;
	}
	@Override
	public String toString() {
		return "PERSON [name=" + name + ", birth=" + birth + ", country=" + country + "]";
	}
	
}
