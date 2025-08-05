
public class Student {

	int no;
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	char grade;
	int rank;
	
	public void setInformation(int no,String name,int kor,int eng, int math) {
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public void setTotal() {
		this.tot= this.kor+this.eng+this.math;
				
	}
	
	public void setAvg() {
		this.avg=this.tot / 3.0;
	}
	
	public void setGrade() { 
		if(this.avg>=90) {
			this.grade = 'A';
		}else if(this.avg>=80) {
			this.grade = 'B';
		}else if(this.avg>=80) {
			this.grade = 'C';
		}else if(this.avg>=80) {
			this.grade = 'D';
		}else  {
			this.grade = 'F';
		}
	}
	
	public void setRank() {
		this.rank=1;
	}
	
	public void headerPrint() {
		System.out.println("------------------성적 출력-----------------");
		System.out.println("학번 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.println("--------------------------------------------");
	}
	
	public void print() {
		System.out.printf(" %d %4s %d %4d %4d %4d %5.1f %3c %3d\n", this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.grade,this.rank);
	}
	
	
	
	
}
