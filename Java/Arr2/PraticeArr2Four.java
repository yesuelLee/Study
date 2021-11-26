package Practice;
/*
새로 배운 내용
1.배열 2개 사용
 String[][] Nrr =new String[N][2]; 
2. 배열 오름차순
Arrays.sort(Nrr,new Comparator<String[]>() {
	            @Override
	            public int compare(String[] age, String[] name) {
	                return Integer.compare(Integer.parseInt(age[0]), Integer.parseInt(name[0]));
	            }
	        });

*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class PraticeArr2Four {

	private Scanner sc;
	int N,i;
	String N2;
	public void run()  {
		sc=new Scanner(System.in);
		System.out.println("회원의 수를 입력하세요.");
		N=sc.nextInt();
		
		String[][] Nrr =new String[N][2]; 
		
		System.out.println("회원의 나이와 이름을 입력하세요.");
		for(i=0;i<N;i++) {
			Nrr[i][0]=sc.next(); //나이
			Nrr[i][1]=sc.next(); //이름
		}
		
		 Arrays.sort(Nrr,new Comparator<String[]>() {
	            @Override
	            public int compare(String[] age, String[] name) {
	                return Integer.compare(Integer.parseInt(age[0]), Integer.parseInt(name[0]));
	            }
	        });
		 
		 for(String[]arr:Nrr) {
			 System.out.println(arr[0]+" "+arr[1]);
		 }
		
	}
}


/*
문제
온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 
이때, 회원들을 나이가 증가하는 순으로,
 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)

둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 
나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.

출력
첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 
나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.

*/