package x03_GraphStationProblem;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class TrainMap {
   
	 Map<String,Station> trainMap;
	 
	 public TrainMap() {
		  trainMap = new HashMap<>();
		  
	 }
	 public Station getStation(String name) {
		  return trainMap.get(name);
	 }
	 public Station addStation(String name) {
		  trainMap.putIfAbsent(name, new Station(name));
		  return trainMap.get(name);
	 }
	 public void connectStations(String from,String to) {
		 Station fromStation = addStation(from);
		 Station toStation = addStation(to);
		 fromStation.addAdjacentStation(toStation);
		 toStation.addAdjacentStation(fromStation);
	 }
	 
	 public List<Station> shortestPath(String startName, String endName){
		  Station start = getStation(startName);
		  Station end = getStation(endName );
		  
		  if(start ==null || end ==null ) return Collections.emptyList();
		  Map<Station,Station > prev  = new HashMap<>();
		  Set<Station> visited = new HashSet<>();
		  Queue<Station> queue = new LinkedList<>();
		  
		  
		  queue.add(start);
		  visited.add(start);
		  
		  while(!queue.isEmpty()) {
			    Station current = queue.poll();
			    if(current.equals(end)) break ;
			    for(Station neighbor : current.getAdjacentStations()) {
			    	     if(!visited.contains(neighbor)) {
			    	    	       visited.add(neighbor);
			    	    	       prev.put(neighbor, current);
			    	    	       queue.add(neighbor);
			    	     }
			    }
		}
		    List<Station> path = new LinkedList<>();
		    for(Station at =end;at!=null;at = prev.get(at)) {
		    	path.add(0,at);
		    }
		    
		    if(!path.isEmpty() && path.get(0).equals(start)) {
		    	    return path;
		    }else {
		    	return Collections.emptyList();
		    
		  } 

		  
	 }
	 
}
