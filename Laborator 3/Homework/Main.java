import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Church church = new Church("St. Mary's Church", "9:00 - 18:00", 5.0);
        Concert concert = new Concert("City Hall Concert", "20:00 - 23:00", 25.0);
        Statue statue = new Statue("Town Square Statue", "24/7");

        TravelPlan travelPlan = new TravelPlan();
        travelPlan.addVisit(church, LocalDate.of(2024, 3, 20));
        travelPlan.addVisit(concert, LocalDate.of(2024, 3, 21));
        travelPlan.addVisit(statue, LocalDate.of(2024, 3, 22));

        travelPlan.printPlan();
    }
}
