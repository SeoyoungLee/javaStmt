package forloop;

public class InputSum {
	int num, sum;


	public void setSum(int num) {
		this.num = num;
		for(int i=1; i<=num; i++){
			sum +=i;
		}
		this.sum = sum;
		
	}

	@Override
	public String toString() {
		return "1부터 "+num+"까지의 합은 "+sum+"입니다.";
	}

	

}
