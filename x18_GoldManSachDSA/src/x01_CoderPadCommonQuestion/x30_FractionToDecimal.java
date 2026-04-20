package x01_CoderPadCommonQuestion;

import java.util.HashMap;

public class x30_FractionToDecimal { 
	public static void main(String[] args) {
		  
	  int numerator =-15;
	  int denominator =3 ;
	  
	  StringBuilder result = new StringBuilder();
	  if(numerator ==0) {
		  result.append("0") ; 
	  }
	   if(numerator<0 ^ denominator<0) { 
		    result.append("-");
	   }
	   long num  =Math.abs(numerator);
	   long den = Math.abs(denominator);
	   result.append(num/den);
	   
	   long remainder = num%den;
	   
	   if(remainder==0) {
		    System.out.println(result);;
		    return;
	   }
	   
	   result.append(".");
	   HashMap<Long,Integer> remainderMap = new HashMap<>();
	   //System.out.println(result);
	   //System.out.println(1%2);
	   while(remainder!=0) {
		      if (remainderMap.containsKey(remainder)) {
		    	   int repeatIndex = remainderMap.get(remainder);
		    	   result.insert(repeatIndex,"(");
		    	   result.append(")");
		    	   System.out.println(result);;
		      }
		      remainderMap.put(remainder,result.length());
		      remainder *=10;
		      result.append(remainder/den);
		      remainder=remainder%den;
	   }
	  System.out.println(result);
	}

}
