package JavaAdvanceCoding.Exercise27;
/* Design the Joiner<T> class, which in the constructor will take a separator (string) and have a join() method
that allows you to specify any number of T-type objects. This method will return a string joining all passed
elements by calling their toString() method and separating them with a separator.
eg. for Integers and separator "-" it should return: 1-2-3-4 ... */
public class Exercise27 {
    public static void main(String[] args) {
        Joiner<Integer> integerJoiner = new Joiner<>("-");
        String result = integerJoiner.join(1,2,3,4,5);
        System.out.println(result);

        Joiner<String> joiner = new Joiner<>(" ");
        String result1 = joiner.join("This","is","a","test");
        System.out.println(result1);
    }
}
