/*
구구단 하기~
*/


package Practice;


import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PraciticeFor2Two{
	int i,j,n;
	public Scanner sc;
	
		
		public void run(){
			sc=new Scanner(System.in);
			System.out.println("숫자 몇까지 구구단을 진행하실건가요?");
			n=sc.nextInt();
			
			//첫번째 주사위
			for(i=1;i<=n;i++) {
				if(i%3!=0) {
				System.out.print(i);
				}
				else {
					System.out.print("X");
				}
				
			}

			
			
			
		 }
		
		}

/*
 3 6 9 게임을 하던 영일이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.

입력
10 보다 작은 정수 1개가 입력된다.
(1 ~ 9)


출력
1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.


입력 예시   
9

출력 예시
1 2 X 4 5 X 7 8 X
 
 */
 

