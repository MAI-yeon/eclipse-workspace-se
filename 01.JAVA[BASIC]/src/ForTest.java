public class ForTest {

	public static void main(String[] args) {

		System.out.println("--------------while-------------");

		int k = 0;
		while (k < 10) {

			System.out.println("k =" + k);
			k++;
		}

		System.out.println("--------------for i 증가-------------");

		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);

		}
		
		System.out.println("--------------for i 감소-------------");
		for (int i = 9; i >= 0; i--) {
			System.out.println("i = " + i);
		}
		
		System.out.println(">> 홀수만출력[1~100]");
		
		for (int i = 1; i <= 100; i++) {
			if( i % 2 == 1)
				System.out.print(i+" ");
		}
		
		System.out.println();	
		
		System.out.println(">> 3의배수만출력[1~100]");
		
		for (int i = 1; i < 100; i++) {
			if(i % 3 == 0)
				System.out.print(i + "");
		}
		
		System.out.println();
		
		System.out.println(">> 3과4의 공통배수만출력[1~100]");
		for (int i = 1; i < 100; i++) {
			if( i % 3 == 0 && i % 4 == 0) {
				System.out.print(i+ " ");
			}
		
		}
		
		System.out.println();
		
		System.out.println(">> 3과4의 최소공배수만출력[1~100](break)");
		
		System.out.println(">> 4의 배수가출아닌수만출력[1~100](continue)");
		System.out.println(">> 영문소문자(continue)");
		System.out.println(">> 홀수,짝수합[1~100]");

		
	}

}


