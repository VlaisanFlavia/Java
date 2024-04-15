import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public interface Visitable {
    String getOpeningHours();

    default LocalTime getOpeningHourForDate(LocalDate date) {

        Map<DayOfWeek, LocalTime> openingHoursMap = new HashMap<>();
        openingHoursMap.put(DayOfWeek.MONDAY, LocalTime.of(9, 0));
        openingHoursMap.put(DayOfWeek.TUESDAY, LocalTime.of(9, 0));
        openingHoursMap.put(DayOfWeek.WEDNESDAY, LocalTime.of(9, 0));
        openingHoursMap.put(DayOfWeek.THURSDAY, LocalTime.of(9, 0));
        openingHoursMap.put(DayOfWeek.FRIDAY, LocalTime.of(9, 0));
        openingHoursMap.put(DayOfWeek.SATURDAY, LocalTime.of(10, 0));
        openingHoursMap.put(DayOfWeek.SUNDAY, LocalTime.of(10, 0));

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return openingHoursMap.get(dayOfWeek);
    }
}
