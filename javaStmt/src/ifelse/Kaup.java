package ifelse;

public class Kaup {
	// 속성영역 : filed
	private String name;
	private int kaup;
	private double height, weight;
	private String result;
	// kaup = (int) (weight/(height*height)*10000);

	// ALT SHIFT S R

	// 기능영역 : area
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public double getHeight() {
		return height;
	}

	
	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	

	public int getKaup() {
		return kaup;
	}

	public void setKaup() {
		this.kaup =  (int) (weight/(height*height)*10000);
	}

	public String getResult() {
		
		return result;
	}

	public void setResult() {
		setKaup();
		String tmp="";
		
		if (kaup > 30) {
			tmp = "비만";
		} else if (kaup >= 24) {
			tmp = "과체중";
		} else if (kaup >= 20) {
			tmp = "정상";
		} else if (kaup >= 15) {
			tmp = "저체중";
		} else if (kaup >= 13) {
			tmp = "마름";
		} else if (kaup > 10) {
			tmp = "영양실조";
		} else {
			tmp = "소모증";
		}
		this.result = tmp;
	}

	@Override
	public String toString() {
		return "카우푸지수 [이름=" + name + ", 결과=" + result + "]";
	}
	
	
}
