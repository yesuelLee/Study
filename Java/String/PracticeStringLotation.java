package Practice;
/*
 단어가 몇 번 나오는 지 숫자 세기
*/
import java.util.Scanner;

public class PracticeStringLotation {

	private Scanner sc ;
	private int i,j,n;
	
	
	
	public void run() {
		sc=new Scanner(System.in);
		System.out.println("몇까지의 숫자를 로테이션할건가요?");
		n=sc.nextInt();
		
		
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
	

	}//run-end


}//class-end



/*
문제 설명
n개의 숫자가 입력되면,

n개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오.

예) 1 2 3 4 5가 입력된 경우,

1 2 3 4 5

2 3 4 5 1

3 4 5 1 2

4 5 1 2 3

5 1 2 3 4

입력
첫째 줄에 숫자의 개수 n이 입력된다.( 1 <= n <= 1,000)

둘째 줄에 n개의 정수 k가 공백으로 구분되어 입력된다.(1 <= k <= 1,000)

출력
숫자를 로테이션한 결과를 출력한다.(단, 왼쪽으로만 돌린다.)

입력 예시   
5
1 2 3 4 5 

출력 예시
1 2 3 4 5 
2 3 4 5 1 
3 4 5 1 2 
4 5 1 2 3 
5 1 2 3 4 


*/