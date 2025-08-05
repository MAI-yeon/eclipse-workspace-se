
public class Car {
	
	
	/*
	 * 생산되는 차량 객체의 수를 저정할 공용(정적[static]) 변수
	 */
	
	
	
	//private static int count;
	public static int count;
	private int no;//차량 번호
	private String model;//차랑 번호
	private String color;//차량 색상
	
	
	public Car(int no, String model, String color) {
		this.no = no;
		this.model = model;
		this.color = color;
		Car.count++;
	}
	
	public void headerprint() {
		System.out.println("------------------");
		System.out.println("번호    모델   색상");
		System.out.println("------------------");
	}
	
	public void print() {
		System.out.println("  "+no+"     "+model+"   "+color);
	}
	
	
	
	public static void setCount(int count) {
		Car.count=count;
		
	}
	public static int getCount() {
		return Car.count; 
	}
	
     
	
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	

}
