/****************************************************
 * CLASS: ConnectedCities (ConnectedCities.java)
 *
 * DESCRIPTION
 * Driver code for the ConnectedCities program
 *
 *
 *
 * AUTHOR: Charles Simms
 * DATE: 3/31/2022
 */

 import java.io.*;
 import java.nio.file.*;
 
 public class ConnectedCities {
     public static void main(String[] args) throws IOException {
         if (args.length != 3) {
             System.out.println("Usage: java ConnectedCities <city1> <city2> <file path>");
             return;
         }
 
         String city1 = args[0];
         String city2 = args[1];
         Path filePath = Paths.get(args[2]);
 
         CityGraph cityGraph = new CityGraph();
         Files.lines(filePath)
              .forEach(line -> {
                  String[] cities = line.split(",\\s*");
                  cityGraph.addConnection(cities[0], cities[1]);
              });
 
         System.out.println(cityGraph.isConnected(city1, city2) ? "CONNECTED" : "NOT CONNECTED");
     }
 }
 