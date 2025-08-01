
public class CarMemberFieldMain {

	public static void main(String[] args) {

		/*
		 * 1.차량번호 1234번 차량이 12시에 입차
		 */
		// 차 객체의 데이터를 저장할 수 있는 Car클래스 타입의 변수 car1을 선언

		Car car1;

		// Car클래스를 사용하여 차 객체를 생성한 후 차 객체 데이터가 car1 변수에 대입된다

		car1 = new Car(); // 객체 생성

		// 차 개체(car1)의 멤버필드 no에 "1234" 값대입

		car1.no = "1234";

		// 차 개체(car1)의 멤버필드 inTime에 12 값대입

		car1.inTime = 12;

		/*
		 * 2-1.car1객체 16시에 출차 
		 */

		// 차 개체(car1)의 멤버필드 outTime에 16 값대입

		car1.outTime = 16;

		/*
		 * 2-2. 주차요금 계산(시간당 천원)
		 */

		car1.fee = (car1.outTime - car1.inTime) * 1000;

		/*
		 * 차객체(car1)의 멤버필드(fee)에 차 객체(car1)의 
		 * outTime과 inTime 멤버필드를 사용해서 주차요금을 계산 후 대입
		 */

		/*
		 * 2-3. 주차요금 출력
		 */

		System.out.printf("-------------------------------------\n");
		System.out.printf("%s %s %s %s\n", " 차량번호", "입차시간", "출차시간", "주차요금");
		System.out.printf("-------------------------------------\n");
		System.out.printf("%7s %7d %8d     ￦%2d",car1.no,car1.inTime,car1.outTime,car1.fee);
		
		
		

	}

}
