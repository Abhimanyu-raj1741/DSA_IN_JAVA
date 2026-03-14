package x01_CoderPadCommonQuestion;

import java.util.PriorityQueue;

public class x22_TieTwoRopes {
	
      public static void main(String[] args) {
    		int[] ropes = {5,3,1,4,2};
    		// OP  -> 19
    		  
//    		  1 2 3 4 5  time 0
//    		  3 3 4 5    time 2 
//    		  6 4 5  -> 4 5 6     time 5
//    		  9 6 -> 6 9            time 10
//    		  15                 time 19
    		  
    		   PriorityQueue<Integer> pq = new PriorityQueue<>();	
    		   int time = 0; 
    		   for(int i:ropes) {
    			   pq.add(i);
    		   }
    		   while(pq.size()>1) {
    			    int firstMin = pq.poll();
    			    int secondMin = pq.poll();
    			    
    			    int val = Math.max(firstMin, secondMin);
    			    time+=val;
    			    pq.add(firstMin+secondMin);
    			    
    			    
    		   }
    		   System.out.println(time);
	}

}
