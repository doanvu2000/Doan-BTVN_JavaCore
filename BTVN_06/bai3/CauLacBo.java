package bai3;

public class CauLacBo {
	private Leader A;
	private Support B;
	private Member C;
	public CauLacBo(Leader a, Support b, Member c) {
		super();
		A = a;
		B = b;
		C = c;
	}
	@Override
	public String toString() {
		return "CauLacBo:\n" +A.toString() + "\n" + B.toString() + "\n" + C.toString();
	}
	
}
