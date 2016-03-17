package ifelse;

public class Gender {
	private String name, ssn, gender;
	private char flag;
	
	public void setInfo(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	public void setGender(){
		flag = ssn.charAt(7);
		
		if(flag=='1'||flag=='3'){
			gender="남자";
		}else if(flag=='2'||flag=='4'){
			gender="여자";
			
		}else if(flag=='5'||flag=='6'){
			gender="외국인";
		}
	}

	@Override
	public String toString() {
		return name+"님은 "+gender+"입니다.";
	}
	

}
