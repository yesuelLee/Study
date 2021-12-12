
/*
 별지그재그 만들기~
*/


package Practice;


import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PraciticeFor2Seven{
	int i,j,a,b,c;
	public Scanner sc;
	
		
		public void run(){
			sc=new Scanner(System.in);
			System.out.println("별의 높이를 입력해주세요!");
			a=sc.nextInt();
			//첫번째 주사위
			System.out.println("별의 반복 횟수를 정해주세요!");
			b=sc.nextInt();
			
			for(c=0;c<b;c++) {
				for(i=1;i<=a-1;i++) {
					System.out.println("*");
					for(j=i-1;j<i;j++) {
					System.out.print(" ");
					}
				}
	
				for(i=1;i<=a-1;i++) {
					System.out.print(" ");
					for(j=1;j<=i;j++) {
					System.out.println("*");
					}
				}
			}
			
		
		}
}

		
		
		
		

/*
문제 설명
높이 h와 반복휫수 r이 주어질때, 별을 다음과 같이 지그재그로 출력하자.

예) 3 2

*
 *
  *
 *
*
*
 *
  *
 *
*
입력
높이 h과 반복횟수 r가 한줄에 주어진다.(1<= h, r<=40)

출력
지그재그로 출력한 모습을 출력한다.

입력 예시   
3 3

출력 예시
*
 *
  *
 *
*
*
 *
  *
 *
*
*
 *
  *
 *
*



 */
 

