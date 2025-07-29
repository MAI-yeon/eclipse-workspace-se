import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");

		/*
		 * 키보드로부터 데이터를 입력받기 위해서 실행흐름 대기(blocking)
		 */

		String string = scanner.next();
		System.out.println("입력받은 문자열:" + string);
		System.out.println("정수를 입력하세요.");

		/*
		 * 키보드로부터 데이터를 입력받기 위해서 실행흐름 대기(blocking)
		 */

		int no = scanner.nextInt();
		System.out.println("입력받은 점수:" + no);

		/*
		 * 키보드로부터 데이터를 입력받기 위해서 실행흐름 대기(blocking)
		 */

		System.out.println("실수를 입력하세요");
		double d = scanner.nextDouble();
		System.out.println("입력받은 실수:" + d);

		System.out.println("국어 영어 수학 점수를 입력하세요.");
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();

		int tot = kor + eng + math;
		double avg = tot / 3.0;
		System.out.printf("%d %d %d %d %5.1f", kor, eng, math, tot, avg);

		scanner.close(); 
		/*
		 * 이걸 안쓰면 에러가 발생 -> scanner.close(); 
		 * 이렇게 하면 프로그램이 **System.in(키보드 입력)**을 열고 대기해요. 그런데 scanner.close();를 안 하면 이 입력
		 * 통로가 열린 채로 남아 있어요.
		 * 
		 * 이걸 방치하면:
		 * 
		 * 메모리 낭비
		 * 
		 * 자원 누수 (resource leak)
		 * 
		 * 나중에 입력을 다시 받을 때 오류
		 */

	}

}
