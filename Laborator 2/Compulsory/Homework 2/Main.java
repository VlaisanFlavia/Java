public class Main {
    public static void main(String[] args) {
        Problem problem = new Problem();

        Depot depot1 = new Depot("Depot 1");
        Depot depot2 = new Depot("Depot 2");

        Client client1 = new Client("Client 1", 0, 10);
        Client client2 = new Client("Client 2", 2, 15);
        Client client3 = new Client("Client 3", 5, 20);
        Client client4 = new Client("Client 4", 4, 16);

        Truck truck1 = new Truck("Truck 1", 100);
        Truck truck2 = new Truck("Truck 2", 120);
        Drone drone1 = new Drone("Drone 1", 60);

        problem.addDepot(depot1);
        problem.addDepot(depot2);
        problem.addClient(client1);
        problem.addClient(client2);
        problem.addClient(client3);
        problem.addClient(client4);
        problem.addTruck(truck1);
        problem.addTruck(truck2);
        problem.addDrone(drone1);

        problem.allocateClientsToVehicles();
    }
}