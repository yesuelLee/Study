package Practice;

import java.util.Scanner;
/*
 for문을 이용해서 1부터 200까지의 정수 중에서 입력 받은 수의 배수의 총합을 구하는 코드를 작성하시오.(출처 : 이것이 자바다 p133 3번 변형문제) 
 */
public class PracticeNine {
	Scanner sc = new Scanner(System.in);
	
	int sum=0;

	public void run() {
		System.out.println("합을 구할 배수를 입력해주세요.");
		int M=sc.nextInt();
		for(int i=1; i<=200; i++) {
			if(i%M==0) {
				sum=sum+i;
			}
		}System.out.println(M+"의 배수의 합은 "+sum+" 입니다.");
	}
 
 }

