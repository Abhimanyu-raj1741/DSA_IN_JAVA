package x02_CoderPadMediumQuestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class x04_DFSTechique {
	
	
public static void  DFS(ArrayList<ArrayList<Integer>> adj, int u,boolean[] visited,List<Integer> result){
		
		
	   if(visited[u]==true) {
		   return ;
	   }
	   visited[u]=true;
	   result.add(u);
	   for(int v :adj.get(u)) {
		     if(!visited[v]==true) {
		    	      
		    	      DFS(adj,v,visited,result);
		     }
	   }
		   
           
		
	
	}
	
     public static void main(String[] args) {
	
	ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

	adj.add(new ArrayList<>(Arrays.asList(2,3,1)));
	adj.add(new ArrayList<>(Arrays.asList(0)));
	adj.add(new ArrayList<>(Arrays.asList(0,4)));
	adj.add(new ArrayList<>(Arrays.asList(0)));
	adj.add(new ArrayList<>(Arrays.asList(2)));
	
	
	List<Integer> result = new ArrayList<>();
	boolean[] visited = new boolean[adj.size()];
	
     DFS(adj,0,visited,result);
   
   System.out.println(result);
}

}
