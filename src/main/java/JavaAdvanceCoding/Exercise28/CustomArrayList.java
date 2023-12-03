package JavaAdvanceCoding.Exercise28;

import java.util.ArrayList;
import java.util.List;

/* Extend the ArrayList<E> class by implementing the getEveryNthElement() method. This method returns a list
of elements and takes two parameters: the element index from which it starts and a number specifying which
element to choose.
For the list: [a, b, c, d, e, f, g] and parameters: startIndex = 2 and skip = 3 it should return [c, g] */
public class CustomArrayList<E> extends ArrayList<E> {

    public List<E> getEveryNthElement(int index, int skip) {
        List<E> result = new ArrayList<>();

        for (int i = index; i < size(); i += skip+1) {
            result.add(get(i));
        }

        return result;
    }
}
