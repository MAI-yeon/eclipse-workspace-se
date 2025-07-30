import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int kor = scanner.nextInt();

		if (kor < 0 || kor > 100) {

			System.out.printf("%d는 유효한 점수가 아닙니다. \n", kor);

			

		}

		char hakjum = 'F';

		if (kor >= 90) {
			hakjum = 'A';
		} else if (kor >= 80) {
			hakjum = 'B';
		} else if (kor >= 70) {
			hakjum = 'C';
		} else if (kor >= 60) {
			hakjum = 'D';
		} else if (kor >= 50) {
			hakjum = 'F';

		}
		System.out.printf("학점은 %c 입니다. \n", hakjum);

		scanner.close();
	}

}