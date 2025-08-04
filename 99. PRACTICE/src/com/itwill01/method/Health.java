package com.itwill01.method;

public class Health {
	
	int height;
	int weight;
	char gender;
	String name;
	int age;
	String work;
	
	
	
	public void setProfile(int height,int weight, char gender, String name, int age, String work ) {
		this.height=height;
		this.weight=weight;
		this.gender=gender;
		this.name=name;
		this.age=age;
		this.work=work;
	}
	
	public void headerPrint() {
		
		System.out.println("------------트레이너 프로필-----------");
		System.out.println("  키  몸무게  성별  이름  나이  일 ");
		System.out.println("--------------------------------------");
	
	}
	
	public void print() {
		System.out.printf("%4d %5d %5c %7s %3d  %3s \n", this.height,this.weight,this.gender,this.name,this.age,this.work);
		
	}

}
