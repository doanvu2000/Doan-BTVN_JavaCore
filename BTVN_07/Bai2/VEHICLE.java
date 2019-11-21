package Bai2;

public class VEHICLE {
	public String nhanHieu;
	public String namSx;
	public String brand;
	public VEHICLE() {
	}
	
	public VEHICLE(String nhanHieu, String namSx, String brand) {
		super();
		this.nhanHieu = nhanHieu;
		this.namSx = namSx;
		this.brand = brand;
	}

	public String getNhanHieu() {
		return nhanHieu;
	}
	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}
	public String getNamSx() {
		return namSx;
	}
	public void setNamSx(String namSx) {
		this.namSx = namSx;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
