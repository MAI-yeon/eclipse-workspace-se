
public class VariableTypes {

	public static void main(String[] args) {
		
		/*
		 * 숫자형
		 * 
		 * 	1.정수형변수타입(byte,short,int,long)
		 *     			int kor; 
		 *     			int eng;
		 *     			int math;
		 *     - 정수형변수: kor,eng,math 
		 *     - 정수형리터럴: 10,23,-90,2343242(int)
		 */
		
		int i1,i2,i3,i4,i5;
		i1=88;
		i2=99;
		i3=i1;
		i4=2147483647;
		i5=0b01111111111111111111111111111111;
		
		/*
		The literal 2147483648 of type int is out of range
		i6=2147483648;
		*/
		
		System.out.println("------------int------------");
		System.out.println(i1);
	    System.out.println(i2);
	    System.out.println(i3);
	    System.out.println(i4);
	    System.out.println(i5);
	    
	    long l1 = 232;
	    long l2 = 2147483648L;
	    System.out.println(l1);
	    System.out.println(l2);
	    
	    
	    /*
	     * 8바이트 (long) 사용시 
	     * 리터럴(정수) 뒤에 L 붙이기(소문자 대문자 상관없음)
	     */
	    
	    /*
		 * 	2.실수형변수타입(float,double) - 정밀도가 높다 낮다로표현(float<double)
		 *     			float (7자리 정밀도) avg; 
		 *     			double (15자리 정밀도) height;
		 *     - 실수형변수: avg,height 
		 *     - 실수형리터럴: 1.23 , 78.25 , 100.0 (double)
		 */
	    
	    System.out.println("-----double------");
	    
	    float f1 = 0.1F;
	    System.out.println(f1);
	    
	    double d1,d2,d3;
	    d1 = 3.14159;
	    d2 = 123456789123456789.0;
	    d3 = 1.23456789123456789;
	    System.out.println(d1);
	    System.out.println(d2);
	    System.out.println(d3);
	    
	    /*
	     * 8바이트 (double) 사용시 
	     * 리터럴(정수) 뒤에 F 붙이기(소문자 대문자 상관없음)
	     */
	    
	    
	    System.out.println("------char------");
	    
	    /*
		 * 문자형(한개문자)- 2byte
		 *   char c1,c2,c3;
		 *   - 문자형변수(c1,c2,c3)
		 *   - 문자형리터럴: 'A','힣','a','1','★'
		 *   '' 사용
		 */
		
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
	    		
	    char m1,m2,m3,m4,m5,m6;
	    m1 = 'A';
	    m2 = 65;
	    
	    /* 
	     * 65는 상수이기에 4바이트에서 2바이트로 잘릴때 데이터
	     * 소실이 없으면 기입 가능하다.
	     */
	    
	    
	    /*
	    int i22 = 65;
	    m2 = i22
	    */
	    
	    
	    System.out.println(m1);
	    System.out.println(m2);
	    
	    
	    m3 = 0xAC00;
	    m4 = '\uAC00';
	    m5 = '가';
	    m6 = 44032;	
	    System.out.println(m3);
	    System.out.println(m4);
	    System.out.println(m5);
	    System.out.println(m6);
	    
	    int hangulCount = c3-c2+1;
	    System.out.println("한글글자수: "+hangulCount);
	    
	    
	    System.out.println("-------boolean--------");
	    /*
		 *논리형
		 *  1.논리형변수타입(boolean)
		 *  	boolean b1;
		 *  	boolean b2;
		 *  	- 논리형변수 	: b1,b2
		 *  	- 논리형리터럴	: true,false
		 */
		
	    boolean bool1 = true;
	    boolean bool2 = false;
	    boolean bool3 = true;
	    boolean bool4 = bool3;
	    System.out.println(bool1);
	    System.out.println(bool2);
	    System.out.println(bool3);
	    System.out.println(bool4);
	    
	    
	    System.out.println("------문자열형(타입) string------");
	   
	    String str1 = "오늘은";
	    String str2 = "월요일";
	    String str3 = "타입을 \"공부\" 합니다.";
	    System.out.println(str1);
	    System.out.println(str2);
	    System.out.println(str3);
	    
	    /*
	     *문자열 결합연산자 ( + )
	     *공백도 문자다 " " 이런식으로 기입하기
	     */
	    
	    String str4 = str1+" "+str2+" "+str3;
	    System.out.println(str4);	
	    System.out.println(str1+" "+str2+" " +"언제 한주가 가나요~~~");
	    
	    String name = "연승문";
	    int age = 27;
	    char gender = '남';
	    double height = 178.32;
	    double weight =75.3;
	    boolean isMarried = true;
	    
	    System.out.println("---------------------------------------------------------");            
	    System.out.println("이름    나이     성별        키        체중       결혼?"  );
	    System.out.println("---------------------------------------------------------");
	    System.out.println(name+"   "+age+"       "+gender+"       "+height+"      "+weight+"       "+isMarried);
	    
	    
	    
	 
	}

}
