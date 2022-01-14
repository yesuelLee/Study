package Practice;
//별 찍기

import java.util.Scanner;

public class PracticeTen {

	private int i,j;
	
	public void run() {
		for(i=0;i<3;i++) {
			for(j=2;j>i;j--) {
				System.out.print(" ");
			}
			for(j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=0;i<3;i++) {
			for(j=-1;j<i;j++) {
				System.out.print(" ");
			}for(j=3;j>2*i;j--) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
}
