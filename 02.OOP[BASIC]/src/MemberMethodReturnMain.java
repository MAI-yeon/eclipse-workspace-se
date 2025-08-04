
public class MemberMethodReturnMain {

	public static void main(String[] args) {

		MemberMethodReturn mmr = new MemberMethodReturn();
		mmr.memberField1=1;
		mmr.memberField2=2;
		mmr.memberField3=3;
		
		System.out.println("main block start");
		int returnData1 = mmr.method1();
		System.out.println("main block-->returnData1 : "+returnData1);
		
		int returnData2=mmr.method1();
		System.out.println("main block-->returnData2 : "+returnData2);		
		
		boolean returnData3=mmr.method2();
		System.out.println("main block-->returnData3 : "+returnData3);
		if(mmr.method2()) {
			System.out.println("결혼했습니다.");
		}else {
			System.out.println("결혼안했습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		int returnData4=mmr.add(12,34);
		System.out.println("main block--> mmr.add(12, 34) 반환데이터 : "+returnData4);		
		System.out.println("main block--> mmr.add(23, 45) 반환데이터 : "+mmr.add(23, 45));		
		
		
		String returnData5=mmr.hello("피오나 공주");
		System.out.println("main block--> returnData5 : "+returnData5);
		System.out.println("main block--> mmr.hello(\"디즈니 공주\") : "+mmr.hello("디즈니 공주"));
		
		
				
		System.out.println("main block end retrn");
		return;
	}

}
