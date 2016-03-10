package whileloop;

import java.util.Scanner;

/**
 * @file:NumGolfMain.java
 * @author lsy
 * @date 2016. 3. 10.
 * @story 컴퓨터가 랜덤 생성한 숫자를 가장 빠른 횟수로 맞추는 게임
 */
public class NumGolfMain {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	NumGolfBean bean = new NumGolfBean();
	
	System.out.println("컴퓨터랜덤 수 발생");
	bean.setCom();
	while(true){
		
	System.out.println("숫자를 입력해주세요");
	bean.setPlayer(scan.nextInt());
	bean.setCount();
	if(bean.getPlayer()==bean.getCom()){
		bean.setFlag(true);
		System.out.println(bean.toString());
		break;
	}else{
		System.out.println("불일치");
	}
	
	}
	}
}
