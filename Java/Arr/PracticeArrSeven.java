package Practice;

import java.util.Scanner;


public class PracticeArrSeven {

	
	private Scanner sc ;
	private int A,C,i,j,O,X,D;
	String B;
	int count=0;
	int sum=0;
	//int[] A= new int[N];
	
	public void run() {
		sc = new Scanner(System.in);
		System.out.println("문제의 갯수를 입력해주세요.");
		C=sc.nextInt();
		
		System.out.println("각 문제의 O,X를 입력하세요.");
		
		for(i=0;i<C;i++) {
			B=sc.next();
			char[] Arr=B.toCharArray();
			for(j=0;j<Arr.length;j++) {
				if(Arr[j]=='O') {
					count++;
				}else if(Arr[j]=='X') {
					count=0;}
					sum=count+sum;
				
			}System.out.println(sum);
			sum=0; count=0;
		}
	
		
		
		
		
	

	}//run-end


}//class-end
