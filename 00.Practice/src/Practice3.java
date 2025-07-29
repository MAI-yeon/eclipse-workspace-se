
public class Practice3 {

	public static void main(String[] args) {
		System.out.println("---------------int----------------");

		int i1, i2, i3, i4, i5;
		i1 = 80;
		i2 = 90;
		i3 = i1;
		i4 = 2147483647;
		i5 = 0b01111111111111111111111111111111;

		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);

		/*
		 * 진수 이름 접두사 예시
		 * 
		 * 2진수 Binary 0b 또는 0B 0b1010 → 10(십진수 10) 8진수 Octal 0o 또는 0O 0o12→ 10(십진수 10)
		 * 10진수 Decimal 없음 10 (일반 숫자) 16진수 Hexadecimal 0x 또는 0X 0xA →10(십진수 10)
		 */

		long l1 = 232;
		long l2 = 2147483648L;
		System.out.println(l1);
		System.out.println(l2);

		System.out.println("--------------double---------------");

		float f1 = 0.1f;
		System.out.println(f1);

		double d1, d2, d3;
		d1 = 3.14159;
		d2 = 123456789123456789.0;
		d3 = 1.23456789123456789;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		System.out.println("--------------char----------------");

		char c1;
		c1 = 'A';
		char c2 = '가';
		char c3 = '힣';
		char c4 = '1';
		char c5 = c1;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

		char m1, m2, m3, m4, m5, m6;

		m1 = 'A';
		m2 = 65;
		m3 = 0xAC00;
		m4 = '\uAC00';
		m5 = '가';
		m6 = 44032;
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);

		/*
		 * 65는 상수이기에 4바이트에서 2바이트로 잘릴때 데이터 소실이 없으면 기입 가능하다. 
		 * "가" → U+AC00 (16진수) 
		 *      = 0xAC00
		 *      = 44032 (10진수)
		 */

		
		int HangulCount = c3 - c2 + c1;
		System.out.println("한글글자수 = "+ HangulCount);
		
		
		
		System.out.println("-----------------boolean-----------------");
	}

}
