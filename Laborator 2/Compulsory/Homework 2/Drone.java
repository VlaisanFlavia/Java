/**
 * Represents a drone in the Vehicle Routing Problem.
 */
public class Drone extends Vehicle {
    private int maxFlightDuration;

    /**
     * Constructs a drone with the specified model and maximum flight duration.
     *
     * @param model            the model of the drone
     * @param maxFlightDuration the maximum flight duration of the drone
     */
    public Drone(String model, int maxFlightDuration) {
        super(model);
        this.maxFlightDuration = maxFlightDuration;
    }

    /**
     * Retrieves the maximum flight duration of the drone.
     *
     * @return the maximum flight duration of the drone
     */
    public int getMaxFlightDuration() {
        return maxFlightDuration;
    }
}
