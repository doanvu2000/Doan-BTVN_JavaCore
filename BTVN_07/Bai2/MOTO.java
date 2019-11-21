package Bai2;

public class MOTO extends VEHICLE{
	public int phanKhoi;

	public MOTO() {
		super();
	}

	public MOTO(String nhanHieu, String namSx, String brand, int phanKhoi) {
		super(nhanHieu, namSx, brand);
		this.phanKhoi = phanKhoi;
	}

	public int getPhanKhoi() {
		return phanKhoi;
	}

	public void setPhanKhoi(int phanKhoi) {
		this.phanKhoi = phanKhoi;
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
		return "MOTO [phanKhoi=" + phanKhoi + ", nhanHieu=" + nhanHieu + ", namSx=" + namSx + ", brand=" + brand + "]";
	}
	
}
