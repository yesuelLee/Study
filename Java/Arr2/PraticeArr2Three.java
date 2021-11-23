package Practice;

import java.util.ArrayList;
//PracticeArr2Two 하고 다른점??
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
