import java.util.Scanner;

public class SwitchUse {

	public static void main(String[] args) {

		/*
		 * 짝수,홀수판별후출력 대소문자 구분 없이 실행
		 */

		int num = 34;
		switch (num % 2) {
		case 0:
			System.out.println(num + "은 짝수입니다.");
			break;
		case 1:
			System.out.println(num + "은 홀수입니다.");
			break;
		}

		/*
		 * 입력되는 문자열에따라 게임캐릭터 이동
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("캐릭터 이동방향을 입력하세요 [ L/l(left), R/r(right), U/u(up), D/d(down) ]:");
		String direction = scanner.next();

		switch (direction) {
		case "L":
		case "l":
			System.out.println(" move left~");
			break;

		case "R":
		case "r":
			System.out.println(" move right~");
			break;

		case "U":
		case "u":
			System.out.println(" move up~");
			break;
		case "D":
		case "d":
			System.out.println(" move down~");
			break;
		default:
			System.out.println("nothing~");
			break;
		}scanner.close();

	}

}
