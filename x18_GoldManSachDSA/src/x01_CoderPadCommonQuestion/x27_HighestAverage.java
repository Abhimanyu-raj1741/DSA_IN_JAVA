package x01_CoderPadCommonQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class x27_HighestAverage {
   public static void main(String[] args) {
	    String[][] s = {{"Bobby","60.0"},
	    		 {"Charles","100.5"},
	    		 {"Eric","90.9"},
	    		 {"Eric","90.9"},
	    		 {"Eric","64.9"},
	    		 {"Charles","44.5"}
	    		 };
	    
	    Map<String,List<Double>> map = new HashMap<>();
	    double maxAverage =0.0;
	    String name ="";
	    
	    for(String[] str:s) {
	    	  map.putIfAbsent(str[0],new ArrayList<>());
	    	  map.get(str[0]).add(Double.valueOf(str[1]));
	    }
	    System.out.println(map);
	    
	    for(Map.Entry<String, List<Double>> entry : map.entrySet()) {
	    	            
	    	      List<Double> marks = entry.getValue();
	    	      Double average = marks.stream().mapToDouble(Double::doubleValue).average().orElse(0);
	    	      if(average>maxAverage) {
	    	    	     maxAverage=average;
	    	    	     name = entry.getKey();
	    	      }
	    }
	    System.out.println(maxAverage);
	    System.out.println(name);
}
}
