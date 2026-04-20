package x03_GraphStationProblem;

import java.util.List;

public class Main {
           
	public static void main(String[] args) {
		 TrainMap map = new TrainMap();
		 map.connectStations("A", "B");
		 map.connectStations("B", "C");
		 map.connectStations("A", "D");
		 map.connectStations("D", "E");
		 map.connectStations("E", "C");
		  
		 List<Station> path = map.shortestPath("A", "C");
		 System.out.println("Shortest Path fomm A to C");
		 for(Station s : path) {
			  System.out.print(s.getName()+ "-");
		 }
	}
}
