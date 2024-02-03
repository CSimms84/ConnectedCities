/****************************************************
 * CLASS: CitySearch (CitySearch.java)
 *
 * DESCRIPTION
 * CitySearch class
 *
 *
 *
 * AUTHOR: Charles Simms
 * DATE: 3/31/2022
 */

 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.HashSet;
 import java.util.List;
 import java.util.Map;
 import java.util.Set;


 public class CityGraph {
     private Map<String, List<String>> adjacencyList = new HashMap<>();
 
     public void addConnection(String city1, String city2) {
         this.adjacencyList.computeIfAbsent(city1, k -> new ArrayList<>()).add(city2);
         this.adjacencyList.computeIfAbsent(city2, k -> new ArrayList<>()).add(city1);
     }
 
     public boolean isConnected(String start, String end) {
         Set<String> visited = new HashSet<>();
         return hasPath(start, end, visited);
     }
 
     private boolean hasPath(String current, String end, Set<String> visited) {
         if (current.equals(end)) return true;
         if (visited.contains(current)) return false;
 
         visited.add(current);
 
         for (String neighbor : adjacencyList.getOrDefault(current, new ArrayList<>())) {
             if (hasPath(neighbor, end, visited)) return true;
         }
 
         return false;
     }
 }
 