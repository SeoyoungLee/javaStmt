package forloop;

/**
 * @file:OddSum.java
 * @author lsy
 * @date 2016. 3. 10.
 * @story 1부터 10까지 홀수의 합
 */
public class OddSum {
	public static void main(String[] args) {

		int sum = 0, i=0;
		System.out.println("1번째방법");
		for (i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println();
		
		sum=0;
		System.out.println("2번째방법");
		for(i=1; i<=10; i+=2){
			
			sum+=i;
		}
		System.out.println(sum);
	}

}
