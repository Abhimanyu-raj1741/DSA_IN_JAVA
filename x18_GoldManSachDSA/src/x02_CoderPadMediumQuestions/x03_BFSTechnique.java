package x02_CoderPadMediumQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class x03_BFSTechnique {
	
	public static List<Integer> BFS(int v,ArrayList<ArrayList<Integer>> adj){
		
		List<Integer> result = new ArrayList<>();
		boolean[] visited = new boolean[v];
		Queue<Integer> que  = new LinkedList<>();
		
		que.add(0);
		visited[0]=true;
		
		while(!que.isEmpty()) {
			  int node = que.poll();
			  result.add(node);
			    for( int i  : adj.get(node)) {
			    	       if(!visited[i]==true) {
			    	    	   que.add(i);
			    	    	     visited[i]=true;
			    	       }
			    }
			  
		}
		
	 return result; 
	}
	
	 
	
	public static void main(String[] args) {
		

		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		adj.add(new ArrayList<>(Arrays.asList(2,3,1)));
		adj.add(new ArrayList<>(Arrays.asList(0)));
		adj.add(new ArrayList<>(Arrays.asList(0,4)));
		adj.add(new ArrayList<>(Arrays.asList(0)));
		adj.add(new ArrayList<>(Arrays.asList(2)));
		
		
	   List<Integer> ans= 	   BFS(adj.size(),adj);
	   
	   System.out.println(ans);
	}

}
