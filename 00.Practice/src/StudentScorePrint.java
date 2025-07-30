
public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언 - 번호, 이름, 국어, 영어, 수학, 총점, 평균,
		 * 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력
		 */

		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크 - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */

		/*
		 * - 출력포맷 - 평균은 소수점이하 첫째자리까지출력(반올림) - 석차는 구하지마세요 
		 * --------------학생성적출력------------------- 
		 * 학번 이름 국어 영어 수학 총점 평균 평점 석차
		 * ----------------------------------------------- 
		 * 1   김경호 42   56   78  334  34.8  A     3 
		 * 2   김경수 45   53   76  334  34.8  A     2 
		 * -----------------------------------------------
		 */

		

		int kor= 42;

		if (kor < 0 || kor > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다.", kor);
			return;

		}
		int eng= 56;

		if (eng < 0 || eng > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다.", eng);
			return;

		}
		int math= 78;

		if (math < 0 || math > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다.", math);
			return;

		}
		int kor1 = 45;

		if (kor1 < 0 || kor1 > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다.", kor1);
			return;

		}
		int eng1 = 53;

		if (eng1 < 0 || eng1 > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다.", eng1);
			return;

		}
		int math1 = 76;

		if (math1 < 0 || math1 > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다.", math1);
			return;

		}
		
		
		
		int studrntNumber = 1;
		String a = "김경호";
		int tot = kor + eng + math;
		double avg = tot/3.0;
		int rank = 0;
		int studrntNumber1 = 2;
		String a1 = "김경수";
		int tot1 = kor1 + eng1 + math1;
		double avg1 = tot1/3.0;
		int rank1 = 0;
		
		
		
		char GradePoint = 'F';
		if ( avg >= 90 && avg <= 100) {
			GradePoint = 'A';
		}else if (avg >= 80 && avg < 90) {
			GradePoint = 'B';
		}else if (avg >= 70 && avg < 80) {
			GradePoint = 'C';
		}else if (avg >= 60 && avg < 70) {
			GradePoint = 'D';
		}else {
			GradePoint = 'F';
		}
		
		char GradePoint1 = 'F';
		if ( avg1 >= 90 && avg1 <= 100) {
			GradePoint1 = 'A';
		}else if (avg1 >= 80 && avg1 < 90) {
			GradePoint1 = 'B';
		}else if (avg1 >= 70 && avg1 < 80) {
			GradePoint1 = 'C';
		}else if (avg1 >= 60 && avg1 < 70) {
			GradePoint1 = 'D';
		}else {
			GradePoint1 = 'F';
		}
		
		
		System.out.println("-----------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학  총점  평균 평점 석차");
		System.out.println("-------------------------------------------------");
		System.out.printf("%3d %4s %4d %4d %4d %5d %6.1f %3c %3d \n" , studrntNumber, a, kor, eng, math, tot, avg, GradePoint, rank);
		System.out.printf("%3d %4s %4d %4d %4d %5d %6.1f %3c %3d" , studrntNumber1, a1, kor1, eng1, math1, tot1, avg1, GradePoint1, rank1);
		

		  
		 
		 
		  
		
	}

}
