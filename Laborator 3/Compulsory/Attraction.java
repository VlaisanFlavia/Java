/**
 * The Attraction class represents a generic attraction that can be visited by tourists.
 * It provides basic functionality such as retrieving the name of the attraction and comparing attractions.
 */
public abstract class Attraction implements Comparable<Attraction> {
    /** The name of the attraction. */
    protected String name;

    /**
     * Constructs an Attraction object with the specified name.
     * @param name the name of the attraction
     */
    public Attraction(String name){
        this.name = name;
    }

    /**
     * Gets the name of the attraction.
     * @return the name of the attraction
     */
    public String getName() {
        return name;
    }

    /**
     * Compares this attraction with another attraction based on their names.
     * @param other the other attraction to compare with
     * @return a negative integer, zero, or a positive integer if this attraction is less than, equal to,
     *         or greater than the specified attraction, respectively
     */
    public int compareTo(Attraction other){
        return this.name.compareTo(other.getName());
    }
}
