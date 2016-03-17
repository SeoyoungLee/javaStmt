package ifelse;

public class Pass {
	private String name, pass;
	private int java, jsp, sql, spring, sum;
	private double avg;

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

	public void setPass() {
		if (avg >= 60) {
			pass = "합격";
		} else {
			pass = "불합격";
		}
	}

	@Override
	public String toString() {
		return name + "\t" + java + "\t" + jsp + "\t" + sql + "\t" + spring + "\t" + sum + "\t" + avg + "\t" + pass;
	}

}
