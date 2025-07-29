
public class IfTest2 {

	public static void main(String[] args) {
		int a = 21;
		int b = 30;
		if (a > b) {
			System.out.println("21 > 30 --> true");
		} else {
			System.out.println("21 > 30 --> false");
		}
		if (a < b) {
			System.out.println("21 < 30 --> true");
		} else {
			System.out.println("21 < 30 --> false");

		}
		if (a == b) {
			System.out.println("21 == 30 --> true");
		}
		if (a != b) {
			System.out.println("21 != 30 --> true");

		}

		int kor = 98;
		if (kor >= 90) {
			
			/*
			 *블록 안에서 선언된 변수는 선언된 블록 안에서만 사용 가능하다. 
			 */
			
			char grade = 'A';
			String msg = "참 잘했어요!!";
			System.out.println("kor   --> " + kor);
			System.out.println("grade --> " + grade);
			System.out.println("msg   --> " + msg);
		}
		System.out.println("kor   --> " + kor);
		/*
		 * <<grade cannot be resolved to a variable>>
		 * System.out.println("grade --> "+grade); <<msg cannot be resolved to a
		 * variable>> System.out.println("msg   --> "+msg);
		 */

	}

}
