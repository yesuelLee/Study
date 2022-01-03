/*
ID,PW 입력해서 아이디 만든 후 로그인 하기!

*/


package Practice;


import java.util.Scanner;

public class PraciticeStringQuiz{
	private Scanner sc ;
	private String one,two,three,four,five;
	
	
	
	public void run() {
		sc = new Scanner(System.in);
		
		//회원가입
		System.out.println("왕이 궁에 들어가기 싫을 때 하는 말은??");
		one=sc.nextLine();
    
		if(one.equals("궁시렁")) {
			System.out.println("당신의 센스에 감탄하며 머리를 탁치고갑니다!");
			System.out.println("첫번째 문제 정답! 어디까지 가는지 지켜보겠어요! ");
  		}else {
  			System.out.println("틀렸습니다. 더 생각해 보시지 (힌트:궁ㅇㅇ)");
  			
		}
		
		
		System.out.println("송해 할아버지가 목욕을 하시면?");
   		two=sc.nextLine();
   		
   		if(two.equals("뽀송해")) {
			System.out.println("당신의 센스에 감탄하며 머리를 탁치고갑니다! 2번째 문제 정답! ");
  		}else {
  			System.out.println("틀렸습니다. 더 생각해 보시지 (힌트:ㅇ송해) ");
		}
   		
   		System.out.println("폭력배가 가장 많은 나라는?");
   		three=sc.nextLine();
   		
   		if(two.equals("칠레")) {
			System.out.println("당신의 센스에 감탄하며 머리를 탁치고갑니다! 3번째 문제 정답! ");
  		}else {
  			System.out.println("틀렸습니다. 더 생각해 보시지 (힌트:없음)");
		}
		
   		System.out.println("왕이 꿈틀대면??");
   		four=sc.nextLine();
   		
   		if(two.equals("왕꿈틀이")) {
			System.out.println("당신의 센스에 감탄하며 머리를 탁치고갑니다! 4번째 문제도 정답! ");
  		}else {
  			System.out.println("틀렸습니다. 더 생각해 보시지 (힌트:젤리)");
		}
   		
   		System.out.println("치과의사가 좋아하는 아파트는??(한글로치세요.)");
   		five=sc.nextLine();
   		
   		if(two.equals("이편한세상")) {
			System.out.println("당신의 센스에 감탄하며 머리를 탁치고갑니다! 정답! ");
  		}else {
  			System.out.println("틀렸습니다. 더 생각해 보시지 (힌트:아파트 이름)");
		}
   		
   		
}
		


		
		
}
		

/*
 문제 설명
 퀴즈 풀기!!!

입력 예시   
비밀
비밀
비밀
비밀
비밀

출력예시
비밀
비밀
비밀
비밀
비밀

 */
