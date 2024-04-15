import java.util.ArrayList;
import java.util.List;

/**
 * Represents the Vehicle Routing Problem and its solution.
 */
public class Problem {

    private List<Depot> depots;
    private List<Client> clients;
    private List<Truck> trucks;
    private List<Drone> drones;

    /**
     * Constructs a new instance of the Vehicle Routing Problem.
     */
    public Problem() {
        depots = new ArrayList<>();
        clients = new ArrayList<>();
        trucks = new ArrayList<>();
        drones = new ArrayList<>();
    }

    /**
     * Adds a depot to the problem if it does not already exist.
     *
     * @param depot the depot to add
     */
    public void addDepot(Depot depot) {
        if (!depots.contains(depot)) {
            depots.add(depot);
        }
    }

    /**
     * Adds a client to the problem if it does not already exist.
     *
     * @param client the client to add
     */
    public void addClient(Client client) {
        if (!clients.contains(client)) {
            clients.add(client);
        }
    }

    /**
     * Adds a truck to the problem if it does not already exist.
     *
     * @param truck the truck to add
     */
    public void addTruck(Truck truck) {
        if (!trucks.contains(truck)) {
            trucks.add(truck);
        }
    }

    /**
     * Adds a drone to the problem if it does not already exist.
     *
     * @param drone the drone to add
     */
    public void addDrone(Drone drone) {
        if (!drones.contains(drone)) {
            drones.add(drone);
        }
    }

    /**
     * Returns an array of all vehicles from all depots.
     *
     * @return an array of all vehicles
     */
    public Vehicle[] getVehicles() {
        List<Vehicle> allVehicles = new ArrayList<>();
        allVehicles.addAll(trucks);
        allVehicles.addAll(drones);
        return allVehicles.toArray(new Vehicle[0]);
    }

    /**
     * Allocates clients to vehicles based on a simple heuristic algorithm.
     */
    public void allocateClientsToVehicles() {
        for (Client client : clients) {
            int minDistance = Integer.MAX_VALUE;
            Vehicle assignedVehicle = null;

            for (Vehicle vehicle : getVehicles()) {
                int distance = calculateDistance(getDepotOfVehicle(vehicle), client);

                if (vehicleCanServeClient(vehicle, client) && distance < minDistance) {
                    minDistance = distance;
                    assignedVehicle = vehicle;
                }
            }

            if (assignedVehicle != null) {
                System.out.println("Assigning client " + client.getName() + " to vehicle " + assignedVehicle.getModel());
            } else {
                System.out.println("Unable to assign client " + client.getName() + " to any vehicle.");
            }
        }
    }

    /**
     * Calculates the distance between a depot and a client.
     *
     * @param depot  the depot
     * @param client the client
     * @return the distance between the depot and the client
     */
    private int calculateDistance(Depot depot, Client client) {
        // Obțin indexul depozitului și al clientului în listele corespunzătoare
        int depotIndex = depots.indexOf(depot);
        int clientIndex = clients.indexOf(client);

        // Calculez distanța bazată pe diferența absolută între indexuri
        return Math.abs(depotIndex - clientIndex);
    }

    /**
     * Checks if a vehicle can serve a client.
     *
     * @param vehicle the vehicle
     * @param client  the client
     * @return true if the vehicle can serve the client, false otherwise
     */
    private boolean vehicleCanServeClient(Vehicle vehicle, Client client) {
        // pp că orice vehicul poate servi orice client
        return true;
    }

    /**
     * Retrieves the depot associated with a vehicle.
     *
     * @param vehicle the vehicle
     * @return the depot associated with the vehicle
     */
    private Depot getDepotOfVehicle(Vehicle vehicle) {
        // pp că fiecare vehicul este asociat cu primul depozit din listă
        return depots.get(0);
    }
}
