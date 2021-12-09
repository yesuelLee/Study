/*
5의 배수 중 1개만 
*/


package Practice;


import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PraciticeFor2Four{
	int i,j,a,b,c;
	public Scanner sc;
	
		
		public void run(){
			sc=new Scanner(System.in);
			System.out.println("10개의 숫자를 입력해주세요.");
			String[] a = sc.nextLine().split(" ");
			
			
			//첫번째 주사위
			c=0;
			for(i=1;i<=10;i++) {
			    c = Integer.parseInt(a[i]);
				if(c%5==0) {
					System.out.println(c);
					break;
				}
			}
				if(c%5!=0) {
					System.out.println("0");
				}
				
				
			}
			
			
		 }
		
		
		
		

/*
문제 설명
10개의 수가 입력된다.

10개의 수 중 5의 배수를 하나만 출력한다.

만약 5의 배수가 없다면 0을 출력한다.

입력
10개의 자연수가 입력된다

출력
10개의 수 중 5의 배수가 있으면 그 중 하나만 출력하고, 없다면 0을 출력한다.

입력 예시   
1 2 3 4 5 6 7 8 9 10

출력 예시
5
 */
 

