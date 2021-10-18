package Practice;

import java.util.Scanner;

public class practiceSix {
   public static void main(String[] args) {
	   int grade;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("점수를 입력해주세요.");
	   grade=sc.nextInt();
	   
	   if((grade>=0)&&(grade<=100)) {
		   if((90<=grade)&&(grade<=100)) {
			   System.out.println("시험점수는"+grade+"점으로, A입니다.");
		   }else if((80<=grade)&&(grade<=89)) {
			   System.out.println("시험점수는"+grade+"점으로, B입니다.");
		   }else if((70<=grade)&&(grade<=79)) {
			   System.out.println("시험점수는"+grade+"점으로, C입니다.");
		   }else {
			   System.out.println("시험점수는"+grade+"점으로, D입니다.");
		   }
	   }else {
		   System.out.println("0~100의 숫자를 입력해주세요.");
		   return;
	   }
  }
}
