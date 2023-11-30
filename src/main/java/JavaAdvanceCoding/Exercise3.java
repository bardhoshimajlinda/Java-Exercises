package JavaAdvanceCoding;

import java.util.HashMap;
import java.util.Map;

/* Create a method that takes the map as a parameter, where the key is string and the value number, and then
   prints each map element to the console in the format: Key: <k>, Value: <v>. There should be a comma at the
   end of every line except the last, and a period at the last.

   Example:
     Key: Java, Value: 18,
     Key: Python, Value: 1,
      …
     Key: PHP, Value: 0.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Map<String,Integer> courses = new HashMap<>(Map.of("Java", 18, "Python", 1, "PHP", 0));
        printMap(courses);
    }

    public static void printMap(Map<String,Integer> map) {
        int i = 0;
        for (Map.Entry el : map.entrySet()) {
            System.out.print("Key: " + el.getKey() + ", Value: " + el.getValue());
            if (map.entrySet().size()-1 > i){
                System.out.println(",");
                i++;
            }else{
                System.out.print(".");
            }
        }
    }
}
