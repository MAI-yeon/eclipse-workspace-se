
public class IfUse {

	public static void main(String[] args) {

		int no1 = 11;
		if (no1 % 2 == 0) {
			System.out.printf("%d 은 짝수 \n ", no1);
		} else {
			System.out.printf("%d 은 홀수 \n ", no1);

		}
		int no2 = 23453;
		if (no2 % 4 == 0) {
			System.out.printf("%d 는 4의배수 \n", no2);
		} else {
			System.out.printf("%d 는 4의배수 아님 \n", no2);

		}
		int year = 2025;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.printf("%d 는 윤년입니다. \n", year);
		} else {
			System.out.printf("%d 는 평년입니다. \n", year);

		}
		
		char c = '4';
		if (c >= 'A' && c <= 'Z') {
			System.out.printf("%c는 알파벳 대문자 입니다.\n",c);
		}
		if (c >= 'a' && c <= 'z') {
			System.out.printf("%c는 알파벳 소문자 입니다.\n",c);
		}
		
		if (c >= '0' && c <= '9') {
			System.out.printf("%c는 숫자형태 문자 입니다.\n",c);
		}
		
		/*
		 다음문자는 아이디의 첫글자입니다. 
		 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		   - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */
		
		char idFirstLeter = '&';
		if ((idFirstLeter >= 'A' && idFirstLeter <= 'Z') || (idFirstLeter >= 'a' && idFirstLeter <= 'z')) {
			System.out.printf("%c는 유효한 아이디 문자입니다.\n", idFirstLeter);
		}else {
			System.out.printf("%c는 유효하지 않은 아이디 문자입니다.\n", idFirstLeter);
			
		}
		
		
		
			
		
		
		
		
	}

}
