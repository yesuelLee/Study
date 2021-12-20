/*
369게임하기!
*/


package Practice;


import java.util.Scanner;

public class PraciticeStringSamYukGoo{
	private Scanner sc ;
	private int N,i,count,j;
	
	
	
	public void run() {
		sc = new Scanner(System.in);
		System.out.println("숫자 몇까지 369게임을 하실건가요?");
		N=sc.nextInt();
		count=0;
		
		for(i=1;i<N;i++) {
			String str=String.valueOf(i);
			for(j=0;j<str.length();j++) {
				if(str.charAt(j)=='3'||str.charAt(j)=='6'||str.charAt(j)=='9') {
					count++;
				}
			}
		}System.out.println(count);
			  


	}

		
}
		


		
		
		
		

/*
 369게임
 주어진 숫자 이전 박수를 몇번 칠까요?
 33,36일 경우 박수 2번 쳐야함!
https://level.goorm.io/exam/48757/369-%EA%B2%8C%EC%9E%84/quiz/1
 */
 

