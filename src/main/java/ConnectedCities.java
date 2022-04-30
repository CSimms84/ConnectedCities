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

import java.util.ArrayList;

public class ConnectedCities {

    public static void main(String[] args) {
        if (args.length == 3) {
            CitySearch search = new CitySearch();
            ArrayList cities = search.readCities(args[2]);
            if (search.isConnected(args[0], args[1], cities)) {
                System.out.println("CONNECTED");
            } else {
                System.out.println("NOT CONNECTED");
            }
        }
    }

}
