package Practice;

import java.util.Scanner;

public class PracticeEight {
	private Scanner sc ;
	private int N,i,j;
	
	public void run() {
		System.out.println("구구단 몇단까지 할건가요?");
		sc=new Scanner(System.in);
		N=sc.nextInt();
		if((N>0)&&(N<99)) {
		//1~3단
		   for(i=1; i<=9; i++) { 
			  for(j=1; j<=3; j++) { 
				if(j<=N) {
				System.out.print(j+"X"+i+"="+i*j+"\t");	
				}
		     }
			  System.out.println("");
		  }	
		   System.out.println();
		  //4~6단
		  for(i=1;i<=9;i++) {
			  for(j=4;j<=6;j++) { 
				  if(j<=N) {
				   System.out.print(j+"X"+i+"="+i*j+"\t");	
			    	}
		     }
			  System.out.println("");
		  }	 System.out.println();
		  //7~9단
		  for(i=1;i<=9;i++) {
			  for(j=7;j<=9;j++) {
				  if(j<=N) {
				System.out.print(j+"X"+i+"="+i*j+"\t");	}	
		     }
			  System.out.println("");
		  }
		  System.out.println();
		 }
		else {
		  System.out.println("0보다 크고 99보다 작은 수를 입력해주세요.");
		  return;
	}
}
}
		
	
	