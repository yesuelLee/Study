package Practice;

import java.util.Scanner;

public class PracticeArrOne {

	private Scanner sc ;
	private int N,i,max,min;
	
	
	
	public void run() {
		sc = new Scanner(System.in);
		
		System.out.println("입력받을 숫자의 갯수를 입력해주세요.");
		N=sc.nextInt();
		if(1<=N&&1000000>=N) {
			int[] A= new int[N];
			
			System.out.println("입력받을 숫자들을 입력해주세요");
			  for(i=0;i<A.length;i++) {				
		    	A[i]=sc.nextInt();
			  }
			  
			  
			  max=A[0];
			  min=A[0];
			  for(i=0;i<A.length;i++) {
		    	if(max<A[i]) {
		    	   max=A[i];
		    	}
		    	else if(min>A[i]) {
		    	   min=A[i];
		    	}
		    	
			  }
			  System.out.println(max+"\t"+min);
			  
		}//if-end
		else {
			System.out.println("입력값은 1보다 크거나 값고 1,000,000보다 작거나 같은 숫자를 입력해주세요.");
			
		}//else-end
	

	}//run-end
//class-end

}
