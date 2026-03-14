package com.practice;

public class x15_BeautyOfString {
public static int beautySum(String s) {
        
        int count=0;
        int n =s.length();
        for(int i=0;i<n;i++){
            int[] arr = new int[26];
            for(int j=i;j<n;j++){
                arr[s.charAt(j)-'a']++;
                 int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int k=0;k<26;k++){
                    if (arr[k]!=0){
                     min = Math.min(min,arr[k]);
                     max=  Math.max(max,arr[k]);
                } 
                    }
               count+=max-min;
            }
            }
                   return count;
    }
  public static void main(String[] args) {
	 String str = "aabcba";
	 
	 System.out.println(beautySum(str));
}

}
