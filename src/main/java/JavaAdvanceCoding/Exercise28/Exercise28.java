package JavaAdvanceCoding.Exercise28;
import java.util.List;
/* Extend the ArrayList<E> class by implementing the getEveryNthElement() method. This method returns a list
of elements and takes two parameters: the element index from which it starts and a number specifying which
element to choose.
For the list: [a, b, c, d, e, f, g] and parameters: startIndex = 2 and skip = 3 it should return [c, g] */
public class Exercise28 {
    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        List<String> result = list.getEveryNthElement(2, 3);
        System.out.println(result);
    }
}
