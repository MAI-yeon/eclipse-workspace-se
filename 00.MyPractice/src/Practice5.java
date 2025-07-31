
public class Practice5 {

	public static void main(String[] args) {
		
		int number = 13;
		int result;
		result = number % 4;
		System.out.println("result 변수에는 4로 나눈 나머지 대입 : "+ result);
		
		
		int year = 2025;
		result = year % 4;
		System.out.println("2025 % 4 --> "+ result);
		result = year % 100;
		System.out.println("2025 % 100 --> "+ result);
		result = year % 400;
		System.out.println("2025 % 400 --> "+ result);
		
		
		char ca = 'A';
		char cz = 'Z';
		int numOfAlpabet = cz - ca + 1;
		System.out.println("알파벳 대문자수 : "+ numOfAlpabet);
		int numberOfHangul = '힣'-'가' + 1;
		System.out.println("한글 글자수 : "+ numberOfHangul);
	    int numOfAlpabet1 = 'Z'-'A' + 1;
	    System.out.println("알바펫 수 : "+ numOfAlpabet1);
	    
	    char cb = 'A' + 1;
	    System.out.println(cb);
	    System.out.println("A + 1 --> " + cb);
	    
	    int kor, eng, math;
	    kor = 78;
	    eng = 89;
	    math = 98;
	    int tot = kor + eng + math;
	    double avg = tot / 3.0;
	    
	    System.out.printf("%d %s %d %d %d %d %.1f \n",  1, "Yeon", kor, eng, math, tot, avg);
	    System.out.printf("%d %s %d %d %d %d %.1f", 10, "Kim", kor, eng, math, tot, avg);
				

	}

}
