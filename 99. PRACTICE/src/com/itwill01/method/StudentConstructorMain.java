package com.itwill01.method;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		
		
		
	
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 대입메쏘드호출(3명)
		 */

		Student std1 = new Student();
		std1.setStudent(1,"연승문",98,85,66); 
		Student std2 = new Student(2, "연보라", 55, 85, 75);
		Student std3 = new Student(3, "연하늘", 78, 85, 80);
		
		
		
		
		

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
		 * 학생 student1 의 이름변경한후(이름변경메쏘드호출후) student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
	
		std1.setName("연핑크");
		
		std1.print();
		
		System.out.println();
	    System.out.println(">> 학생 std1의 총점데이터 : " + std1.getTot());
	    System.out.println(">> 학생 std1의 학점데이타 : " + std1.getGrade());
		
		
	
	
	
	
	}
	

}