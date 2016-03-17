package switchcase;

public class Pass {
	private String name, pass, result;
	private int java, jsp, sql, spring, sum, avg;

	public Pass(String name, int java, int jsp, int sql, int spring) {
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.sql = sql;
		this.spring = spring;
	}

	public void setSum() {
		sum = java + jsp + sql + spring;
	}

	public void setAvg() {
		avg = sum / 4;
	}

	public String setPass() {
		switch (avg / 10) {
		case 10: case 9:case 8:case 7:case 6:
			pass = "합격";
			break;
		case 5:case 4:case 3:case 2:case 1:case 0:
			pass = "불합격";
			break;
		default:
			break;
		}
		
		return result = name+"\t"+java+"\t"+jsp+"\t"+sql+"\t"+spring+"\t"+sum+"\t"+avg+"\t"+pass;
		
	}
}
