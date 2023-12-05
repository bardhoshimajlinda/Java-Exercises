package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("John");
        myList.add("Andrew");
        myList.add("Jane");

        for ( String list: myList) {
            System.out.println(list);
        }


        List<String> myList1 = new LinkedList<>();
        myList1.add(0,"Andrew");
        myList1.add(0,"Jake");

        for (final String list: myList1) {
            System.out.println(list);
        }

    }
}
