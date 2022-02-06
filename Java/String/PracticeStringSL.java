package Practice;
/*
 단어가 몇 번 나오는 지 숫자 세기
*/
import java.util.Scanner;

public class PracticeStringSL {

	private Scanner sc ;
	private String name, pw,name2,pw2;
	
	
	
	public void run() {
		sc=new Scanner(System.in);
		System.out.println("환영합니다. 회원가입하실 아이디를 입력해주세요.");
		name=sc.next();
		System.out.println("가입하실 비밀번호를 입력해주세요.");
		pw=sc.next();
		
		
		System.out.println("로그인");
		System.out.println("로그인하실 아이디를 입력해주세요.");
		name2=sc.next();
		System.out.println("로그인하실 비밀번호를 입력해주세요.");
		pw2=sc.next();
		
		if(name.equals(name2)&&pw.equals(pw2) ) {
			System.out.println("환영합니다."+name+"님!");
		}else {
			System.out.println("아이디 및 비밀번호를 확인해주세요.");
		}
		
	

	}//run-end


}//class-end



/*
문제 설명
당신은 웹사이트 제작자이다.

ID를 입력하고 엔터를 누르면 환영 메시지를 띄우려고한다.

예를 들어 ID가 bbororo이고, 비밀번호가 123으로 가입을 했을때,

환영 메시지("환영합니다. bbororo님!") 출력하고,

비밀펀호나 패스워드가 맞지 않으면 

"아이디 및 비밀번호를 확인해주세요" 출력.

입력
ID 및 PW 입력한다.

출력
환영합니다. bbororo님!

입력 예시   
bbororo
123

출력 예시
환영합니다. bbororo님!

*/