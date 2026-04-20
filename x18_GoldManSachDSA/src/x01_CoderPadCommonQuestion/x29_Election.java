package x01_CoderPadCommonQuestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class x29_Election {
    
	  public static void main(String[] args) {
		 int n =5; 
		 int k = 2;
		 
		 Queue<Integer> que = new LinkedList<>();
		 for(int i =1;i<=n;i++) { 
			   que.add(i);
			   
		 }
		 int i =0;
		 while(que.size()>1) {
			    
			   for(int count=1;count<k;count++) {
				    que.add(que.poll());
				  
			   }
			   que.poll();
		 }
		 System.out.println(que.poll());
	}
	  
} 
