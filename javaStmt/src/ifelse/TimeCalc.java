package ifelse;

public class TimeCalc {
	private int second, hour, minute;
	
	public TimeCalc(int second) {
		this.second = second;
	}
	
	public void setTime(){
		
		if (second >= 3600) {
			hour = second / 3600;
			second = second % 3600;
			minute = second / 60;
			this.second = second % 60;

		} else if (second >= 60) {
			minute = second / 60;
			this.second = second % 60;

		}
		
	}

	@Override
	public String toString() {
		return  hour + "시간 " + minute + "분 " + second + "초";
	}
	
	


}
