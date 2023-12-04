package Exercises.Task3;

public class Task3 {
    public static void main(String[] args) throws CannotDivideBy0Exception {
        System.out.println(divide(4,0));
    }

    public static double divide(double number1, double number2) throws CannotDivideBy0Exception {
        if (number2 == 0) {
            throw new CannotDivideBy0Exception("Second parameter shouldn't be 0");
        } else {
            return number1 /number2;
        }
    }
}
