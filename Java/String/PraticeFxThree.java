package Practice;
//한번더해보기!
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class PraticeFxThree {

	private Scanner sc;
	private int N;
	String B;
	int sum=0;
	static int count,i,a,b,c;
	
	
	public void run() throws NumberFormatException, IOException {
		//수열 입력!
		System.out.println("숫자를 입력하세요.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N= Integer.parseInt(br.readLine());
		
		System.out.println(count(N));


	}//run-end


	public static int count(int N) {
		if(N<100) {
			return N;
		}else {
			count=99;
			if(N==1000) {
				count--;
			}
			for(i=100;i<=N;i++) {
					a = i % 10; 
					b = (i / 10) % 10; 
					c = (i / 100) % 10;
					if(a-b==b-c) {
						count++;
					}
					
			}
			}return count;
		}
		
		
	


}//class-end

/*
문제
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 
 */
