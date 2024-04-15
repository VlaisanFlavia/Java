/**
 * Represents a client in the Vehicle Routing Problem.
 */
public class Client {

    private String name;
    private int startTime;
    private int endTime;

    /**
     * Constructs a client with the specified name, start time, and end time.
     *
     * @param name      the name of the client
     * @param startTime the start time of the client
     * @param endTime   the end time of the client
     */
    public Client(String name, int startTime, int endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Retrieves the name of the client.
     *
     * @return the name of the client
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the start time of the client.
     *
     * @return the start time of the client
     */
    public int getStartTime() {
        return startTime;
    }

    /**
     * Retrieves the end time of the client.
     *
     * @return the end time of the client
     */
    public int getEndTime() {
        return endTime;
    }

    /**
     * Compares this client to the specified object. The result is true if and only if the argument is not null
     * and is a Client object with the same name as this client object.
     *
     * @param obj the object to compare
     * @return true if the given object represents a Client equivalent to this client, false otherwise
     */
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Client client = (Client) obj;
        return name.equals(client.name);
    }

    /**
     * Returns a string representation of the client.
     *
     * @return a string representation of the client
     */
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", type=" +
                '}';
    }
}
