/**
 * Represents a truck in the Vehicle Routing Problem.
 */
public class Truck extends Vehicle {
    private int capacity;

    /**
     * Constructs a truck with the specified model and capacity.
     *
     * @param model    the model of the truck
     * @param capacity the capacity of the truck
     */
    public Truck(String model, int capacity) {
        super(model);
        this.capacity = capacity;
    }

    /**
     * Retrieves the capacity of the truck.
     *
     * @return the capacity of the truck
     */
    public int getCapacity() {
        return capacity;
    }
}
