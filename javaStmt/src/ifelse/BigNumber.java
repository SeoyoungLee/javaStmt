package ifelse;

/*class BigNumber({})-메모리영역*/
class BigNumber {
	// public BigNumber() {}

	private int a, b, c, big;

	public int getBigNum(int a, int b, int c) {

		big = 0;
		this.a = a;
		this.b = b;
		this.c = c;

		if (a > big) {
			big = a;
		}
		if (b > big) {
			big = b;
		}
		if (c > big) {
			big = c;
		}

		return big;

	}

	@Override
	public String toString() {
		return "[가장 큰 수=" + big + "]";
	}

}