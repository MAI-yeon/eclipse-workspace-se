/*
 배열:  
      - 같은데이타형을 가진 멤버필드(기억장소) 여러개를 멤버로 가지는 타입
      - 배열타입변수의 선언형식
           데이타타입[] 변수이름;  ex> int[] ia; , char[] ca;
	  - 사용: 
	       1.배열타입객체의생성
	         - int[] a = new int[5];	
		   2.배열객체멤버필드의 초기화 
      -특징   
		  1.모든 배열[]형의 변수는 참조변수이다.
		    (배열은 객체다.) ★★★★★★★★ - 외워야할것
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */


public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {

		/*
		int intType;
		intType=90;
		*/
		
		int[] intArray;
		intArray = new int[5];
		
		//int[] intArray = new int[5];
		
		System.out.println("intArray배열 객체 주소값 : "+ intArray);
		
		intArray[0]=11;
		intArray[1]=22;
		intArray[2]=33;
		intArray[3]=44;
		intArray[4]=55; 
		
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		System.out.println("---------------------------");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("---------------------------");
		
		/*
		  << 배열의 크기 >>
		  - 모든배열객체는 public int length;를 멤버변수로가진다.
		  - 배열의 크기를 가지고있는 변수이다
		  - 변경불가능(상수)
		 */
		
		System.out.println("intArray 배열 객체의 멤버필드수 : "+intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("--------기본형 1차원 배열--------");
		System.out.println("-------------int[]-------------");
		int[] korArray = new int[10];
		korArray[0]=89;
		korArray[1]=56;
		korArray[2]=78;
		korArray[3]=88;
		korArray[4]=95;
		korArray[5]=55;
		korArray[6]=46;
		korArray[7]=85;
		korArray[8]=25;
		korArray[9]=35;
		for (int i = 0; i < korArray.length; i++) {
			System.out.print(korArray[i]+" ");
			
		}
		System.out.println();
		int korTot=0;
		for (int i = 0; i < korArray.length; i++) {
			korTot += korArray[i];
		}
		System.out.println("국어총점 : "+korTot);
		System.out.println("국어평균 : "+(double)korTot/korArray.length);
		
		System.out.println("----------------------char---------------------");
		char[] ca = new char[6];
		ca[0] = 'H';
		ca[1] = 'e';
		ca[2] = 'l';
		ca[3] = 'l';
		ca[4] = 'o';
		ca[5] = '!';
		
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]+",");
		}
		System.out.println();
		
		System.out.println("----------------------duble--------------------");
		
		double[]da=new double[5];
		da[0]=1.2;
		da[1]=3.2;
		da[2]=0.5;
		da[3]=4.1;
		da[4]=7.8;
		
		for (int i = 0; i < da.length; i++) {
			System.out.print(da[i]+" , ");
		}
		System.out.println();
		
		System.out.println("--------------------String---------------------");
		String[]nameArray= new String[5];
		nameArray[0]="KIM";
		nameArray[1]="YEON";
		nameArray[2]="SIM";
		nameArray[3]="MUN";
		nameArray[4]="SEUNG";
		
		for (int i = 0; i < nameArray.length; i++) {
			String tempName=nameArray[i];
			System.out.print(tempName+"\n");
		}
		
		System.out.println("----------------enhanced for-------------------");
		System.out.println(">>> int[]");
		for (int tempKor : korArray) {
			System.out.print(tempKor+", ");
		}
		System.out.println();
		System.out.println(">>String[]");
		for(String tempName:nameArray) {
			System.out.println(tempName+ ", ");
		}
		System.out.println();
	}

}
