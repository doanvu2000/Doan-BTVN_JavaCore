package bai2;

public class MayTinh {
	public float TinhTong(float a, float b) {
		return a+b;
	}
	public float TinhTong(float a, float b,float c) {
		return a+b+c;
	}
	public float TinhTong(float a[]) {
		float result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
