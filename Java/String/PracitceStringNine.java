/*새로 배운 것
replaceAll란?
replaceAll() 함수는 대상 문자열을 원하는 문자값으로 변환하는 함수이다.
첫번째 매개변수는 변환하고자 하는 대상이 될 문자열
두번째 매개변수는 변환할 문자 값

replace와 replaceAll차이
String allTest = "aaabbbvccacfgdracabtghd"; 
System.out.println( allTest.replace("ab","0") ); // aa0bbvccacfgdrac0tghd 
System.out.println( allTest.replaceAll("[ab]","0") ); // 000000vcc0cfgdr0c00tghd


*/


package Practice;


import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PracitceStringNine{
	int time,count,count2,i, str2,a,b;
	public Scanner sc;
	String str;
	
		
		public void run(){
			sc=new Scanner(System.in);
			System.out.println("문자를 입력해주세요.");
			str = sc.nextLine().trim();
			sc.close();
			String[] cro= {"c=","c-","dz=","d-","lj","nj","s=","z="};
			
			for(i=0;i<cro.length;i++) {
				if(str.contains(cro[i])) {
					str=str.replaceAll(cro[i]," ");
			
				}
			}
			System.out.println(str.length());
			
			

			
			
			
		 }
		
		}

/*
문제
예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 
따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

크로아티아 알파벳	변경
č	c=
ć	c-
dž	dz=
đ	d-
lj	lj
nj	nj
š	s=
ž	z=
예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. 
lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

입력
첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.

단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

출력
입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

 
 */
 

