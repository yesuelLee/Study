package practice;
//스캐너사용하여 값 입력받기
import java.util.Scanner;

public class PracticeTwo {
	
	public static void main(String[] args) {
		
		 
	    
           for(;;) {
        	   int A = 0;
        	   int B = 0;
        	   if((A>=1)&&(B<=10000)) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("A 숫자를 입력하세요");
		        A=sc.nextInt();
		        System.out.println("B 숫자를 입력하세요");
		        B=sc.nextInt();


		        if((A==0)&&(B==0)) {
		        	break;
		        	}
		        
		        System.out.println("A+B="+(A+B));
		        System.out.println("A-B="+(A-B));
		        System.out.println("A*B="+(A*B));
		        System.out.println("A/B="+(A/B));
		        System.out.println("A%B="+(A%B));
		       
		      
		       
		        
           }
           
	     }
	}
}

