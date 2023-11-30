package JavaAdvanceCoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Create a method that takes a string list as a parameter, then returns that list sorted alphabetically from Z to A case-insensitive.
public class Exercise2 {
    public static void main(String[] args) {
        List<String> days = new ArrayList<>(List.of("Monday","tuesday", "wednesday", "Thursday", "Friday","Saturday", "Sunday"));
        sortListCaseInsensitive(days);
    }
    public static void sortListCaseInsensitive(List<String> days) {
        days.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        System.out.println(days);
    }
}
