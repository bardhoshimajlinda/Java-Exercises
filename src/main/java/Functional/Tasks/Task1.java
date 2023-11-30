package Functional.Tasks;

interface SumCalculator {
    int sum(int a, int b);
}

public class Task1 {
    // Write a Java program to implement a lambda expression to find the sum of two integers
    public static void main(String[] args) {
      SumCalculator sumCalculator = (a,b) -> a + b;
      int result = sumCalculator.sum(7,5);
      System.out.println(result);

    }
}
