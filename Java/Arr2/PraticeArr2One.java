package Practice;
import java.util.Arrays;
import java.util.Scanner;
// Arrays.sort(Arr) - 오름차순 정렬.

public class PraticeArr2One{
	private Scanner sc;
	int N,i;
	public void run() {
		sc=new Scanner(System.in);
		System.out.println("몇개의 숫자를 입력하실거요?");
		N=sc.nextInt();
		int[] A = new int[N];
		System.out.println("숫자를 입력해주세요.");
		for(i=0;i<N;i++) {
			A[i] = sc.nextInt();
			
		}
		
		 Arrays.sort(A);
		 for(i=0;i<N;i++) {
			 System.out.println(A[i]);
		 }
	}//run-end


	
		
	


}//class-end

/*
문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다. 
이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */
