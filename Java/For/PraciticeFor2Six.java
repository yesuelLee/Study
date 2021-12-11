
/*
 별계단 만들기~
*/


package Practice;


import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PraciticeFor2Six{
	int i,j,a,b,c;
	public Scanner sc;
	
		
		public void run(){
			sc=new Scanner(System.in);
			System.out.println("가로의 별 숫자를 입력해주세요!");
			a=sc.nextInt();
			//첫번째 주사위
			
			for(i=1;i<=a;i++) {
				System.out.print("*");
			}
			System.out.println();
			
			
			for(i=1;i<a-1;i++) {
				for(j=0;j<a;j++) {
					if(j==0||j==i||j==a-1||j==a-i-1) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}System.out.print("\n");
			}
			
			
			for(i=0;i<a;i++) {
				System.out.print("*");
			}
				
			}			
		 }

		
		
		
		

/*
문제 설명
역시 별로 사각형을 출력하는 문제이다.

하지만 여기서는 대각선을 출력해야한다.

프로그램은 다음과 같이 진행된다.

1. n이 입력된다.(3<=n<=100)

2.대각선이 포함된 n*n사각형을 출력한다.

입력
사각형의 크기 n이 정수로 입력된다.(3 <= n <= 100)

출력
대각선이 포함된 n*n 사각형을 출력한다.

입력 예시   
9

출력 예시
*********
**     **
* *   * *
*  * *  *
*   *   *
*  * *  *
* *   * *
**     **
*********
 */
 

