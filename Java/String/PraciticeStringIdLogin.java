/*
ID,PW 입력해서 아이디 만든 후 로그인 하기!
*/


package Practice;


import java.util.Scanner;

public class PraciticeStringIdLogin{
	private Scanner sc ;
	private String str,pw,str2,pw2;
	
	
	
	public void run() {
		sc = new Scanner(System.in);
		
		//회원가입
		System.out.println("만들고자하는 아이디를 입력해주세요.");
		str=sc.nextLine();
		System.out.println("사용하고자하는 비밀번호를 입력해주세요.");
   		pw=sc.nextLine();
    
		if(str.equals(" ")&&pw.equals(" ")) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
  		}else {
			System.out.println(str+"님 회원가입이 완료되었습니다.");
		}
    
      		//로그인
	        System.out.println("로그인 할 아이디를 입력해주세요.");
	        str2=sc.nextLine();
	 	System.out.println("비밀번호를 입력해주세요.");
	        pw2=sc.nextLine();

	    	if(str2.equals(str)&&pw2.equals(pw)){
	    	  System.out.println("welcome "+str+"님!");

	    	}else{
	    	  System.out.println("아이디와 비밀번호를 확인해주세요.");
	      	}

		
}
		


		
		
}
		

/*
 문제 설명

원하는 ID와 PW를 입력하여 아이디 생성 후 그 아이디와 비밀번호가 같을 시, welcome! Id 출력.
동일 하지 않을 시, 아이디, 비밀번호를 확인해주세요 출력.

입력
ID PW를 입력한다.(ID,PW는 10글자 미만 영문자이다.공백없음)
출력
welcome! ID 형태로 출력한다.
입력 예시   
practice
practice

practice
practice
출력 예시
welcome! practice

입력 예시   
practice
practice

practice
dd
출력 예시
아이디와 비밀번호를 확인해주세요
 */
