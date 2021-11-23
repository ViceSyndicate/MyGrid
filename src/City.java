import java.util.ArrayList;

public class City {
    String name;
    ArrayList<CityConnection> connections = new ArrayList<>();

    City(String name) {
        this.name = name;
    }

    void addConnection(String name, int distance) {
        CityConnection newConnection = new CityConnection(name, distance);
        connections.add(newConnection);
    }

    void listCityConnections() {
        for ( CityConnection cityConnection : connections) {
            System.out.println(cityConnection.connectedCityName + " " + cityConnection.connectedCityDistance);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
