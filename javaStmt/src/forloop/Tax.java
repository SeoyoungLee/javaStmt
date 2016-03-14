package forloop;

public class Tax {
	String name;
	int num;
	double tax;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	
	public void setTax() {
		this.tax = num*0.1;
	}
	@Override
	public String toString() {
		return "연봉 " + num + "을 받으시는 " + name + "님께서 이번달 납부할 세금은 " + tax + "원입니다.";
	}
	

	
}
