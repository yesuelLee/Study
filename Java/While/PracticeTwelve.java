package Practice;

import java.util.Scanner;

public class PracticeTwelve {
	private Scanner sc ;
	private int i,j,s,k;
	
	
	
	public void run() {
		
		System.out.println("홀수 숫자를 입력해주세요");
		sc=new Scanner(System.in);
		s=sc.nextInt(); 
		if(s%2!=0) {
			
			i=0;
			while(i<s) {
				j=s-1;
				while(j>i){
					System.out.print(" ");
					j--;
				}
				j=0;
				while(j<2*i+1) {
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
				
			}
		
		    i=0;
			while(i<s) {
				j=-1;
				while(j<i){
					System.out.print(" ");
					j++;
				}
				j=s-2;
				while(j>2*i-s+1) {
					System.out.print("*");
					j--;
				}
				System.out.println();
				i++;
			}
			
			
	
			
			
	}else {
		System.out.println("홀수만입력해주세요.");
	}
		
  }
}
