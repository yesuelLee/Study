package practice;

import java.util.Scanner;

public class practiceArrFive {
	
	private Scanner sc ;
	private int A,B,i,Arr;
	int count=0;
	//int[] A= new int[N];
	
	public void run() {
		sc = new Scanner(System.in);
		B=42;
		int[] A=new int[10];
		System.out.println("자연수 10개를 입력하세요.");
		for(i=0;i<A.length;i++) {
			A[i] =sc.nextInt()%B;
//			if(i%B!=A[i]%B){
//				count++;
//			}
			
		}for(i=0;i<A.length;i++) {
			System.out.println(count);
				count++;
		}
		
		
		
		
		
	

	}//run-end


}//class-end

