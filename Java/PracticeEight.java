package Practice;

import java.util.Scanner;

public class PracticeEight {
	
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		System.out.println("구구단 몇단까지 할건가요?");
		int N=sc.nextInt();
		if((N>0)&&(N<99)) {
		for(int i=1; i<=N; i++){
			System.out.print(i+"단\t"); // \t 칸 간격 벌림
		}
		System.out.println();
		for(int i=1; i<=9; i++){
			for(int j=1; j<=N; j++){
				System.out.print(j+"X"+i+"="+j*i+"\t");
			}System.out.println();
		}
	
	}else {
		System.out.println("0보다 크고 99보다 작은 수를 입력해주세요.");
		return;
	}
}
}
		
	
	