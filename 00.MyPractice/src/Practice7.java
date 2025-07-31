import java.util.Random;
import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int answer = random. nextInt(100) + 1; //1부터 100까지 무작위 숫자
		int guess;
		int attempts = 0;
		
		System.out.println("1 ~ 100사이의 숫자를 맞혀보자!");
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			guess = scanner.nextInt();
			attempts++;
			
			if(guess > answer) {
				System.out.println("Down");
			}else if(guess < answer) {
				System.out.println("Up");
			}else {
				System.out.println("정답!! 시도 횟수 : "+ attempts);
				break;
			}
		}
		
		scanner.close();

	}

}
