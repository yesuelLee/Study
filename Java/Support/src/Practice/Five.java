package Practice;

import java.util.Scanner;

public class Five {
	private int a;
	private int b;
	public Five() {
		a=0;
		b=0;
	}
	public void Run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ��� ���� �Է����ּ���.");
		a=sc.nextInt(); 
		if((a<1000)&&(a>99)) 
			System.out.println(a+"-----(1)");
		else{
		    System.out.println("���ڸ��� ���� �ƴմϴ�. �ٽ� �Է����ּ���");
		    	return;
		}
		System.out.println("������ ���ڸ��� ���� �Է����ּ���.");
		b=sc.nextInt();
		if((b<1000)&&(b>99)) 
			System.out.println(b+"-----(2)");
    	else {
    		System.out.println("���ڸ��� ���� �ƴմϴ�. �ٽ� �Է����ּ���");
    		return;
    	}
		
		System.out.println(a*(b%10)+"-----(3)");
		System.out.println(a*((b%100)/10)+"-----(4)");
		System.out.println(a*((b%1000/100))+"-----(5)");
		
		System.out.println((a*b)+"-----(6)");
		}
		

};