package ifelse;

public class FirstGrade {
	private int aScore, bScore, cScore, big;
	private String aName, bName, cName, name;

	public void setInfo(String aName, int aScore, String bName, int bScore, String cName, int cScore) {

		this.aScore = aScore;
		this.bScore = bScore;
		this.cScore = cScore;

		this.aName = aName;
		this.bName = bName;
		this.cName = cName;
	}
	
	public void setBig(){
		if (aScore > big) {
			big = aScore;
		}
		if(bScore > big){
			big=bScore;
		}
		if(cScore > big){
			big=cScore;
		}
	}
	
	public void setName(){
		if (big==aScore) {
			name = aName;
		} else if(big==bScore){
			name = bName;
		}else if(big == cScore){
			name = cName;
		}
		
	}

	@Override
	public String toString() {
		return "1등은" + name +", "+big+ "점 입니다.";
	}
	
	

}
