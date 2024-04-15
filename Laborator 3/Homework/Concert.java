/**
 * The Concert class represents a concert attraction that can be visited by tourists.
 * It provides information about the opening hours and entry fee of the concert.
 */
public class Concert extends Attraction implements Visitable, Payable {
    /** The opening hours of the concert. */
    private String openingHours;
    /** The entry fee of the concert. */
    private double entryFee;

    /**
     * Constructs a Concert object with the specified name, opening hours, and entry fee.
     * @param name the name of the concert
     * @param openingHours the opening hours of the concert
     * @param entryFee the entry fee of the concert
     */
    public Concert(String name, String openingHours, double entryFee) {
        super(name);
        this.openingHours = openingHours;
        this.entryFee = entryFee;
    }

    /**
     * Gets the opening hours of the concert.
     * @return a string representing the opening hours of the concert
     */
    public String getOpeningHours() {
        return openingHours;
    }

    /**
     * Gets the entry fee of the concert.
     * @return the entry fee of the concert
     */
    public double getEntryFee() {
        return entryFee;
    }
}
