//새로 배운 것
//1. String 값을 숫자로 바꾼뒤 거꾸로 하기!
// Integer.parseInt(strBuffer1.reverse().toString());

//문제 요약: 두 수를 입력받은 후 그 수의 거꾸로 한 값에서 큰 수를 고르기.
package Practice;


import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PracitceStringSeven{
	int a,b;
	public Scanner sc;
	String num1,num2;
	
		
		public void run(){
			sc=new Scanner(System.in);
			System.out.println("숫자를 입력해주세요.");
			num1=sc.nextLine();
			System.out.println("또 다른 숫자를 입력해주세요.");
			num2=sc.nextLine();
			
			//값 선언
			StringBuffer strBuffer1 = new StringBuffer(num1);
			StringBuffer strBuffer2 = new StringBuffer(num2);

			
			a = Integer.parseInt(strBuffer1.reverse().toString());
			b = Integer.parseInt(strBuffer2.reverse().toString());
			

			int a1 = (int) a;
			int b1 = (int) b;
			
			if(a1<b1) {
				System.out.println(b1);
			}else if(a1>b1) {
				System.out.println(a1);
			}

			
			
			
		 }
		
		}

/*
문제
상근이의 동생 상수는 수학을 정말 못한다. 
상수는 숫자를 읽는데 문제가 있다. 
이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 
0이 포함되어 있지 않다.

출력
첫째 줄에 상수의 대답을 출력한다.

 
 */
 

