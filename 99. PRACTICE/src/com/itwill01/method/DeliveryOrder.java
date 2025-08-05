package com.itwill01.method;

public class DeliveryOrder {

	int no;
	String phoneNumber;
	String juso;
	int date;
	int time;
	int price;
	int no3;

	public void setOrder(int no, String phoneNumber, String juso, int date, int time, int price, int no3) {
		this.no = no;
		this.phoneNumber=phoneNumber;
		this.juso = juso;
		this.date = date;
		this.time = time;
		this.price = price;
		this.no3 = no3;
	}

	public void print() {
		System.out.println("주문 접수 번호 : " + no);
		System.out.println("주문 핸드폰 번호 : " + phoneNumber);
		System.out.println("주문 집 주소 : " + juso);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문 시간 : " + time);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + no3);
	}

}
