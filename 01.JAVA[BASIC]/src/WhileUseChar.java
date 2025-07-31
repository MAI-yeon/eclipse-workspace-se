
public class WhileUseChar {

	public static void main(String[] args) {
		
		/*
		 * 문자출력
		 */
		
		char c1 = 0;
		while (c1 < 65535) {
			System.out.print(c1);
			c1++;
			if(c1 % 100 == 0) {
				System.out.println("\n");
			}
			
		}
		
		/*
		 * 영문 소문자 출력
		 */
		
		System.out.println();
		char c2 = 'a';
		while(c2 <= 'z') {
			System.out.print(c2+ " ");
			c2++;
		}
		System.out.println();
		
		
		/*
		 [Quiz]
		 - 영문소문자출력
		   a b c d e \n
		   f g h i j \n
		   k l m n o \n
		   p q r s t \n
		   u v w x y \n
		   z
		 */
		
		
		

	}

}
