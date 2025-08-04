
public class CarMemberMethodMain {

	public static void main(String[] args) {

		/*
		 * 1.차량번호 1234번 차량이 12시에 입차
		 */
		
		Car car1=new Car();
		car1.no="1234";
		car1.inTime=12;
		car1.setIpChaDate("1234", 12);
		
		/*
		 * 2-1.car1객체 16시에 출차 
		 */
		
		car1.outTime=16;
		car1.setOutTime(16);
		
		/*
		 * 2-2. 주차요금 계산(시간당 천원)
		 */
		
		
		car1.calculatefee();
		
		/*
		 * 2-2. 주차요금 계산(시간당 천원)
		 */
		
		car1.print();
		
		
		
		
	}

}
