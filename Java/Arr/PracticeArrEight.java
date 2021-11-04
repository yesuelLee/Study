package Practice;

import java.util.Scanner;

public class PracticeArrEight{
	private Scanner sc;
	private int i,j;
	private double aver,averUp,C,N;
    int sum=0,count=0;
	
	
	public void run() {
		sc = new Scanner(System.in);
		System.out.println("테스트케이스 개수를 입력하세요.");
		C=sc.nextInt();
		
			
			for(i=0;i<C;i++) {
				int[]Score =new int[1000];
				System.out.println("학생 수를 입력하세요.");
				N=sc.nextInt();
				if(N>=1&&N<=1000) {
				 for(j=1;j<=N;j++) {
					System.out.println("점수를 입력해주세요.");
					Score[j]=sc.nextInt();
					if(Score[j]>=0&&Score[j]<=100) {
						
						sum+=Score[j];
					   
					}
					else {
						System.out.println("점수는 0보다 크거나 같고, 100보다 작은 숫자를 입력하세요.");
					}
					aver=sum/N;
					
					
				}
				 
				System.out.println("평균은"+aver);
				
				for(j=1;j<=N;j++) {
					System.out.println("@@@@@@@aver"+aver);
					System.out.println("@@@@@@@Score[j]"+Score[j]);
					if(aver<Score[j]) {
						count++;
					}
				}
				averUp=count/N*100;
				System.out.println("학생수"+N);
				System.out.println("카운트"+count);
				
				System.out.println("평균보다 높은 학생의 평균은"+Math.round(averUp*1000)/1000.00+"%");
				sum=0;aver=0;count=0;averUp=0;
				 
				
				
				}
				else {
					System.out.println("학생의 수 N(1 ≤ N ≤ 1000, N은 정수)로 입력해주세요.");
				}
			}
			
			
				
		
		
		
		
	

	}//run-end


}//class-end
