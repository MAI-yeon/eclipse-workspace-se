package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/

		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();

		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 대입메쏘드호출(3명)
		 */

		std1.setStudent(1, "연바람", 98, 85, 66);
		std2.setStudent(2, "연보라", 55, 85, 75);
		std3.setStudent(3, "연하늘", 78, 85, 80);

		/*
		 학생총점,평균,평점 계산 메쏘드 호출(3명)
		 */

		std1.setTotal();
		std2.setTotal();
		std3.setTotal();

		std1.setAvg();
		std2.setAvg();
		std3.setAvg();

		std1.setGrade();
		std2.setGrade();
		std3.setGrade();
		
		
		std1.setRank();
		std2.setRank();
		std3.setRank();

		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */

		
		std1.headerPrint();
		std1.print();
		std2.print();
		std3.print();
		System.out.println("-----------------------------------------------");
		
		/*
		- 출력포맷
		- 평균은 소수점이하 첫째자리까지출력(반올림)
		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2
		 3   김경우   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/

	}

}