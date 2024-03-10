/**
 * @author Vlaisan Flavia
 * This class describe The Location part of the problem
 */
public class Location {

    private String name;
    private LocationType locationType;
    private double coordinateX, coordinateY;

    /**
     * This is the default constructor
     */
    public Location() {
        this.name = "";
    }

    /**
     * @param name         : the name we associate with the location
     * @param locationType : the name we associate with the locationType
     */
    public Location(String name, LocationType locationType) {

        this.name = name;
        this.locationType = locationType;

    }

    /**
     * This method sets the name for location
     *
     * @param name : the name we associate with the location
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method sets a type for location
     *
     * @param locationType : the name we associate with the locationType
     */

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    /**
     * This method sets values for xyCoordinate
     *
     * @param x : sets a value for x coordinate
     * @param y : sets a value for y coordinate
     */
    public void setCoordinateXY(double x, double y) {
        this.coordinateX = x;
        this.coordinateY = y;
    }

    /**
     * This method returns the name of the location
     *
     * @return this.name : returns the name of the location
     */

    public String getName() {
        return this.name;
    }

    /**
     * This method returns the location type
     *
     * @return this.locationType : returns location type
     */

    public LocationType getLocationType() {
        return this.locationType;
    }

    /**
     * This method returns the value of the x coordinate
     *
     * @return this.coordinateX : returns the value for x coordinate
     */

    public double getCoordinateX() {
        return this.coordinateX;
    }

    /**
     * This method returns the value of the y coordinate
     *
     * @return this.coordinateY : returns the value for y coordinate
     */

    public double getCoordinateY() {
        return this.coordinateY;
    }

    public String toString() {

        return "Location->  Name: " + this.name + " Type: " + this.locationType + " x Coordinate: " + this.coordinateX + " y Coordinate: " + this.coordinateY;
    }


}