package product;

public abstract class Product {
	protected String company, name, serialNo;


	public void setProductInfo(String company, String name, String serialNo) {
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
	}

	public abstract String dispaly(); // 추상메소드
	/* public abstract String dispaly(){}; //구상메소드 */

}
