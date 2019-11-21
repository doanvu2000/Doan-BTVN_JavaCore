package Bai2;

public class OTO extends VEHICLE{
	public int soChoNgoi;
	public int dungTich;
	
	public OTO() {
		super();
	}
	
	public OTO(String nhanHieu, String namSx, String brand, int soChoNgoi, int dungTich) {
		super(nhanHieu, namSx, brand);
		this.soChoNgoi = soChoNgoi;
		this.dungTich = dungTich;
	}
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return super.getBrand();
	}
	@Override
	public String getNamSx() {
		// TODO Auto-generated method stub
		return super.getNamSx();
	}
	@Override
	public String getNhanHieu() {
		// TODO Auto-generated method stub
		return super.getNhanHieu();
	}
	@Override
	public void setBrand(String brand) {
		// TODO Auto-generated method stub
		super.setBrand(brand);
	}
	@Override
	public void setNamSx(String namSx) {
		// TODO Auto-generated method stub
		super.setNamSx(namSx);
	}
	@Override
	public void setNhanHieu(String nhanHieu) {
		// TODO Auto-generated method stub
		super.setNhanHieu(nhanHieu);
	}

	@Override
	public String toString() {
		return "OTO [soChoNgoi=" + soChoNgoi + ", dungTich=" + dungTich + ", nhanHieu=" + nhanHieu + ", namSx=" + namSx
				+ ", brand=" + brand + "]";
	}
	
}
