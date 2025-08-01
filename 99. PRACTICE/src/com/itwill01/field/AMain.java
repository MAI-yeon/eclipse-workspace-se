package com.itwill01.field;

public class AMain {

	public static void main(String[] args) {
		
		
		A a= new A();
		
		
		
		
		a.a = 4;
		a.b = 2;
		a.c = 6;
		
		System.out.println(">> a의 주소값 : "+a);
		System.out.printf("%d",a.a);
		a.method1("더하기",1);
		System.out.printf(" %d",a.b);
		a.method2("는",1);
		System.out.printf(" %d",a.c);
		a.method3("입니다",1);
		
		
		
	}

}
