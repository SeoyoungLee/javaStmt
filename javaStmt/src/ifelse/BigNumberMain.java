package ifelse;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 * @file:BigNumber.java
 * @author lsy
 * @date 2016. 3. 11.
 * @story 입력된 3개의 숫자에서 가장 큰 수
 */
public class BigNumberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하세요.");


		BigNumber big = new BigNumber();
		
		
		System.out.println("가장 큰 수는 "+big.getBigNum(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())+"입니다.");
		
	}
}

/*class BigNumber({})-메모리영역*/

class BigNumber{
	// public BigNumber() {}
	public int getBigNum(int a, int b, int c){
		
		int big=0;
		
		if (a>big) {
			big=a;
		} 
		if(b>big) {
			big=b;
		}
		if(c>big){
			big=c;
		}
		
		return big;
		
	}
	
}