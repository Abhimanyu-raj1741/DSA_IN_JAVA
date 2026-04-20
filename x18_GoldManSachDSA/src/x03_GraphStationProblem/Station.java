package x03_GraphStationProblem;

import java.util.ArrayList;
import java.util.List;

public class Station {
 
	
	 String name;
	 List<Station> adjacentStations;
	 
	 public Station(String name) {
		  this.name=name;
		  this.adjacentStations = new ArrayList<>();
		
	 }
	 public void addAdjacentStation(Station station) {
		 adjacentStations.add(station);
	 }
	 public String getName() {
		  return name ;
	 }
	 public List<Station>  getAdjacentStations(){
		 return adjacentStations;
	 }
}
