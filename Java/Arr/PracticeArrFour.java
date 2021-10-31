package Practice;

import java.util.Scanner;

public class PracticeArrFour {

	private Scanner sc ;
	private int A,B,C,i;
	
	//int[] A= new int[N];
	
	public void run() {
		sc = new Scanner(System.in);
		System.out.println("A의 숫자를 입력해주세요.");
		A=sc.nextInt();
		System.out.println("B의 숫자를 입력해주세요.");
		B=sc.nextInt();
		System.out.println("C의 숫자를 입력해주세요.");
		C=sc.nextInt();
		
		if((A>=100)&&(A<1000)&&(B>=100)&&(B<1000)&&(C>=100)&&(C<1000)) {
			int multi = A*B*C;
			System.out.println("그냥 곱한것"+multi);
			
			int[] Arr = new int[10]; //0~9까지니까 10개
			
			while(multi>0) {
				Arr[multi % 10]++;
				multi /= 10;
			}
			
			for(i=0;i<Arr.length;i++) {
				System.out.println(Arr[i]);
			}
			
			
			
		}else {
			System.out.println("모든 숫자는 100보다 크거나 같고 1000보다 작은 수를 입력해주세요.");
		}
	
	
			
			
			
		
		
	

	}//run-end


}//class-end
