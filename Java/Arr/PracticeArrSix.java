package Practice;

import java.util.Scanner;


public class PracticeArrSix {

	
	private Scanner sc ;
	private int A,B,i,Arr,C,N,a,b,j;
	int count=0;
	//int[] A= new int[N];
	
	public void run() {
		sc = new Scanner(System.in);
		System.out.println("나눠질 숫자를 입력하세요.");
		B=sc.nextInt();
		int[] D=new int[10];
		int[] A=new int[10];
		System.out.println("자연수 10개를 입력하세요.");
		
		//자연수 10개 출력.
		for(i=0;i<A.length;i++) {
			A[i] =sc.nextInt();
			D[i] =(A[i]%B);
		}
		//자연수 10개를 B로 나눈 값 출력
		for(i=0;i<D.length;i++) {
		    	C=D[i]%B;
			    System.out.println("나머지값은="+C);
				count++;
				
		}
		
		
		//서로 다른 나머지값 숫자 출력.
    	for(i=0;i<D.length;i++) {
    		for(j=0;j<i;j++) {
    			if(D[i]==D[j]) {
    				count--;
    				break;
    			
    		}
    		}count++;
    			
		}System.out.println(count-10);		
			
		
		
	

	}//run-end


}//class-end
