import java.util.*;

class UndergroundSystem {

    // passengerId -> CheckIn information
    private Map<Integer, CheckIn> checkIns;

    // "start#end" -> total time and number of trips
    private Map<String, Route> routes;

    class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    class Route {
        int totalTime;
        int trips;

        Route(int totalTime, int trips) {
            this.totalTime = totalTime;
            this.trips = trips;
        }
    }

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        routes = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {

        CheckIn start = checkIns.get(id);

        String route = start.station + "#" + stationName;

        int travelTime = t - start.time;

        if (!routes.containsKey(route)) {
            routes.put(route, new Route(travelTime, 1));
        } else {
            Route r = routes.get(route);
            r.totalTime += travelTime;
            r.trips++;
        }

        checkIns.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {

        String route = startStation + "#" + endStation;

        Route r = routes.get(route);

        return (double) r.totalTime / r.trips;
    }
}
