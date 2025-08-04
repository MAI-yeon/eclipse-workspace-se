
public class AccountEncapsulationMain {

	public static void main(String[] args) {

		/*
		 *계좌 객체를 생성 
		 */

		Account account1 = new Account();

		/*
		 * 계좌데이터 대입
		 */

		account1.setAccount(1111, "KIM", 50000, 1.2);

		/*
		 * account1 8000원 입금
		 */

		account1.deposit(8000);

		/*
		 * account1잔고 얻기
		 */

		int account1Balnce = account1.getBalance();
		System.out.println("account1 잔고 : " + account1Balnce);

		/*
		 * account1 계좌이유 1%증가
		 */

		account1.setIyul(account1.getIyul() + 1);
		account1.increaseIyul(1);

		/*
		 * account1 계좌 출력
		 */

		account1.headerPrint();
		account1.print();

		System.out.println(">> 은행 계좌전체잔고 50원 증가");

		/*
		 * 은행 전체 계좌 생성
		 */

		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = new Account();
		/*
		 * 은행 계좌 데이터 초기화
		 */

		acc1.setAccount(1111, "LIM", 89000, 3.5);
		acc2.setAccount(2222, "JIM", 34000, 2.6);
		acc3.setAccount(3333, "SIM", 12300, 1.9);

		/*
		 * 은행 모든 계좌 잔고 50원 증가.
		 */

		acc1.deposit(50);
		acc2.deposit(50);
		acc3.deposit(50);

		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();

	}

}
