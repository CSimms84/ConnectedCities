import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CitySearchTest {

    private CitySearch citySearch;
    private ArrayList<String> cities;

    @BeforeEach
    void setUp() {
        citySearch = new CitySearch();
        cities = new ArrayList<>();
        cities.add("citya,cityb");
        cities.add("cityc,cityd");
    }
   


    @Test
    void testReadCities() {
        String filePath = "connected.txt";
        ArrayList<String> result = citySearch.readCities(filePath);

        ArrayList<String> expectedCities = new ArrayList<>();
        expectedCities.add("citya,cityb");
        expectedCities.add("cityc,cityd");

        Assertions.assertEquals(expectedCities, result, "Cities should match the expected list");
    }

   /* @Test
    void testIsConnected_WhenConnected() {
        boolean connected = citySearch.isConnected("CityA", "CityB", cities);
        Assertions.assertTrue(connected, "CityA and CityB should be connected");
    }

    @Test
    void testIsConnected_WhenNotConnected() {
        boolean connected = citySearch.isConnected("CityA", "CityD", cities);
        Assertions.assertFalse(connected, "CityA and CityD should not be connected");
    }

    @Test
    void testIsConnected_CityNamesWithSpaces() {
        boolean connected = citySearch.isConnected(" City A ", " City B ", cities);
        Assertions.assertTrue(connected, "CityA and CityB should be connected despite spaces");
    }

    @Test
    void testIsConnected_CityNamesWithDifferentCases() {
        boolean connected = citySearch.isConnected("CityA", "cityB", cities);
        Assertions.assertTrue(connected, "CityA and cityB should be connected regardless of case");
    }

    */
}