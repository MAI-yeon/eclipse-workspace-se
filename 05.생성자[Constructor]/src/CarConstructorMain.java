
public class CarConstructorMain {

	public static void main(String[] args) {

		System.out.println("--------------------car1-------------------");
		Car car1 = new Car();
		car1.setIpChaDate("1234", 10);
		car1.setOutTime(12);
		car1.calculatefee();
		car1.headPrint();
		car1.print();
		System.out.println("--------------------car2-------------------");
		Car car2 = new Car();
		car2.setIpChaDate("4567", 11);
		car2.setOutTime(13);
		car2.calculatefee();
		car2.headPrint();
		car2.print();

		System.out.println("---오늘 주차장 이용차량 출력---");

		Car cara = new Car("1234", 12, 13, 1000);
		Car carb = new Car("4575", 16, 17, 1000);
		Car carc = new Car("7557", 14, 16, 2000);
		Car card = new Car("3537", 13, 21, 9000);
		
		
		cara.headPrint();
		cara.print();
		carb.print();
		carc.print();
		card.print();
	}

}
