package Practice;

import java.io.IOException;
import java.util.Scanner;

public class PracitceStringTwo{
	int a,i;
	
	
	public void run() throws IOException{
		 Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        String y = sc.next();
	        int result = 0;
	        
	        sc.close();
	        
	        for(int i=0; i<x; i++) {
	            result += Integer.parseInt(y.substring(i, i+1));
	        }
	        
	        System.out.println(result);
	    }

}
