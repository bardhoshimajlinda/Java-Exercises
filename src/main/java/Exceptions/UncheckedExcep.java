package Exceptions;

public class UncheckedExcep {
    public static void main(String[] args) {
        String name = null;
        printLength(name);
    }

    private static void printLength(String myString){
        try {

            System.out.println(myString.length());
        } catch (NullPointerException npe){
            System.out.println("String can not be null");
        }
    }
}
