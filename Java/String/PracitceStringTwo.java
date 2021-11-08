package Practice;


import java.util.Scanner;

public class PracitceStringTwo{
	int i;
	
	
		
		public void run(){
			 Scanner sc = new Scanner(System.in);
			 System.out.println("몇개의 숫자를 입력할건가요?");
		        int x = sc.nextInt();
		        System.out.println("연속으로 숫자를 나열해주세요~");
		        String y = sc.next();
		        int result = 0;
		        
		        sc.close();
		        
		        for(int i=0; i<x; i++) {
				//substring함수를 사용해서 인덱스 0부터 끝까지 받아서 "정수로만 이루어진 스트링"을 int 로 바꿔준다.
		            result += Integer.parseInt(y.substring(i, i+1));
		        }
		        
		        System.out.println(result);
		    }

}
/*
 문제
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

출력
입력으로 주어진 숫자 N개의 합을 출력한다.
 
 */

//-Integer.parserInt()는 String을 int형이 10진수로 바꿔준다.

//-Integer.parserInt("1004",8)  문자열인 "1004"를 8진수인 int형으로 바꿔준다.

//-Integer.parserInt("1004",16) 문자열인 "1004"를 16진수인 int형으로 바꿔준다.
 
