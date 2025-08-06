
public class AccountManyMemberMain {

	public static void main(String[] args) {
		/*
		 * null --> 주소없다 주소값
		 */
		Account a0=null;
		Account a1=null;
		Account a2=null;
		Account a3=null;
		Account a4=null;
		
		
		a0=new Account();
		a1=new Account();
		a2=new Account();
		a3=new Account();
		a4=new Account();
		
		a0.print();
		a1.print();
		a2.print();
		a3.print();
		a4.print();
		
		
		
		
		AccountManyMember accountManyMember=
				new AccountManyMember();
		accountManyMember.acc0=new Account(1,"KIM",4000,3.0);
		accountManyMember.acc1=new Account(2,"JIM",3000,2.0);
		accountManyMember.acc2=new Account(3,"LIM",5000,1.0);
		accountManyMember.acc3=new Account(4,"MIM",7000,9.0);
		accountManyMember.acc4=new Account(5,"NIM",9000,5.0);
		Account.headerPrint();
		accountManyMember.acc0.print();
		accountManyMember.acc1.print();
		accountManyMember.acc2.print();
		accountManyMember.acc3.print();
		accountManyMember.acc4.print();
	}
}
