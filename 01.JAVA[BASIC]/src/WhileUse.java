
public class WhileUse {

	public static void main(String[] args) {
		
		/*
		 * 10번 반복 실행
		 */
		System.out.println("-------------i = 0--------------");
		int i = 0;
		while (i < 10) {
			System.out.println("stmt i --> "+i);
			i++; 
			
		}
		
		
		System.out.println("-------------i = 1---------------");
		i = 1;
		while (i <= 10) {
			System.out.println("stmt i --> "+i);
			i++;
		}
		
		
		System.out.println(">> 1~10 사이의 정수출력");
		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
			
		}
		System.out.println();
		System.out.println(">>1~10 사이의 정수 중 홀수만 출력");
		i = 1;
		while (i <= 10) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		System.out.println(">>1~100 사이의 정수 중 4의 배수만 출력");
		i=1;
		while (i <= 100) {
			if(i % 4 == 0 ) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
		
		
		//System.out.println(">> 1900년도부터 2025년까지 윤년인 연도를 출력하세요");
		
		/*
		 * 누적
		 */
		
		System.out.println(">> 1~100사이의 정수의 합[누적]");
		i = 1;
		int tot = 0;
		int evenTot = 0;
		int oddTot = 0;
		while (i <= 100) {
			//tot = tot + i;
			tot += i;
			if(i % 2 == 0) {
				evenTot += i;
			}else {
				oddTot += i;
			}
			
			i++;
			
		}
		
		System.out.println("1~100 사이의 정수의 합 : "+tot);
		System.out.println("1~100 사이의 홀수의 합 : "+oddTot);
		System.out.println("1~100 사이의 짝수의 합 : "+evenTot);
	}

}
