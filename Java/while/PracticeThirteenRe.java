package Practice;

import java.util.Scanner;

public class PracticeThirteenRe {

	private Scanner sc ;
	private int i,j,k,N,s,u;
	
	
	
	public void run() {
		System.out.println("숫자를 입력해주세요.");
		sc=new Scanner(System.in);
		N=sc.nextInt();
		i=N/10;
		j=N%10;
		if((0<=N)&&(N<=99)) {
			
				while(s<4) {
					i=N/10;
					j=N%10;
					N=i+j;
					System.out.println(i+"+"+j+"="+N);
					N=(j*10)+(N%10);
					
				s++;	
				}System.out.println("그 다음 새로운 숫자는 "+j+(N%10)+"입니다");
				
			
			
		}else {
			System.out.println("0보다 크거나 같은 숫자, 99보다 작거나 같은 숫자만 입력해주세요.");
		}
		
	}
	
	public void run2() {
		System.out.println("숫자를 입력해주세요.");
		sc=new Scanner(System.in);
		N=sc.nextInt();
		

		if((0<=N)&&(N<=99)) {
				for(s=0; s<4; s++) {
					i=N/10;
					j=N%10;
					N=i+j;
					System.out.println(i+"+"+j+"="+N);
					N=(j*10)+(N%10);
				}
				System.out.println("그 다음 새로운 숫자는 "+j+(N%10)+"입니다.");
	
		}else {
			System.out.println("0보다 크거나 같은 숫자, 99보다 작거나 같은 숫자만 입력해주세요.");
		}
	}
	
	
	
}
