package Bai3;

public class LopHoc {
	private String code;
	private String name;
	private String dayStart;
	private SINHVIEN svList[];
	private String teacher;
	
	public LopHoc(String code, String name, String dayStart, SINHVIEN[] svList, String teacher) {
		super();
		this.code = code;
		this.name = name;
		this.dayStart = dayStart;
		this.svList = svList;
		this.teacher = teacher;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDayStart() {
		return dayStart;
	}
	public void setDayStart(String dayStart) {
		this.dayStart = dayStart;
	}
	public SINHVIEN[] getSvList() {
		return svList;
	}
	public void setSvList(SINHVIEN[] svList) {
		this.svList = svList;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
}
