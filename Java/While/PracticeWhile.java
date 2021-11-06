package Practice;

import java.util.Scanner;

public class PracticeWhile {

	private Scanner sc ;
	private int A,B,N;
	
	
	
	public void run() {
		sc = new Scanner(System.in);
		
		
		N=1;
		while(N<7) {
		
			System.out.println("A의 숫자를 입력해주세요.");
			A=sc.nextInt();
			System.out.println("B의 숫자를 입력해주세요.");
			B=sc.nextInt();
			
	        if((A>0)&&(B<10)) {		
			N++;
			System.out.println(A+B);
	        }else {
			System.out.println("A는 0보다 크고, B는 10보다 작은 수를 입력하세요.");
		
		}
	
}
}
}

