
public class ForNested {

	public static void main(String[] args) {
		
		System.out.println("1.-------------------------------");
		/*
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 */
		
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%s(%d,%d)","★",i,j);
			}
			
			System.out.print("\n");
		}
		
		
		
		
		System.out.println("2.-------------------------------");
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		System.out.println("3.-------------------------------");
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		System.out.println("4.-------------------------------");
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		System.out.println("5.-------------------------------");
		/*
		★★★★★
		☆★★★★
		☆☆★★★
		☆☆☆★★
		☆☆☆☆★
		*/
		

	}

}


