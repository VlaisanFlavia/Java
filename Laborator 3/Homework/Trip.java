import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class Trip {
    private String cityName;
    private String periodOfTime;
    private List<Attraction> attractions;
    private Map<String, List<Map.Entry<LocalTime, LocalTime>>> visitingTimetable;

    /**
     * Constructs a trip to a city with a specified period of time.
     *
     * @param cityName     the name of the city
     * @param periodOfTime the period of time for the trip
     */
    public Trip(String cityName, String periodOfTime) {
        this.cityName = cityName;
        this.periodOfTime = periodOfTime;
        this.attractions = new ArrayList<>();
        this.visitingTimetable = new HashMap<>();
    }

    /**
     * Adds an attraction to the trip.
     *
     * @param attraction the attraction to add
     */
    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    /**
     * Retrieves the list of attractions in the trip.
     *
     * @return the list of attractions
     */
    public List<Attraction> getAttractions() {
        return attractions;
    }

    /**
     * Adds visiting timetable for an attraction on a specific date.
     *
     * @param date      the date for the visiting timetable
     * @param intervals the list of time intervals during which the attraction is open
     */
    public void addVisitingTimetable(String date, List<Map.Entry<LocalTime, LocalTime>> intervals) {
        visitingTimetable.put(date, intervals);
    }

    /**
     * Retrieves the visiting timetable for the attractions.
     *
     * @return the visiting timetable
     */
    public Map<String, List<Map.Entry<LocalTime, LocalTime>>> getVisitingTimetable() {
        return visitingTimetable;
    }

    /**
     * Displays the visitable locations that are not payable, sorted by their opening hour.
     */
    public void displayVisitableLocations() {
        List<Visitable> visitableLocations = attractions.stream()
                .filter(attraction -> attraction instanceof Visitable && !(attraction instanceof Payable))
                .map(attraction -> (Visitable) attraction)
                .collect(Collectors.toList());

        visitableLocations.sort(Comparator.comparing(Visitable::getOpeningHours));

        for (Visitable location : visitableLocations) {
            System.out.println(" - Opens at: " + location.getOpeningHours());
        }
    }
}
