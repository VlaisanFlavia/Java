/**
 * The Church class represents a church attraction that can be visited by tourists.
 * It provides information about the opening hours and entry fee of the church.
 */
public class Church extends Attraction implements Visitable, Payable {
    /** The opening hours of the church. */
    private String openingHours;
    /** The entry fee of the church. */
    private double entryFee;

    /**
     * Constructs a Church object with the specified name, opening hours, and entry fee.
     * @param name the name of the church
     * @param openingHours the opening hours of the church
     * @param entryFee the entry fee of the church
     */
    public Church(String name, String openingHours, double entryFee) {
        super(name);
        this.openingHours = openingHours;
        this.entryFee = entryFee;
    }

    /**
     * Gets the opening hours of the church.
     * @return a string representing the opening hours of the church
     */
    public String getOpeningHours() {
        return openingHours;
    }

    /**
     * Gets the entry fee of the church.
     * @return the entry fee of the church
     */
    public double getEntryFee() {
        return entryFee;
    }
}
