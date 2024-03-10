/**
 * @author Vlaisan Flavia
 * This class describe The Road part of the problem
 */
public class Road {
    private RoadType roadType;
    private int speedLimit;
    private int length;

    /**
     * Default constructor
     */
    public Road() {
        this.length = 0;
        this.speedLimit = 0;
    }

    /**
     * Constructor
     *
     * @param length     : sets the length
     * @param speedLimit : sets the speedLimit
     * @param roadType   : sets the road type
     */
    public Road(int length, int speedLimit, RoadType roadType) {
        this.length = length;
        this.speedLimit = speedLimit;
        this.roadType = roadType;
    }

    /**
     * This method sets the length of the road
     *
     * @param length : the value for length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * This method sets the speed limit for the road
     *
     * @param speedLimit : the value for speedLimit
     */

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    /**
     * This method sets the type for the road
     *
     * @param roadType : the type for roads
     */
    public void setRoadType(RoadType roadType) {
        this.roadType = roadType;
    }

    /**
     * This method returns the length of the road
     *
     * @return this.length : this is the length of the road
     */
    public int getLength() {
        return this.length;
    }

    /**
     * This method returns the speed limit of the road
     *
     * @return this.speedLimit : this is the value for the speed limit of the road
     */
    public int getSpeedLimit() {
        return this.speedLimit;
    }

    /**
     * This method returns the type of the road
     *
     * @return this.roadType: this is the type of the road (is a member of the enum RoadType)
     */

    public RoadType getRoadType() {
        return this.roadType;
    }

    public String toString() {
        return "Road->  Length: " + this.length + " SpeedLimit: " + this.speedLimit + " Type: " + this.roadType;
    }


}