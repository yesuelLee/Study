
/*
 2개씩 별계단 만들기~
*/


package Practice;


import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PraciticeFor2Five{
	int i,j,a,b,c;
	public Scanner sc;
	
		
		public void run(){
			sc=new Scanner(System.in);
			System.out.println("몇층까지의 계단을 만들건가요?");
			a=sc.nextInt();
			//첫번째 주사위
			
			for(i=0;i<a;i++) {
				System.out.println("**");
				for(j=0;j<=i;j++) {
					System.out.print(" ");
				}
				
			}System.out.println();
			
		 }
}
		
		
		
		

/*
n이 입력되면 n층의 별 계단을 출력하시오.

예) n= 5인 경우,

**
 **
  **
   **
    **
입력
계단의 높이 n이 정수로 입력된다.( 1<= n <= 100)

출력
n층의 별 계단을 출력한다.(n이 1일 경우 **을 출력한다.)

입력 예시   
3

출력 예시
**
 **
  **
 */
 

