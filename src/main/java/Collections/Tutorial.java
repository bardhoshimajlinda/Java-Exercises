package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Tutorial {
    public static void main(String[] args) {

        String [] myList = {"Ana", "Tim"};
        System.out.println(myList[0]);
        System.out.println(myList.length);
        myList[0] = "Carl";

        ArrayList<String> myyList = new ArrayList<>();
        ArrayList<String > myList2 = new ArrayList<>(Arrays.asList("John", "Chris"));
        System.out.println(myList2.get(0));
        System.out.println(myList2.size());
        myList2.add("Mitch");
        myList2.set(0, "Carl");
        myList2.remove(1);


        Set<String > myList3 = new HashSet<>();
        myList2.addAll(myList2);
        //or
        Set<String> myList4 = new HashSet<>(myList2);

    }
}
