import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		
		String string = scanner.next();
		System.out.println("입력받은 문자열 : " + string);
		System.out.println("정수를 입려하세요.");
		
		int no = scanner.nextInt();
		System.out.println("입력받은 점수 : " + no);
		
		System.out.println("실수를 입력하세요.");
		double d = scanner.nextDouble();
		System.out.println("입력받은 실수 : " + d );
		
		System.out.println("국어 영어 수학 점수를 입력하세요.");
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();
		
		int tot = kor + eng + math;
		double avg = tot/3.0;
		System.out.printf("%d %d %d %d %5.1f", kor, eng, math, tot, avg);
		
		scanner.close();
		
		
		
		
		


	}

}
