import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {

		/*
		 * switch 문
		 * 
		 * - 형식
		 * 
		 * switch(변수){ 
		 * case 값_1: 
		 * stmt1; 
		 * break;
		 * 
		 * case 값_2: 
		 * stmt2; 
		 * break;
		 * 
		 * case 값_n: 
		 * stmt3; 
		 * break;
		 * 
		 * default: 
		 * stmt4; 
		 * break; }
		 * 
		 * switch(변수) 변수타입은 byte,short, *int, *char,String 값이올수있다.(long 은안됨)
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("게임레벨을 입력하세요(1~5 사이의 정수)");
		int level = scanner.nextInt(); 
		
		switch (level) {
		case 1:
			/*명령문 기술 위치*/
			System.out.println("초보");
			break; // switch 블록을 빠져나감
		case 2:
			System.out.println("중수");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("고수");
			break;
			
		default:
			System.out.println(">> 게임레벨은 1 ~ 5 사이의 정수입니다.");
			break;
			
			
			
		}
		
		scanner.close();

	}

}
