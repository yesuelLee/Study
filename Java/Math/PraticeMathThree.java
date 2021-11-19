package Practice;
import java.math.BigInteger;
//새로 배운 내용
//1.BigInteger : 문자열(사칙연산 안됨)
//덧셈하려면 A+B는 ->A.add(B)); 처럼 사용해야 함.

import java.util.Scanner;


public class PraticeMathThree {

	private Scanner sc;
	
	
	public void run() {
		sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		BigInteger A = new BigInteger(sc.next());
		System.out.println("덧셈할 숫자를 입력해주세요.");
		BigInteger B = new BigInteger(sc.next());
		
		A=A.add(B);
		System.out.println(A.toString());
	}//run-end


	
		
	


}//class-end

/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)

출력
첫째 줄에 A+B를 출력한다.
 
 */
