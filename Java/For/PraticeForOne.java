package Practice;

import java.util.ArrayList;
//새로 배운 내용
//StringBuilder = 기존의 데이터에 더하는 방법, 긴 문자열을 더하는 상황이 발생 할 경우 적극 사용
//StringBuilder에는 append()를 사용하여 문자열을 더하는 역할을 함.
//사용법
//StringBuilder sb=new StringBuilder();
//sb.append("ABC");
//sb.append("DEF");
//System.out.println(sb.toString());
//결과:ABCDEF

//Collections.max(arr) =arr에서 가장 큰 숫자 반환
//Collections.min(arr) =arr에서 가장 작은 숫자 반환
//Collections.sort(arr) =arr에서 오름차순으로 정렬
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class PraticeForOne{
	private Scanner sc;
	int i,j,N;
	
	public void run() {
		sc=new Scanner(System.in);
		
		N=sc.nextInt();
		for(i=0;i<N;i++) {
			for(j=0;j<=N;j++) {
				if(j>=N-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("   ");
		for(i=0;i<N;i++) {
			for(j=0;j<=N;j++) {
				if(j>=N-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
	
	 
	}//run-end


	
		
	


}//class-end

/*
    *
   **
  ***
 ****
 
****
 ***
  **
   * 
 
 
*/
