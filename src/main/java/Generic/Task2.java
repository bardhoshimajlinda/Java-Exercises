package Generic;
// Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.
public class Task2 {
    public static void main(String[] args) {
        Integer array1[] = {11, 22, 33, 44, 45};
        Integer array2[] = {11, 22, 33, 44, 45};

        if (compareArrays(array1, array2)) {
            System.out.println("Arrays have the same elements in the same position");
        } else {
            System.out.println("Arrays does not have the same elements in the same position");
        }

        String array3[] = {"John", "Emily"};
        String array4[] = {"John", "Emily","Anna"};

        System.out.println(compareArrays(array3,array4));

    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
}
