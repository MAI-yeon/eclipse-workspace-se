
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {

		/*
		int a;
		int[] ia;
		Account account;
		Account[] accountsArray;
		*/
		
		Account[] accountsArray = new Account[5];
		Account acc1=new Account(1111,"KIN",3000,3.3);
		accountsArray[0]=acc1;
		accountsArray[1]=new Account(2222,"LEE",5600,2.8);
		accountsArray[2]=new Account(3333,"LIM",7800,7.5);
		accountsArray[3]=new Account(4444,"MIN",8900,8.9);
		accountsArray[4]=new Account(5555,"OIM",9900,4.6);
		
		Account.headerPrint();
		accountsArray[0].print();
		accountsArray[1].print();
		accountsArray[2].print();
		accountsArray[3].print();
		accountsArray[4].print();
		
		System.out.println("-----------for loop------------");
		Account.headerPrint();
		for (int i = 0; i < accountsArray.length; i++) {
			accountsArray[i].print();
		}
		
		System.out.println("-----------enhanced dor loop------------");
		
		Account.headerPrint();
		for(Account tempAccount:accountsArray) {
			tempAccount.print();
		}
	}

}
