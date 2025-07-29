
public class OperatorArithmatic {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result = 0;
		result = a + b;
		System.out.println("a + b-->" + result);
		result = a - b;
		System.out.println("a - b-->" + result);
 		result = a * b;
 		System.out.println("a * b-->" + result);
 		result = a / b;
 		System.out.println("a / b-->" + result); //???? - 연산시에 형변환
 		double dresult = a/b;
 		System.out.println("a / b-->" + dresult);
 		dresult = (double)a/b;
 		System.out.println("a / b-->" + dresult);
 		
 		
 		/*
 		 * 나머지 연산자 %
 		 */
 		
 		int number = 13;
 		result = number % 4; // 0,1,2,3
 		System.out.println("result 변수에는 4로 나눈 나머지값이 대입:"+result);
 		
 		int year = 2025;
 		result = year % 4;
 		System.out.println("2025 % 4 --> "+result);
 		result = year % 100;
 		System.out.println("2025 % 100 --> "+result);
 		result = year % 400;
 		System.out.println("2025 % 400 --> "+result);
 		
 		int no = 34;
 		result = no % 2;
 		System.out.println("34 % 2 --> "+result);
 		
 		
 		System.out.println("--------문자연산--------");
 	    char ca = 'A';
 	    char cz = 'Z';
 	    int numOfAlphabet = cz - ca + 1;
 	    System.out.println("알바벳 대문자수:" + numOfAlphabet);
 	    int numberOfHangul = '힣' - '가' + 1;
 	    System.out.println("한글 글자수" + numberOfHangul);
 	    
 	    char cb = 'A' + 1;
 	    System.out.println(cb);
 	    System.out.println("'A' + 1 --> " + cb );
 	    
 	    int kor,eng,math;
 	    kor = 89;
 	    eng = 90;
 	    math = 96;
 	    int tot = kor + eng + math; // 2항 연산, 3항 연산이 아님 앞에 2개가 계산 되고 그 뒤에 두개가 계산되는 형식
 	    double avg = tot / 3.0; //avg = 평균값
 	    System.out.printf("%2d %8s %d %d %d %d %6.1f, \n" , 1,"KIM" ,kor, eng, math, tot, avg); // avg -> .1은 소수점 몇번째 자리, \n은 줄 바꿈 컨트롤 텍스쳐
 	    System.out.printf("%2d %8s %d %d %d %d %6.1f " , 10,"KIM" ,kor, eng, math, tot, avg); // avg -> .1은 소수점 몇번째 자리
 	    

	}

}
