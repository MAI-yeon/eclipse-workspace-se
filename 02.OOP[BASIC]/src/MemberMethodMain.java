
public class MemberMethodMain {

	public static void main(String[] args) {
		
		MemberMethod mm=new MemberMethod();
		mm.number1=11;
		mm.number2=22;
		System.out.println("main stmt1");
		
		/*
		 * 멤버메소드 실행(호출)
		 * - 형식 : 참조(주소)변수.멤버메소드이름();
		 * - main실행흐름을 mm주소에 있는 객체의
		 *   method1이라는 이름의 메소드(실행코드가 있는 블록)로 보낸다(호출).
		 */
		
		
		mm.method1();
		System.out.println("main stmt2");
		mm.method2(2);
		System.out.println("main stmt3");
		mm.method2(3);
		System.out.println("main stmt4");
		mm.method3("안녕하세요", 3);
		System.out.println("main stmt5");
		mm.method3("누구세요?", 5);
		System.out.println("main stmt6");
		mm.methed4("연승문","잘생겼어요!",3);
		System.out.println("main stmt7");
		mm.methed4("이효리","안녕하세요!",5);
		System.out.println("main stmt8");
		return;
		
		

	}

}
