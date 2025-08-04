package com.itwill01.method;

public class HealthMain {

	public static void main(String[] args) {

		Health health1 = new Health();
		Health health2 = new Health();

		health1.setProfile(180,78,'남',"Tomas",37,"PT");
		health2.setProfile(170,20,'여',"Alice",26,"Yoga");
		
		
		health1.headerPrint();
		health1.print();
		health2.print();
		System.out.println("--------------------------------------");
		
	}

}
