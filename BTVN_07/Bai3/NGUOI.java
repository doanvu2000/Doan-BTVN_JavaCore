package Bai3;

public class NGUOI {
	private String name;
	private String birth;
	private String country;

	public NGUOI() {
	}

	public NGUOI(String name, String birth, String country) {
		this.name = name;
		this.birth = birth;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
