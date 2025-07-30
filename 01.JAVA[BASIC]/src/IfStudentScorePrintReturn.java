
public class IfStudentScorePrintReturn {

	public static void main(String[] args) {

		/*
		 * 1. 입력되는 점수의 유효성을 체크 - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 실행흐름을 반환한다.
		 */

		int kor = 89;

		if (kor < 0 || kor > 100) {
			System.out.printf("%d는 유효한 점수가 아닙니다.", kor);

			/*
			 * return 문 = 현재 실행흐름을 JVM 에 반환한다.(프로그램 종료)
			 */
			return;
		}

		/*
		 * 2. 학점 계산 후 출력
		 */

		char hakjum = 'F';
		if (kor >= 90) {
			hakjum = 'A';

		} else if (kor >= 80) {
			hakjum = 'B';

		} else if (kor >= 70) {
			hakjum = 'C';

		} else if (kor >= 60) {
			hakjum = 'D';

		} else {
			hakjum = 'F';

		}
		System.out.printf("학점은 %c 입니다.", hakjum);
		
		

	}
}