import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents a travel plan specifying the visit dates for attractions.
 */
public class TravelPlan {
    private Map<Attraction, LocalDate> plan;

    /**
     * Constructs an empty travel plan.
     */
    public TravelPlan() {
        this.plan = new HashMap<>();
    }

    /**
     * Adds a visit to the travel plan for a specific attraction on a given date.
     * @param attraction the attraction to visit
     * @param date the date of the visit
     */
    public void addVisit(Attraction attraction, LocalDate date) {
        plan.put(attraction, date);
    }

    /**
     * Retrieves the travel plan.
     * @return the travel plan
     */
    public Map<Attraction, LocalDate> getPlan() {
        return plan;
    }

    /**
     * Prints the travel plan with visit dates for each attraction.
     */
    public void printPlan() {
        for (Map.Entry<Attraction, LocalDate> entry : plan.entrySet()) {
            Attraction attraction = entry.getKey();
            LocalDate date = entry.getValue();
            System.out.println("On " + date + ", visit " + attraction.getName());
        }
    }
}
