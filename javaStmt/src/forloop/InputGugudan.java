package forloop;

public class InputGugudan {
	int num;

	public void setNum(int num) {
		this.num = num;
		
		
	}
	
	public void getGugudan(){
		if(num<=0){
			System.out.println("잘못된값. 종료합니다.");
			return; //이 메소드를 종료시켜라
		}
		for (int i = 1; i <10; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}	

}
