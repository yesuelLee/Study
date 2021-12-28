/*
String, love입력시 I Love you 출력하기!
equals사용  비교 연산자
*/


package Practice;


import java.util.Scanner;

public class PraciticeStringLove{
	private Scanner sc ;
	private String str;
	
	
	
	public void run() {
		sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요.");
		str=sc.nextLine();
		
		if(str.equals("love")) {
			System.out.println("I Love You");
		}else {
			System.out.println("love외에는 입력받고싶지않습니다만?");
		}
		


	}

		
}
		


		
		
		
		

/*
 문제 설명
영단어 하나가 입력된다.

그 단어가 love이면 I love you. 를 출력하시오.

입력
영어 단어 하나가 입력된다.

출력
love가 입력되면 I love you.를 출력하시오. 만약 다른 단어가 입력되면 "love외에는 입력받고싶지않습니다만?" 출력.

입력 예시   
love

출력 예시
I love you.
 */
 

