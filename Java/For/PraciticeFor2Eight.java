
/*
 주사위 합 구하기~
*/


package Practice;


import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PraciticeFor2Eight{
	int i,j,k;
	public Scanner sc;
	
		
		public void run(){
			sc=new Scanner(System.in);
			System.out.println("두 주사위의 합을 입력해주세요!");
			k=sc.nextInt();
			
			
				for(i=1;i<=6;i++) {
					for(j=1;j<=6;j++) {
					if(i+j==k) {
						System.out.println(i+" "+j);
					}
					}
				}
	
			}
			
		
}

		
		
		
		

/*
문제 설명
주사위는 각 면에 1~6까지 적혀 있는 정육면체이다.

이런 주사위 2개를 굴려 합이 k가 나오는 경우를 조사하려고 한다.

예를 들어, 주사위 두개를 굴려 5가 나오는 경우는 1 4, 2 3, 3 2, 4 1 이다.

그리고 주사위를 하나만 굴리는 경우는 없다.

입력
두 주사위를 굴려 나오는 합 k 가 입력된다. 

출력
합이 k가 되는 두 주사위의 눈이 출력된다. 

첫 번째 출력되는 수는 첫번째 주사위의 눈이고, 두 번째 출력되는 수는 두번째 주사위의 눈이다.

출력은 첫번째 주사위의 눈이 작은 수에서 큰 순서로 출력한다.

입력 예시   
5

출력 예시
1 4
2 3
3 2
4 1

 */
 

