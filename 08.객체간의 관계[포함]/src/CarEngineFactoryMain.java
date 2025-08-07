
public class CarEngineFactoryMain {

	public static void main(String[] args) {

		
		/*
		 
		Engine x6Engine=new Engine();
		x6Engine.type="A";
		x6Engine.cc=5000;
		
		
		Car Car1=new Car();
		Car1.no=1;
		Car1.model="x6";
		Car1.engine=x6Engine;
		
		System.out.println(Car1.no+" "+Car1.model+" "+Car1.engine+" "+Car1.engine.cc+" "+Car1.engine.type);
		
		car.print();
		
		*/
		
		Engine x6Engine=new Engine("A",5000);
		Car car1=new Car();
		car1.setNo(1);
		car1.setModel("x6");
		car1.setEngine(x6Engine);
		car1.print();
		
		
		Car car2=new Car(2,"x5",new Engine("B",3000));
		car2.print();
		
		System.out.println("------------차량 엔진 검사------------");
		
		Engine car1ReturnEngine = car1.getEngine();
		car1ReturnEngine.print();
		car2.getEngine().print();
		
		
		
		
	}

}
