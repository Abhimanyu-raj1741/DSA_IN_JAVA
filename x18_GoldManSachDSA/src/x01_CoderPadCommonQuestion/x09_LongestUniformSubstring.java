package x01_CoderPadCommonQuestion;

public class x09_LongestUniformSubstring { 
	
	public static void main(String[] args) {
		// TC: O(n)

		        String s = "abcdefghijkllllllll";
		        int[] result = findLongestSegment(s);
		        if(s.length()>=1) {
		        	 int start =result[0];
				        int end = result[1];
				        for(int i =start;i<=end;i++) {
				        	   System.out.print(s.charAt(i));
				        }
		        }
		       
		        
		        System.out.println("[" + result[0] + ", " + result[1] + "]");
		}
	
	public static int[] findLongestSegment(String s) {
		int n = s.length();
		if(n==0 || s.isEmpty()) return new int[] {-1,0};
		
		int start =0;
		int end=0 ;
		int count=1;
		int maxLen=1;
		int current=0;
		for(int i=1;i<n;i++) {
			 if(s.charAt(i)==s.charAt(i-1)) {
				  count++;
			 }else {
				 count=1;
				 current=i;
			 }
			 if(count>maxLen) {
				 maxLen=count ;
				 start=current;
				 end =i;
			 }
		}
		
		return new int[] {start,end};
		
	}
    /*public static int[] findLongestSegment(String s) {
    	
        int n = s.length();
        if (n == 0) return new int[]{-1, 0};

        int left = 0, right = 0;
        int[] ans = new int[]{0, 1};

        while (right < n) {
            while (right < n && s.charAt(right) == s.charAt(left)) {
                right++;
            }
            int len = right - left;   // fixed off-by-one
            if(len > ans[1]) {
                ans[1] = right - left; 
                ans[0] = left;
            }
            left = right;
        }
        return ans;
    }*/
	}

