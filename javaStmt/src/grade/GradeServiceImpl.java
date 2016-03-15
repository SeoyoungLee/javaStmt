package grade;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	//멤버 필드
	Vector<GradeBean> gradeList;
	
	public GradeServiceImpl() {
		 gradeList = new Vector<GradeBean>();
	}

	//멤버 메스드 에어리어
	@Override
	public void input(GradeBean grade) {
		//C : 성적표 등록 
		gradeList.add(grade);
		
	}

	@Override
	public Vector<GradeBean> getList() {
		//R : 성적표 리스트 출력

		return gradeList;
		
	}

	@Override
	public void getGradeByHak() {
		//R :성적표 조회(학번)
		
	}

	@Override
	public void getGrades() {
		//R :성적표 조회(이름)
		
	}

	@Override
	public void update() {
		//U :성적표 수정
		
	}

	@Override
	public void delete() {
		//D :성적표 삭제
		
	}

	@Override
	public void getCount() {
		//R : 카운트 조회
		
	}
	

	@Override
	public void getCountByName() {
		//R : 이름조회시 카운트 조회
		
	}

}
