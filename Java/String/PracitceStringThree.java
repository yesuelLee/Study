package Practice;


import java.util.Scanner;

public class PracitceStringThree{
	int A,B,i,result;
	
		
		public void run(){
			 Scanner sc = new Scanner(System.in);
			 	System.out.println("찾으시는 문자를 입력해주세요.");
			 	String A = sc.nextLine();
		      
		        int Arr[] = new int[26];	
		        sc.close();
		        for(int i=0; i<Arr.length; i++) {
		        	Arr[i]=-1;
		        }
		        //charAt(i)=String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환 해 줌.
		        for(i=0;i<A.length();i++) {
		          char B=A.charAt(i);
		          if(Arr[B-'a']==-1) {
		        	  Arr[B-'a']=i;
		          }//System.out.println(Arr[B-'a']);
		          
		        }
		        for(int i=0; i<Arr.length; i++) {
		        	System.out.print(Arr[i]+"\t");
		        }
		       
		        
		    }

}
/*
 /*
 문제
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

출력
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 
처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 
단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 
 */
 

 