/*새로 배운 것
replaceAll란?
replaceAll() 함수는 대상 문자열을 원하는 문자값으로 변환하는 함수이다.
첫번째 매개변수는 변환하고자 하는 대상이 될 문자열
두번째 매개변수는 변환할 문자 값

replace와 replaceAll차이
String allTest = "aaabbbvccacfgdracabtghd"; 
System.out.println( allTest.replace("ab","0") ); // aa0bbvccacfgdrac0tghd 
System.out.println( allTest.replaceAll("[ab]","0") ); // 000000vcc0cfgdr0c00tghd


*/


package Practice;


import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PracitceMathFour{
	int V;
	public Scanner sc;
	String str;
	
		
		public void run(){
			System.out.println("나무 막대의 높이를 입력하세요.");
			V=sc.nextInt();

			
			
			
		 }
		
		}

/*
문제
땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

출력
첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
 
 */
 

