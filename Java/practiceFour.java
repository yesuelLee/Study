package practice;
import java.util.Scanner;
public class practiceFour{

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


   	int H=0;
    int M=0;
       System.out.println("시간을 입력하세요.");
       H =sc.nextInt();
       System.out.println("분 단위를 입력하세요.");
       M=sc.nextInt();
       System.out.print("설정된 시간");

       if((M<60)&&(H<24)) {
        if(M>45) {
         System.out.println(H+"시"+(M-45)+"분 입니다.");
        }
        else if(M<45) {
	        if(H==0) {
	        	 H=24;
	        	 H--;
	        	System.out.println(H+"시"+((60+M)-45)+"분 입니다.");
	        }
	        H--;
        	System.out.println(H+"시"+((60+M)-45)+"분 입니다.");
       }
        
      }else{
    	 System.out.println("을 다시 한번 확인해주세요.");
     }
    }
  

  }

 
