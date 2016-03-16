package product;

public class Computer extends Product {

	protected String cpu, ram, hdd;

	public void setComputerInfo(String company, String name, String serialNo, String cpu, String ram, String hdd) {
		super.setProductInfo(company, name, serialNo);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	@Override
	public String dispaly() {
		return "제조회사 : " + company + "\n제품명 : " + name + "\n고유번호: " + serialNo + "\nCPU : " + this.cpu + "\nRAM : "
				+ this.ram + "\nHDD :" + this.hdd;
		
	}
}
