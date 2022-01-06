package Practice;
/*

끝말잇기 하기!
*/
import java.util.Scanner;

public class PracticeStringWordChainGame {

	private Scanner sc ;
	private String a,b,c;
	
	
	
	public void run() {
		sc = new Scanner(System.in);
		a=sc.next();
		b=sc.next();
		c=sc.next();
		
		char[] d=a.toCharArray();
		char[] e=b.toCharArray();
		char[] f=c.toCharArray();
		
		if(d[0]==f[f.length-1]) {
			if(e[0]==d[d.length-1]) {
				if(f[0]==e[e.length-1]) {
					System.out.println("good");
				}else {
					System.out.println("bad");
				}
				
			}else{
				System.out.println("bad");
			}
		}else {
			System.out.println("bad");
		}
			  
		
		
		
	

	}//run-end


}//class-end



/*
2721: 순환 문자열

문제 설명
영어 소문자로 구성된 단어 S1, S2, S3가 있을때,

S1의 마지막 문자가 S2의 첫 글자와 같고,

S2의 마지막 글자가 S3의 첫 글자와 같고,

S3의 마지막 글자가 S1의 첫 글자와 같으면 순환 문자열이라고 한다.

예를 들어 turtle error robot 인 경우 순환 문자열이다.

세 단어가 주어졌을 때 순환 문자열이면 good을 출력, 아니면 bad를 출력하시오.

입력
영어 소문자로 구성된 단어 S1, S2, S3가 각 줄에 한개씩 입력된다.(각 문자열에 공백은 없으며 길이는 2글자 이상 20글자 이하이다.)

출력
순환 문자열이면 good을 출력, 아니면 bad를 출력하시오.

입력 예시   
turtle
error
robot

출력 예시
good



*/