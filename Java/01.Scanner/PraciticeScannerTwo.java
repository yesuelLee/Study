
/*
거스름돈 구하기
*/


package Practice;


import java.util.Scanner;

public class PraciticeScannerTwo{
	int cost,change;
	public Scanner sc;

		
		public void run(){
			sc=new Scanner(System.in);
			System.out.println("물건의 가격을 입력해주세요.");
			cost=sc.nextInt();
			
			change=1000-cost;
			
			System.out.println("500원 "+change/500+"개");
			System.out.println("100원 "+(change%500)/100+"개");
			System.out.println("50원 "+((change%500)%100)/50+"개");
			System.out.println("10원 "+(((change%500)%100)%50)/10+"개");
			
		}
			
			


		

		
}
		


		
		
		
		

/*
 천원 이하의 물건을 팔때, 천원을 넣었을때 거스름돈 500원,100원,50원,10원 순으로 거스름도 동전의 수 출력

 */
 

