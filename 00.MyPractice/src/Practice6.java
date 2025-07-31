
public class Practice6 {

	public static void main(String[] args) {
		int a = 21;
		int b = 30;
		if (a > b) {
			System.out.println(" 21 > 30 -->  true");
		} else {
			System.out.println(" 21 > 30 --> false");
		}

		if (a < b) {
			System.out.println("21 < 30--> true");
		} else {
			System.out.println("21 < 30 --> false");
		}

		if (a == b) {
			System.out.println(" 21 == 30 --> true");
		} else {
			System.out.println(" 21 == 30 --> false");
		}

		if (a != b) {
			System.out.println(" 21 != 30 --> true");
		}

		int kor = 50;
		if (kor >= 90) {
			char grade = 'A';
			String msg = "참 잘했어요";
			System.out.println(" kor --> " + kor);
			System.out.println(" grade --> " + grade);
			System.out.println(" msg --> " + msg);
		}
		System.out.println(" kor --> " + kor);
		
		int no1 = 11;
		if ( no1 %2 == 0) {
			System.out.printf("%d 은 짝수 \n", no1);
		}else {
			System.out.printf("%d 은 홀수 \n", no1);
		}
		
		
		int no2 = 23452;
		if ( no2 % 4 == 0) {
			System.out.printf("%d 는 4의 배수 \n", no2);
		}else {
			System.out.printf("%d 는 4의 배수 아님 \n", no2);
		}
		
		int year = 2025;
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
			System.out.printf("%d는 윤년입니다.\n", year);
		}else  {
			System.out.printf("%d는 평년입니다.\n",year);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
