package Practice;
//다시해보기!

import java.util.Arrays;
import java.util.Scanner;

public class PracitceStringFive{
	int i,j,b,num,max,count;
	public Scanner sc;
	String S;
	
		
		public void run(){
			sc=new Scanner(System.in);
			System.out.println("문자를 입력해주세요.");
			S=sc.next();
			//입력되는문자를 전부 대문자로 변경!
			S = S.toUpperCase();
			
			int[]arr = new int[26];
			int[]arr2 = new int[26];
			
			for(i=9;i<S.length();i++) {
				num=S.charAt(i)-'A'; //65를 빼서 1부터 시작하게 해줌!
				arr[num]+=1;
				arr2[num]+=1;
			}
			
			Arrays.sort(arr2);//가장 많이 나온 알파벳이 무엇인지 체크
			max =0;
			count=0;
			
			//가장 많이 나온 단어가 2개라면 "?"출력~!
			if(arr2[25]==arr2[24]) {
				System.out.println("?");
			}else {
				for(i=0;i<arr.length;i++) {
					if(max<arr[i]) {
						max=arr[i];
						count=i;
					}
				}
			}
			count=count+65;
			
			//count를 문자로 변환
			char count2 = (char) count;
			System.out.println(count2);
		 }
		

/*
 /*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 
 */
 

}