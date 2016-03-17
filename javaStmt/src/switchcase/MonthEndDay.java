package switchcase;

public class MonthEndDay {
	private int month, endDay;
	private String msg;
	
	
	
	public String findEndDay(int month){
		this.month = month;
		
		switch (month) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: 
		case 12: endDay=31; break;
		
		case 4: case 6:case 9: 
		case 11: endDay=30; break;
		
		case 2: endDay=29; break;
		
		
		default:
			return msg = "잘못된 값";
			
		}
		return msg = month+"는"+endDay+"가 말일입니다.";
	}
	

}
