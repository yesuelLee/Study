package Practice;

import java.util.Scanner;

public class practiceThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		int X;
		
		   
		System.out.println("수열의 갯수를 입력하세요.");
		N =sc.nextInt();
		
	    System.out.println("정수를 입력하세요.");
	    X=sc.nextInt();
	    
	    int[] A = new int[N];
	    
	    System.out.println("원하는 숫자를 입력하세요.");
	    for(int i=0; i<N; i++) {
	    	A[i]=sc.nextInt();
	    }
	    
	    for(int j=0; j<N; j++) {
	    	if(A[j]<X) {
	    		System.out.println("입력하신 숫자중에 "+X+"보다 작은 숫자는"+(A[j])+""+"입니다.");
	    	}
	    }
	   

 }
}
