package forloop;

public class FactorOf5 {
	private int endNum, count, sum;

	public void setEndNumCountSum(int endNum) {
		this.endNum = endNum;
		for (int i = 1; i <= endNum; i++) {
			if (i % 5 == 0) {
				this.count++;
				this.sum += i;
			}
		}
	}
	@Override
	public String toString() {
		return "FactorOf5 [리미트값=" + endNum + ", 갯수=" + count + ", 합=" + sum + "]";
	}

}
