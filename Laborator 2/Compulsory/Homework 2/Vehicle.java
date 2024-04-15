/**
 * Abstract class representing a vehicle in the Vehicle Routing Problem.
 */
public abstract class Vehicle {

    private String model;

    /**
     * Constructs a vehicle with the specified model.
     *
     * @param model the model of the vehicle
     */
    public Vehicle(String model) {
        this.model = model;
    }

    /**
     * Retrieves the model of the vehicle.
     *
     * @return the model of the vehicle
     */
    public String getModel() {
        return model;
    }

    /**
     * Compares this vehicle to the specified object. The result is true if and only if the argument is not null
     * and is a Vehicle object with the same model as this vehicle object.
     *
     * @param obj the object to compare
     * @return true if the given object represents a Vehicle equivalent to this vehicle, false otherwise
     */
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return model.equals(vehicle.model);
    }

    /**
     * Returns a string representation of the vehicle.
     *
     * @return a string representation of the vehicle
     */
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", licensePlate='" + '\'' +
                '}';
    }
}
