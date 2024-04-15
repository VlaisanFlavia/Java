/**
 * The Statue class represents a statue attraction that can be visited by tourists.
 * It provides information about the opening hours of the statue.
 */
public class Statue extends Attraction implements Visitable {
    /** The opening hours of the statue. */
    private String openingHours;

    /**
     * Constructs a Statue object with the specified name and opening hours.
     * @param name the name of the statue
     * @param openingHours the opening hours of the statue
     */
    public Statue(String name, String openingHours) {
        super(name);
        this.openingHours = openingHours;
    }

    /**
     * Gets the opening hours of the statue.
     * @return a string representing the opening hours of the statue
     */
    public String getOpeningHours(){
        return openingHours;
    }
}
