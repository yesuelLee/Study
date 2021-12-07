/*
주사위 2개 입력 후 나올 수 있는 모든 경우의 수 구하기

*/


package Practice;


import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PraciticeFor2One{
	int i,j,n,m;
	public Scanner sc;
	String str;
	
		
		public void run(){
			sc=new Scanner(System.in);
			System.out.println("첫번째 주사위 값을 입력해주세요");
			n=sc.nextInt();
			System.out.println("두번째 주사위 값을 입력해주세요");
			m=sc.nextInt();
			
			//첫번째 주사위
			for(i=1;i<=n;i++) {
				for(j=1;j<=m;j++) {
					System.out.println(i+" "+j);
				}
			}

			
			
			
		 }
		
		}

/*
 https://codeup.kr/problem.php?id=1081
 
문제
1부터 n까지, 1부터 m까지 숫자가 적힌
서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.


반복 실행구조를 사용할 때에는
반복횟수를 기록해 두기 위해 i, j와 같은 변수를 선언해 사용해야 한다.

입력
주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
단, n, m은 10이하의 자연수


출력
나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다.
첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.
 
 */
 

