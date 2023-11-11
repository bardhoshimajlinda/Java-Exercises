package Generic;
import java.util.List;
//Write a Java program to create a generic method that takes a list of any type and a target element.
// It returns the index of the first occurrence of the target element in the list. Return -1 if the target element cannot be found
public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(0,1,2,3,4,5,10);
        findIndexOfElement(numbers,8);

        List<String> days = List.of("Monday","Tuesday","Thursday","Wednesday","Monday");
        findIndexOfElement(days,"Monday");
    }

    public static <T> void findIndexOfElement(List<T> myList, T element){
        int index = -1;
        for (int i = 0; i < myList.size(); i++){
            if (myList.get(i).equals(element)){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
