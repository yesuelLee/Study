package Practice;

import java.util.Scanner;

public class PracticeWhilePlus2 {

	private Scanner sc ;
	private int N;
	
	
	
	public void run() {
		sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		N=sc.nextInt();
		
		for(;1<=N;N--) {
			System.out.println(N);
		}
	
}
}

