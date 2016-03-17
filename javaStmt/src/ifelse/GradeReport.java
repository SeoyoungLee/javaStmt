package ifelse;

public class GradeReport {
	private String name, subject, grade;
	private int score;
	
	public GradeReport(String name, String subcect, int score) {
		this.name = name;
		this.subject = subcect;
		this.score = score;
	}

	public void setGrade() {
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else if (score >= 50) {
			grade = "E";
		} else if (score < 50) {
			grade = "F";
		}

	}

	@Override
	public String toString() {

		return name + "\t" + subject + "\t" + score + "\t" + grade;
	}

}
