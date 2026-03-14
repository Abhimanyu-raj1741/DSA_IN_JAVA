package x01_String_Easy;

public class x03_LongestOddNumberInString {
  
	public static void main(String[] args) {
//		Example 1:
//			Input: num = "52"
//			Output: "5"
//			Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
//			Example 2:
//			Input: num = "4206"
//			Output: ""
//			Explanation: There are no odd numbers in "4206".
//			Example 3:
//			Input: num = "35427"
//			Output: "35427"
//			Explanation: "35427" is already an odd number.
		
		
		String str = "35427"; 
		String ans ="";
		int n = str.length();
		for(int i=n-1;i>=0;i-- ) {
			   if(str.charAt(i)%2!=0) {
				   ans = str.substring(0,i+1);
				   break;
			   }
			   
		}
		
		System.out.println(ans);
		

	}
}
