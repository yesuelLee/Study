package Practice;

	

public class PracticeArrOneMain {
	public static void main(String[] args) {
		PracticeArrOne praArr = new PracticeArrOne();
		praArr.run();
	}

}

/*
문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */




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
		
		
