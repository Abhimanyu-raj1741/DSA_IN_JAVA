package x01_CoderPadCommonQuestion;

public class x04_DotProduct {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = {2,4,7};
		
		// op = 31 
		    
		 product(a,b);
		    
		
		        
		 
	}
   
	public static void product(int[] a, int[] b) {
		 
		if(a.length!=b.length) {
			 System.out.println("should be same lenght");
		}
		else if(a==null || b==null) {
			System.out.println("Array size can't be zero");
		}
		else {
			
			int result=0;
		     
			for(int i =0;i<a.length;i++) {
					int product=	a[i]*b[i];
				result+= product;
			}
			
			System.out.println(result);
		}
		
		
	}
}
