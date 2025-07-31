
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
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalminute = (hour*60) + minute;
		System.out.println("총"+ totalminute +"분");
		
		
		System.out.println();
		
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: "+y);
		System.out.printf("x : %d, y : %d",x,y);
		
		System.out.println();
		
		int temp = x;
		x=y;
		y=temp;
		System.out.printf("x : %d, y : %d",x,y);
		
		
		int var1 = 0b1011;
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0xB3;
		
		System.out.println();
		
		System.out.println("var1 : "+ var1);
		System.out.println("var2 : "+ var2);
		System.out.println("var3 : "+ var3);
		System.out.println("var4 : "+ var4);
		
		System.out.println();
		
		
		
		
		
		
		
		
		
	
	
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
