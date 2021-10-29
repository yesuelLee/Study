package Practice;

import java.util.Scanner;

public class PracticeArrTwo {

	private Scanner sc ;
	private int N,i,max,a;
	
	
	
	public void run() {
		sc = new Scanner(System.in);
		N=9;
			int[] A= new int[N];
			
			System.out.println("입력받을 숫자들을 입력해주세요");
			  for(i=0;i<A.length;i++) {				
		    	A[i]=sc.nextInt();
			  }
			  max=A[0];
			  for(i=0;i<A.length;i++) {
		    	if(max<A[i]) {
		    	   max=A[i];
		    	   a=i; //*****오늘의 핵심***** 
		    	}
		    
		    	
			  }
			  System.out.println(max);
			  System.out.println(a+"번재 숫자"); 
			  
		
		
		
	

	}//run-end


}//class-end
