import java.util.ArrayList;
import java.util.List;

/**
 * Represents a trip to a city with various attractions.
 */
public class Trip {
    private String cityName;
    private String periodOfTime;
    private List<Attraction> attractions;

    /**
     * Constructs a trip to a city with a specified period of time.
     * @param cityName the name of the city
     * @param periodOfTime the period of time for the trip
     */
    public Trip(String cityName, String periodOfTime) {
        this.cityName = cityName;
        this.periodOfTime = periodOfTime;
        this.attractions = new ArrayList<>();
    }

    /**
     * Adds an attraction to the trip.
     * @param attraction the attraction to add
     */
    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    /**
     * Retrieves the list of attractions in the trip.
     * @return the list of attractions
     */
    public List<Attraction> getAttractions() {
        return attractions;
    }
}
