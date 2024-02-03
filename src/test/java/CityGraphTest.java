import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CityGraphTest {
    @Test
    void testConnection() {
        CityGraph graph = new CityGraph();
        graph.addConnection("New York", "Chicago");
        graph.addConnection("Denver", "Kansas City");
        graph.addConnection("Chicago", "Los Angeles");
        graph.addConnection("Kansas City", "Nashville");

        assertTrue(graph.isConnected("New York", "Los Angeles"));
        assertFalse(graph.isConnected("Los Angeles", "Nashville"));
    }
}
