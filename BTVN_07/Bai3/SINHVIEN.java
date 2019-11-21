package Bai3;

public class SINHVIEN extends NGUOI{
	private String code;
	private String major;
	private int K;
	public SINHVIEN(String name, String birth, String country, String code, String major, int k) {
		super(name, birth, country);
		this.code = code;
		this.major = major;
		K = k;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getK() {
		return K;
	}
	public void setK(int k) {
		K = k;
	}
	@Override
	public String toString() {
		return "name:"+this.getName()+", birth: "+this.getBirth()+", country: "+
	this.getCountry()+", code:" + code + ", major:" + major + ", K" + K;
	}

}
