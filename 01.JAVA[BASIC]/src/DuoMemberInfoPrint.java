public class DuoMemberInfoPrint{
	public static void main(String[] args) {
		/*
		 * 1.변수선언
		 */
		
		
		/*
		 * 2.변수에 데이타(리터럴)대입
		 */
		
		/*
		 * 3.변수 데이타 출력
		 * 3.변수 데이타 출력
		 */
	
		/*
		 *************************
         회원번호 : 236514   
         이    름 : 홍길동   
         주민번호 : 201212-3495039   
         성    별 : 남   
         결혼횟수 : 0   
         흡연여부 : true   
         키       : 178.3   
         학    점 : A   
         용    모 : 상(중)   
         ************************** 
		 */
		
		/*
		************************************************************************************************
		회원번호  	이름 	   주민번호		  성별	   결혼횟수	     흡연여부	   키	  학점	   용모 
		************************************************************************************************
		12345	   김경호     235584-2631542     남          1         true       187.3      A       하
		*/
		
		
		String  a;
		String  b;
		String  c;
		String  d;
		String  e;
		String  f;
		String  g;
		String  h;
		String  i;
		a = "회원번호 : 236514";
		b = "이    름 : 연승문";
		c = "주민번호 : 연승문";
		d = "성    별 : 990525-*******";
		e = "결혼횟수 : 남";
		f = "흡연여부 : true" ;
		g = "   키    : 178.75";
		h = "학    점 : A";
		i = "용    모 : 중";
		
		System.out.println("*************************");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println("*************************");
		
		
		
		
		int j;
		String name;
		String number;
		char k;
		boolean isMarried;
		boolean isSmoking;
		double height;
		char l;
		char m;
		
		
		
		j = 12345;
		name = "연승문";
		number = "990525-1234567";
	    k = '남';
	    isMarried = true;
	    isSmoking = true;
	    height = 178.75;
	    l = 'A';
	    m = '중';
          	
		
		
		

		
		System.out.println("************************************************************************************************");
		System.out.println("회원번호  이름      주민번호	  성별	   결혼여부	  흡연여부	  키	  학점	   용모");
		System.out.println("************************************************************************************************");
		System.out.println(" "+j + "   " + name + "  " + number + "    " + k + "        " + isMarried + "         " + isSmoking + "         " +  height + "       " + l + "       " + m);
		 
	}
}
