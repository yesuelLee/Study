package Practice;

import java.util.Scanner;

public class PracticeEleven {
	private Scanner sc ;
	private int i,j,s;
	
	
	
	public void run() {
		System.out.println("홀수 숫자를 입력해주세요");
		sc=new Scanner(System.in);
		s=sc.nextInt(); 
		if(s%2!=0) {
			for(i=0;i<s;i++) {
				for(j=s-1;j>i;j--) {
					System.out.print(" ");
				}
				for(j=0;j<2*i+1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(i=0;i<s;i++) {
				for(j=-1;j<i;j++) {
					System.out.print(" ");
				}for(j=s-2;j>2*i-s+1;j--) {
					System.out.print("*");
				}System.out.println();
			}
			
	}else {
		System.out.println("홀수만입력해주세요.");
	}
  }
}
