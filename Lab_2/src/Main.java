/**
 * @author Vlaisan Flavia
 * This is the main class
 */
public class Main {
    public static void main(String[] args) {

        Location location1 = new Location();
        location1.setName("HOME");
        location1.setLocationType(LocationType.CITY);
        location1.setCoordinateXY(8.7, 5.5);
        System.out.println(location1.toString());

        Location location2 = new Location();
        location2.setName("FACULTY");
        location2.setLocationType(LocationType.SCHOOL);
        location2.setCoordinateXY(2.3, 6.7);
        System.out.println(location2.toString());


        Road road1 = new Road();
        road1.setLength(10);
        road1.setSpeedLimit(60);
        road1.setRoadType(RoadType.COUNTRY);
        System.out.println(road1.toString());

        Road road2 = new Road();
        road2.setLength(30);
        road2.setSpeedLimit(100);
        road2.setRoadType(RoadType.HIGHWAY);
        System.out.println(road2.toString());

    }
}