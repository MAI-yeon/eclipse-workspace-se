
public class OperatorRelational {

	public static void main(String[] args) {
		
		/*
		 * 관계(비교)연산자
		 *   - 형태: > , <, >= , <= , == ,!=
		 *   - 관계연산의 결과값은 논리형데이타(true,false)
		 */
		
		int a = 10;
		int b = 20;
		
		boolean result = a>b;
		System.out.println("10 > 20 -->" + result);
        result = a < b;
        System.out.println("10 < 20 -->" + result);
        result = a <= b;
        System.out.println("10 <= 20 -->" + result);
        result = a >= b;
        System.out.println("10 >= 20 -->" + result);
        result = a == b;
        System.out.println("10 == 20 -->" + result);
        result = a != b;
        System.out.println("10 != 20 -->" + result);
        
        
	}

}
