package Test;

import java.util.Scanner;

public class PracticeEightTwo {
	private Scanner sc ;
	private int N,i,j;
	
	public void run() {
		System.out.println("구구단 몇단까지 할건가요?");
		sc=new Scanner(System.in);
		N=sc.nextInt();
		int i=1,j=1, k=1;
		if((N>0)&&(N<99)) {
		
		for(k=1;k<=N;k+=3) {
			for( i=1; i<=9;i++) {
				for( j=k; j<=k+2;j++) {
					if(j<=N) {
						System.out.print(j+"X"+i+"="+i*j+"\t");
					}
				}
				System.out.println("");
			}
			System.out.println();
			}
		}
		else {
		  System.out.println("0보다 크고 99보다 작은 수를 입력해주세요.");
		  return;
	}
}
}
