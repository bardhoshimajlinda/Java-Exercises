package Functional.FunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int increment = increment(1);
        System.out.println(increment);

        //Function takes 1 argument and produces 1 result

        Function<Integer, Integer> incrementByOneFunction =
                number -> number + 1;
        int increment2 =  incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiple = multipleBy10Function.apply(increment2);
        System.out.println(multiple);

        //or we can combine 2 function together like below:

        Function<Integer,Integer> addBY1AndThenMultipleBy10 = incrementByOneFunction.andThen(multipleBy10Function);
        System.out.println(addBY1AndThenMultipleBy10.apply(4));



        //BiFunction takes 2 argument and produces 1 result

        System.out.println(incrementByOneAndMultiple(4,100));
        System.out.println(incrementByOneAndMultipleByFunction.apply(4,100));
    }

    static  Function<Integer, Integer> multipleBy10Function = number -> number * 10;
    //this function will take an Integer and will return an Integer

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultipleByFunction =
            (numberToIncrement, numberToMultipleBy) -> (numberToIncrement+1) *numberToMultipleBy;

    static int increment(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultiple(int number, int numToMultipleBy) {
        return (number + 1) * numToMultipleBy;
    }
}

