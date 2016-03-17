package forloop;

public class MaxMin {
	private int max, min;

	public void setMaxMin(int[] arr) {
		this.max = arr[0];
		this.min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}

		}

	}

	@Override
	public String toString() {
		return "[최대값=" + max + ", 최소값=" + min + "]";
	}
	

}
