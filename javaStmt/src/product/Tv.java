package product;

public class Tv extends Product {
	protected String picture, screen;

	public void setTvInfo(String company, String name, String serialNo, String picture, String screen) {
		super.setProductInfo(company, name, serialNo);
		this.picture = picture;
		this.screen = screen;
	}

	@Override
	public String dispaly() {
		// TODO Auto-generated method stub
		return "제조회사 : " + company + "\n제품명 : " + name + "\n고유번호: " + serialNo + "\n화질 : " + this.picture + "\n화면사이즈 : "
				+ this.screen;
	}

}
