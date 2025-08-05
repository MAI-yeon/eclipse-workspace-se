
public class ConstructorMain {

	public static void main(String[] args) {
		
		System.out.println("--------------------c1------------------");
		
		/*
		 *<< new Constructor(); >>
		 * 1.Constructor클래스로 객체생성
		 * 2.생성자메쏘드(블록)호출
		 * 3.생성된객체의 주소값을 반환
		 */
		
		Constructor c1 = new Constructor();
		System.out.println("Main : "+c1);
		c1.print();

		
		System.out.println("--------------------c2------------------");
		
		Constructor c2 = new Constructor(100, 200, "생성자 호출시 파라메라");
		System.out.println("Main : "+c2);
		c2.print();
		
	}

}
