package Test;

import java.util.Scanner;

public class PracticeEightTwo {
	private Scanner sc ;
	private int N,i,j;
	
	public void run() {
		System.out.println("������ ��ܱ��� �Ұǰ���?");
		sc=new Scanner(System.in);
		N=sc.nextInt();
		int i=1,j=1, k=1;
		if((N>0)&&(N<99)) {
		
		for(k=1;k<=N;k+=3) {
			for( i=1; i<=9;i++) {
				for( j=k; j<=k+2;j++) {
					if(j<=N) {
						System.out.print(j+"X"+i+"="+i*j+"\t");
					}
				}
				System.out.println("");
			}
			System.out.println();
			}
		}
		else {
		  System.out.println("0���� ũ�� 99���� ���� ���� �Է����ּ���.");
		  return;
	}
}
}
