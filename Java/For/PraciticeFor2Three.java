/*
구구단 하기~
*/


package Practice;


import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PraciticeFor2Three{
	int i,j,a,b,c;
	public Scanner sc;
	
		
		public void run(){
			sc=new Scanner(System.in);
			System.out.println("시작할 숫자를 정해주세요.");
			a=sc.nextInt();
			
			System.out.println("끝날 숫자를 정해주세요.");
			b=sc.nextInt();
			
			c=0;
			//첫번째 주사위
			for(i=a;i<=b;i++) {
				if(i%2==0) {
					c=c-i;
				}
				else {
					c=c+i;
				}
				
				
			}System.out.println(c);
			
			
		 }
		
		
		
		}

/*
두 자연수 a, b 사이의 구간에 대해서

홀수는 더하고 짝수는 뺀다음의 합을 출력하시오.

예)

a = 5, b=10 일 경우, 5 - 6 + 7 - 8 + 9 - 10 = -3
 
 
입력
두 자연수 a, b를 입력 받는다. 

(반드시 a가 b보다 같거나 작게 입력된다.)

출력
a, b 사이의 수 중 홀수는 더하고 짝수는 뺀 결과를 출력하시오.

입력 예시   
5 10

출력 예시
-3
 */
 

