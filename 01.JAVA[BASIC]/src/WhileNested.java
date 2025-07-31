
public class WhileNested {

	public static void main(String[] args) {

		/*
		 * ★★★★★\n 
		 * ★★★★★\n 
		 * ★★★★★\n 
		 * ★★★★★\n 
		 * ★★★★★\n
		 */

		System.out.print("★");
		System.out.print("★");
		System.out.print("★");
		System.out.print("★");
		System.out.print("★");
		System.out.print("\n");
		System.out.print("★★★★★"); // 2가지 방법이 똑같음
		System.out.print("\n");
		System.out.print("★★★★★");
		System.out.print("\n");
		System.out.print("★★★★★");
		System.out.print("\n");
		System.out.print("★★★★★");
		System.out.print("\n");
		System.out.println("---------------------1");

		/*
		 * ★[0,0]★[0,1]★[0,2]★[0,3]★[0,4] 
		 * ★[1,0]★[1,1]★[1,2]★[1,3]★[1,4]
		 * ★[2,0]★[2,1]★[2,2]★[2,3]★[2,4] 
		 * ★[3,0]★[3,1]★[3,2]★[3,3]★[3,4]
		 * ★[4,0]★[4,1]★[4,2]★[4,3]★[4,4]
		 */
		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				System.out.printf("%s[%d,%d]", "★", i, j);
				j++;
			}

			System.out.print("\n");
			i++;
		}
		
		System.out.println("--------------------------------2");
		
		int k = 0;
		while (k < 5) {
			System.out.println("★★★★★");
			System.out.print("\n");
			k++;
		}
		
		System.out.println("--------------------------------3");
		
		int l = 0;
		while (l < 5) {
			System.out.printf("%s","★");
			
			l++;
		}
		
		/*
		 * ☆★★★★
		 * ★☆★★★
		 * ★★☆★★
		 * ★★★☆★
		 * ★★★★☆
		 */
		
		System.out.println("--------------------------------4");
		
		i = 0;
		while(i < 5) {
			int j = 0;
			while(j < 5) {
				if(i != j) {
					System.out.printf("%s","★");
				}else {
				    System.out.printf("%s","☆");
		     	}
		     	j++;
				
			}
			System.out.print("\n");
			
			i++;
		}
		
		
		System.out.println("--------------------------------5");
		
		/*
		 * ★
		 * ★★
		 * ★★★
		 * ★★★★
		 * ★★★★★
		 */
		
		
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j <= i) {
				System.out.printf("%s", "★");
				j++;
			}

			System.out.print("\n");
			i++;
		
		}
		
		/*
		 * ★★★★★
		 * ★★★★
		 * ★★★
		 * ★★
		 * ★
		 */
		
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5-i) {
				System.out.printf("%s", "★");
				j++;
			}

			System.out.print("\n");
			i++;
		
		}
		
		System.out.println("-----------------------------6");
		
		/*
		 * ★★★★★
		 * ☆★★★★
		 * ☆☆★★★
		 * ☆☆☆★★
		 * ☆☆☆☆★
		 */
		
		
		
		i = 0;
		while(i < 5) {
			int j = 0;
			while(j < 5) {
				if(i > j) {
					System.out.printf("%s","☆");
				}else if(i == j){
				    System.out.printf("%s","★");
		     	}else {
		     		System.out.printf("%s","★");
		     	}
		     	j++;
				
			}
			System.out.print("\n");
			
			i++;
			
		}
		
		
		
		

	}//end main

}//end class
