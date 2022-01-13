package Practice;
/*
 단어가 몇 번 나오는 지 숫자 세기
*/
import java.util.Scanner;

public class PracticeStringMooYaHoCount {

	private Scanner sc ;
	private int answer,count;
	
	
	
	public void run() {
        answer = 0;
		char[] check_word = {'m','o','o','y','a','h','o'};
		count = 0;
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		char[] words = str.toCharArray();
		for(char ch : words) {
			if(ch == check_word[count]) {
				count++;
				if(count == 7) {
					answer++;
					count = 0;
				}
			}else {
				count = 0;
			}
		}
		
		System.out.println(answer);
	
			  
		
		
		
	

	}//run-end


}//class-end



/*
영어 문장이 입력된다.

그 문장에서 "mooyaho"가 몇 번 나오는지 출력하시오.

입력
영어 한 문장이 입력된다.(공백 있음, 최대 글자수 100)

출력
소문자 mooyaho가 몇 번 나오는지 출력한다.

입력 예시   
mooyaho mooyaho mooyaho mooyaho mooyaho

출력 예시
5


*/