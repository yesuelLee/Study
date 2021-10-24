package Practice;

import java.util.Scanner;

public class PracticeFourteen {

	private Scanner sc ;
	private int N,M,i,j,max,k;
	private double a,b,sum;
	
	
	
	public void run() {
		if(N>=0&&N<=100) {
		sc = new Scanner(System.in);
		System.out.println("과목의 갯수를 입력해주세요.");
		N=sc.nextInt();
		
		int[] M=new int[N];
		for(i=0;i<N;i++) {
			System.out.println(i+1+"번째 과목의 점수를 입력해주세요.");
			M[i]=sc.nextInt(); 
		    a=M[0];
		    for(j=1;j<M.length;j++) {
			 if(a<M[j]) {
				a=M[j];	
			 }
		    }
			
		    }//System.out.println("최대값은="+a);	
		    
		 for(j=0;j<N;j++) {   
			b=M[j];
		   // System.out.println(j+1+"번째 원래 점수는"+"="+b); 
		  //  System.out.println(j+1+"번째 새로운 점수는"+"="+b/a*100);
		    sum+=(b/a)*100;
		 }System.out.println("평균 점수는="+sum/N);
		}
		else {
			System.out.println("0부터 100까지의 숫자를 입력하세요");
		}
		
		
			
		
	}
	
	
	
	
}
