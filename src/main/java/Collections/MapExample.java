package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String > ageToNames = new HashMap<>();
        ageToNames.put(11, "Andrew");
        ageToNames.put(22,"Anna");
        ageToNames.put(1,"Ali");
        ageToNames.remove(22);
        System.out.println(ageToNames.get(1));
    }
}
