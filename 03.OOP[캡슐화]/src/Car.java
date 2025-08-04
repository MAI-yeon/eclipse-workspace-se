
public class Car {

	private String no; // 차량번호
	private int inTime; // 입차시간
	private int outTime; // 출차시간
	private int fee; // 주차요금

	public void setIpChaDate(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;

	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	public void calculatefee() {
		this.fee = (this.outTime - this.inTime) * 1000;
	}

	public void headPrint() {
		System.out.printf("-------------------------------------\n");
		System.out.printf("%s %s %s %s\n", " 차량번호", "입차시간", "출차시간", "주차요금");
		System.out.printf("-------------------------------------\n");
	}

	public void print() {

		System.out.printf("%7s %7d %8d     ￦%2d\n ", this.no, this.inTime, this.outTime, this.fee);

	}

	// getter, setter

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getOutTime() {
		return outTime;
		
		
		
		
		
		
		
		
	}

}
