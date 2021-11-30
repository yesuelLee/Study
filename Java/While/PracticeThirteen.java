package Practice;
//숫자입력해서 while문 사용
import java.util.Scanner;

public class PracticeThirteen {

	private Scanner sc ;
	private int i,j,k,N,s,u;
	
	
	
	public void run() {
		System.out.println("숫자를 입력해주세요.");
		sc=new Scanner(System.in);
		N=sc.nextInt();
		i=N/10;
		j=N%10;
		if((0<=N)&&(N<=99)) {
			if(N<10) {
				while(s<4) {
					k=i+j;
					System.out.println(i+"+"+j+"="+k);
					k=(j*10)+(k%10);
					i=k/10;
					j=k%10;
				s++;	
				}
				}
			
			
		}else {
			System.out.println("0보다 크거나 같은 숫자, 99보다 작거나 같은 숫자만 입력해주세요.");
		}
		
	}
	
	public void run2() {
		System.out.println("숫자를 입력해주세요.");
		sc=new Scanner(System.in);
		N=sc.nextInt();
		
		i=N/10; j=N%10; 
		if((0<=N)&&(N<=99)) {
				for(s=0; s<4; s++) {
					k=i+j;
					System.out.println(i+"+"+j+"="+k);
					k=(j*10)+(k%10);
					i=k/10;
					j=k%10;
		   
				}
	
		}
	}
	
	
	
}
