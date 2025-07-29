
/*
 * 들여쓰기 단축기 -> ctrl + shift + f
 */

public class IfTest1 {

	public static void main(String[] args) {
		System.out.println("main block start");
		System.out.println("stmt1");
		boolean condition = false;
		if (condition) {

			/*
			 * condition변수의 값이 true일때 실행되는 코드블록(if블록)
			 */

			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");
		}

		System.out.println("stmt5");
		if (condition) {
			System.out.println("stmt6");
			System.out.println("stmt7");

		} else {
			
			/*
			 * condition변수의 값이 false일때 실행되는 코드블록(else블록)
			 */
			
			System.out.println("stmt8");
			System.out.println("stmt9");

		}
		if (condition)
			System.out.println("stmt10");

		if (condition)
			System.out.println("stmt11");
		else
			System.out.println("stmt12");

		
		System.out.println("stmt13");
		System.out.println("stmt14");
        System.out.println("main block end --> return");
        
        /*
		 * return 문 
		 * - 현재 return문을 실행하는 실행흐름을 JVM(실행흐름을 만들어서 호출한곳)으로 반환한다. 
		 * - 생략가능하다.
		 */
        
        return;
        
       // return 다음에 입력시 [System.out.println("dfdf");] = Unreachable code(에러)

	}

}
