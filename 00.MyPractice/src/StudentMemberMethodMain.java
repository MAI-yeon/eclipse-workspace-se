
public class StudentMemberMethodMain {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.setInformation(1,"연승문",95,93,98);
		student2.setInformation(2,"연수진",70,95,80);
		student3.setInformation(3,"연준협",87,70,88);
		
		student1.setTotal();
		student2.setTotal();
		student3.setTotal();
		
		student1.setAvg();
		student2.setAvg();
		student3.setAvg();
		
		student1.setGrade();
		student2.setGrade();
		student3.setGrade();
		
		student1.setRank();
		student2.setRank();
		student3.setRank();
		
		
		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();
		System.out.println("--------------------------------------------");
		

	}

}
