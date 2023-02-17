package tuan01;

public class HinhChuNhat {
	public double chieuDai;
	public double chieuRong;
	
	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) throws Exception  {
		if (chieuDai >0) {
		this.chieuDai = chieuDai;
	}
		else throw new Exception (" Chieu dai phai lon hon 0");
		}
	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) throws Exception {
		if (chieuRong >0) {
		this.chieuRong = chieuRong;
	}
		else throw new Exception (" Chieu rong phai lon hon 0");
		}
	public HinhChuNhat() {
		
	}
	public HinhChuNhat(double chieuDai, double chieuRong) throws Exception {
		super();
		if (chieuDai >0) {
			this.chieuDai = chieuDai;
		}
			else throw new Exception (" Chieu dai phai lon hon 0");
			
		if (chieuRong >0) {
			this.chieuRong = chieuRong;
		}
			else throw new Exception (" Chieu rong phai lon hon 0");
			
}
	
	public double tinhChuvi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double tinhDientich() {
		return (getChieuDai()*getChieuRong());
	}
	public static void main(String[] args) throws Exception {
		HinhChuNhat h1 = new HinhChuNhat();
		h1.setChieuDai(5);
		h1.setChieuRong(4);
		System.out.println(" Chu vi HCN la: "+ h1.tinhChuvi());
		System.out.println(" Dien tich HCN la:"+h1.tinhDientich());

	}

}
