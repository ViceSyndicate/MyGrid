public class Main {

    public static void main(String[] args) {
        // todo: Add all cities & Connections & Distances.
        // todo: Display a citys direct connections & distances.
        // todo: Backtracking from 1 city to another.
        // https://duckduckgo.com/?t=ffab&q=java+queen+backtracking&atb=v223-1&ia=web
        // https://classroom.google.com/u/3/c/MzY3OTQ0MTA1NDcy/m/NDMzMDYyNTg0OTU4/details

        Graph myGraph = new Graph();
        myGraph.createCity("Göteborg");
        myGraph.createCity("Borås");
        myGraph.addConnection("Göteborg", "Borås", 68);
        //myGraph.addCity("Arboga");
        //myGraph.addCity("Halmstad");
        //myGraph.addCity("Falun");



        System.out.println();
        System.out.println();
    }
}
