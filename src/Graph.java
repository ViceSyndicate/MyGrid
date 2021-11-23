import java.util.*;

public class Graph {
    private HashMap<String, City> cities = new HashMap();

    void createCity(String name) {
        City newCity = new City(name);
        cities.putIfAbsent(name, newCity);
    }

    void addConnection(String from, String to, int distance) {
        if (cities.containsKey(from) && cities.containsKey(to)) {
            cities.get(from).addConnection(to, distance);
        }
    }
}
