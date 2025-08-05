package com.itwill01.method;

public class DeliveryOrderMain {

	public static void main(String[] args) {

		DeliveryOrder deliveryOrder = new DeliveryOrder();

		deliveryOrder.setOrder( 202011020,"01023450001", "서울시 강남구 역삼동 111-333", 20201102, 130258, 35000, 0003);

		deliveryOrder.print();

	}

}
