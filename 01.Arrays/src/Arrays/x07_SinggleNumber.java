package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class x07_SinggleNumber {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(4,3,3,2,2,1,1);
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<ls.size();i++) {
			int x =ls.get(i);
			if(!hm.containsKey(x)) {
				hm.put(x,1);
			}
			else {
				hm.put(x,hm.getOrDefault(x, 0)+1);
				//hm.replace(x,hm.get(x)+1);
			}
		}
		int ans = 0;
		for(Integer key:hm.keySet())	{
			//System.out.println( key + " " +hm.get(key));
			if(hm.containsValue(1)) {
				ans=key;
			}
		}
		System.out.println(ans);
		
		// Optimal Approach
		 int result=0;
	        for(int i=0; i<ls.size(); i++) {
	            result = result^ls.get(i);
	        }
	        System.out.println(result);
		
	}
}
