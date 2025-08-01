
public class MemberFieldMain {

	public static void main(String[] args) {

		/*
		 * MemberField 사용자정의 타입 객체의 주소값을 저장할 참조변수선언
		 */
		
		
		MemberField mf1;
		
		/*
		 * MemberField클래스(틀) 로 객체를생성한후에 객체의 주소값이 대입
		 * mf1참조변수에 대입(#100)
		 */
		
		mf1 = new MemberField();
		
		/*
		 - 객체의 참조(주소)변수가 가지고있는 객체의 주소값 #100를 사용해서 멤버필드에 데이타대입
		 - 객체의 멤버필드접근방법
		    - 참조변수.멤버필드이름=값;
		    - mf1.memberField1=9090;
		 */
		
		mf1.memberField1=1234;
		mf1.memberField2=3.2;
		mf1.memberField3=true;
		mf1.memberField4='A';
		mf1.memberField5="문자열";
		
		
	}

}
