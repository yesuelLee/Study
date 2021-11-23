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


public class PraticeArr2Three{
	private Scanner sc;
	long N;
	int i;
	public void run() {
		sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		System.out.println("몇개의 숫자를 입력하실거요?");
		N=sc.nextInt();
		
		ArrayList<Integer> list =new ArrayList<>();
		System.out.println("숫자들을 입력해주세요.");
		if(N>=1&&N<=10000000) {
			for(i=0;i<N;i++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list);
			for(Integer j : list) {
				sb.append(j).append("\n");
			}
			System.out.println(sb);
		}
		
		else {
			System.out.println("숫자의 갯수는 1보다 크거나 같고 10,000,000보다 작거나 같은 수를 입력해주세요.");
		}
	}//run-end


	
		
	


}//class-end

/*
문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 
둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다. */
