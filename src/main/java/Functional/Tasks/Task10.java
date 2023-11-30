package Functional.Tasks;

import java.util.function.BiFunction;

// Write a Java program to implement a lambda expression to concatenate two strings.
public class Task10 {
    public static void main(String[] args) {
        BiFunction<String,String,String> concatenateStrings = (string1,string2) -> string1.concat(string2);
        String result =  concatenateStrings.apply("My name is" , " Majlinda");
        System.out.println(result);
    }
}
