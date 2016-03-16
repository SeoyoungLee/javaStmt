package product;

public class SmartPhone extends Product{

	protected String camera, size;
	
	public void setSmartPhoneInfo(String company, String name, String serialNo,String camera, String size){
		super.setProductInfo(company, name, serialNo);
		this.camera = camera;
		this.size = size;
	}
	@Override
	public String dispaly() {
		// TODO Auto-generated method stub
		return "제조회사 : " + company + "\n제품명 : " + name + "\n고유번호: " + serialNo + "\n카메라화소:"+this.camera + "\n사이즈:" + this.size;
	}
	

}
