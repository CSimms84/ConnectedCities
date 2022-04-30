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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CitySearch {

    private ArrayList<String> cities;

    public ArrayList<String> readCities(String file) {
        cities = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                if (line.contains(",")) {
                    line = line.trim();
                    line = line.replaceAll(" ", "");
                    line = line.toLowerCase();
                    cities.add(line);
                }

                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File " + file + " was not found");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error while reading File " + file);
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Something went wrong while reading " + file);
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (fr != null)
                    fr.close();
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                Logger.getLogger(CitySearch.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cities;
    }

    public boolean isConnected(String city1, String city2, ArrayList cities) {
        boolean isConnected = false;
        city1 = city1.replaceAll(" ", "");
        city1 = city1.trim();
        city1 = city1.toLowerCase();

        city2 = city2.replaceAll(" ", "");
        city2 = city2.trim();
        city2 = city2.toLowerCase();

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).toString().contains(city1) && cities.get(i).toString().contains(city2)) {

                String[] cityList = this.cities.get(i).split(",");
                if (city1.equals(cityList[0]) && city2.equals(cityList[1])
                        || city2.equals(cityList[0]) && city1.equals(cityList[1])) {

                    isConnected = true;
                    break;
                }
            }
        }
        return isConnected;

    }

}