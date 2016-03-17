package switchcase;

public class Gender {
	private String name, ssn, gender, msg;
	private char flag;
	
	public void setInfo(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	public String setGender(){
		flag = ssn.charAt(7);
		switch (flag) {
		case '1':
			gender="남자";
			break;
		case '2':
			gender="여자";
			break;
		case '3':
			gender="남자";
			break;
		case '4':
			gender="여자";
			break;
		case '5':
			gender="외국인";
			break;
		case '6':
			gender="외국인";
			break;
		default:
			return msg ="잘못된 값";
		}
		return msg = name+"님은 "+gender+"입니다.";
	}
}
