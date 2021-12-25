
/*
사주 대박 코딩
BufferedReader - 한줄씩 입력 받기위한 클래스

*/


package Practice;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class PraciticeStringYMD {
	private Scanner sc ;
	private int result;
	
	
	
	
	public void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		String[] arr = new String[3]; 
		arr = br.readLine().split(" "); 
		int a = Integer.parseInt(arr[0]); 
		int b = Integer.parseInt(arr[1]); 
		int c = Integer.parseInt(arr[2]); 
		//String result = (a+b+c)/100%10%2 == 0 ? "대박" : "그럭저럭"; 
		
		result=a-b+c;
		if(result%10==0) {
			System.out.println("대박");
		}else {
			System.out.println("그럭저럭");
		}
	

		

	}

		
}
		


		
		
		
		

/*
 문제 설명
태어난 해, 월, 일을 입력받아 사주팔자를 보는 프로그램을 작성하시오.

사주를 보는 방법)

세 수(년,월,일)가 주어지면,  (년 - 월 + 일)에 마지막 숫자가 0이면 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력하세요.

입력
세 정수가 입력으로 주어진다. 순서대로 년도, 월, 일 이다.

출력
년도 - 월 + 일의 마지막 숫자가 0이면 "대박"을 , 그렇지 않으면 "그럭저럭"을 출력하시오.

입력 예시   
1902 2 10

출력 예시
대박
 */
 

