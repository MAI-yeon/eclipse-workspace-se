
public class Practice9 {

	public static void main(String[] args) {
		
		
		int i = 2;
		while( i <=9 ) {
			int j = 1;
			while(j<=9) {
				System.out.printf("%d * %d = %2d", i,j,i*j);
				j++;
		}
		System.out.println();
		i++;
		}
		
		
		System.out.println("-------------------------------------------");
		
		
		int j=1;
		while(j<=9) {
			i=2;
			while(i<=9) {
				System.out.printf("%d*%d=%2d ",i,j,i*j);
				i++;
			}
			System.out.println();
			j++;
		}
		
		System.out.println("--------------------------------------------------------");
		
		i=1;
		while(i<=9) {
			j=2;
			while(j<=9) {
				System.out.printf("%d*%d=%2d ",j,i,i*j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("------------------------------------------------------------");
		
		
		i=0;
		while (i<10) {
			System.out.println("stmt i -->"+i);
			i++;
		}
		
		System.out.println("------------------------------------------------------------");
		
		
		i=1;
		while(i<=10) {
			System.out.println("stmti-->"+i);
			i++;
		}
		
		System.out.println("------------------------------------------------------------");
		
		
		i=1;
		while(i<=10) {
			System.out.println(i + "");
		    i++;
		}
		
		System.out.println("------------------------------------------------------------");
		
		i=1;
		while(i<=10) {
			if(i%2==1) {
				System.out.println(i + "");
				
			}
			i++;
		}
		
		
		System.out.println("------------------------------------------------------------");
		
		i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i +"");
			}
			i++;
			
		}
		
		
		System.out.println("------------------------------------------------------------");
		
		
		i=1;
		while(i<=100) {
			if(i%4==0) {
				System.out.print(i + "\n");
			}
			i++;
		}
		
		System.out.println("------------------------------------------------------------");

		i=1;
		int tot=0;
		int evenTot=0;
		int oddTot=0;
		while(i<=100) {
			tot=tot+i;
			if(i%2==0) {
				evenTot = evenTot+i;
			}else {
				oddTot = oddTot +i;
			}
			i++;
		}
		System.out.println("1~100사이의 정수의 합 : "+tot);
		System.out.println("1~100사이의 짝수의 합 : "+evenTot);
		System.out.println("1~100사이의 홀수의 합 : "+oddTot);
		
		
	}

}
