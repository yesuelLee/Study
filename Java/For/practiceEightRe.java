package practice;

import java.util.Scanner;

public class practiceEightRe {

	private Scanner sc ;
	private int N,i,j,k;
	public practiceEightRe() {
		sc=new Scanner(System.in);
		i=0;
		j=0;
		k=0;
	}
	public void run() {
		System.out.println("구구단 몇단까지 할건가요?");
		
		N=sc.nextInt();
		if((N>0)&&(N<99)) {
	
			//단
			for(k=1 ; k<=N;k=k+3) {
				//곱해지는 수
				for( i=1;i<=9;i++) {
					//3번만 반복 하도록 
					for( j=k;j<=k+2;j++) {
						if(j<=N)
							System.out.print(j+"X"+i+"="+i*j+"\t");
					}
					System.out.println("");
				}
				System.out.println();
			}
			
			
			
			/* 오답이였던 풀이 과정
			for(int i=1;i<=9;i++) {
				for(j=4;j<=6;j++) {
					if(j<=N)
						System.out.print(j+"X"+i+"="+i*j+"\t");
				}
				System.out.println("");
			}
			System.out.println();
			for(int i=1;i<=9;i++) {
				for(j=7;j<=9;j++) {
					if(j<=N)
						System.out.print(j+"X"+i+"="+i*j+"\t");
				}
				System.out.println("");
			}
			System.out.println();
			*/
		
		}
		else {
		  System.out.println("0보다 크고 99보다 작은 수를 입력해주세요.");
		  return;
	}
}
	
	public void run2() {
		//다시 해보기
		System.out.println("구구단 몇단까지 할건가요?");
		sc=new Scanner(System.in);
		N=sc.nextInt();
		if((N>0)&&(N<99)) {
		//1~3단
		   for(k=1;k<=N;k=k+3) {
			for(i=1;i<=9;i++) {
				for(j=k;j<=k+2;j++) {
					if(j<=N)
						System.out.print(j+"X"+i+"="+i*j+"\t");
				}
				System.out.println("");
		
			}System.out.println();
			}
		}
		else {
		  System.out.println("0보다 크고 99보다 작은 수를 입력해주세요.");
		  return;
	}
}

}


