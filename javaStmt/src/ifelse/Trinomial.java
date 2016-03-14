package ifelse;

public class Trinomial {
	String name, result;
	int avg;

	public void setAvg(int kor, int eng, int math) {
		this.avg =(int)((kor+eng+math)/3);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setResult() {
		this.result = (avg >= 60) ? "합격" : "불합격";
	}

	@Override
	public String toString() {
		
		return  "["+name + "학생은 "+ result + "입니다.]";
	}

	
}
