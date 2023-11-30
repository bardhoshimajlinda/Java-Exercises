package Functional.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _Streams {
    public static void main(String[] args) throws IOException {
        // Different ways to create streams
        Stream<Integer> integerStream = Arrays.asList(1,2,3).stream();
        Stream<String> stringStream = Set.of("one", "two").stream();
        Stream<Map.Entry<String,Integer>> stream = Map.of("someKey", 1, "someKey1", 2).entrySet().stream();
        IntStream arraysStream = Arrays.stream((new int[]{1,2,3}));
        Stream<Double> ofStream = Stream.of(1.2,1.2,1.3);
        Stream<Integer> generateStream = Stream.generate(() -> new Random().nextInt());
        Stream<String> fileLinesStream = Files.lines(Path.of("file/user.txt"));

        // map method
        List.of(1,2,3).stream()
                .map(streamElem -> streamElem *3.0);

        //flatMap method
        final Statistics statisticsA = new Statistics(2.0, List.of(1,2,3,4));
        final Statistics statisticsB = new Statistics(2.0, List.of(1,2,3,4));

        Stream.of(statisticsA, statisticsB)
                .flatMap(statistics -> statistics.getValues().stream())
                .forEach(System.out::println);

        System.out.println();

        // filter operation

        final int[] idx = {0};
        Stream.generate(() -> idx[0]++)
                .limit(10)
                .filter(elem-> elem%2 == 0)
                .forEach(System.out::println);

        // sorted method
        System.out.println();
        Arrays.asList(6,4,5,7,21,1).stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // distinct operation

        System.out.println();
        Arrays.asList(3,6,6,7,1,6).stream()
                .distinct()
                .forEach(System.out::println);


        //forEach operation

        System.out.println();
        List.of(1,2,3).stream()
                .forEach(System.out::println);

        // collect method

        final List<Integer> listCreatedFromCollectMethod = Stream.generate(() -> new Random().nextInt())
                .limit(10)
                .distinct()
                .filter(elem -> Math.abs(elem) > 1000)
                .collect(Collectors.toUnmodifiableList());

        for (Integer value : listCreatedFromCollectMethod) {
            System.out.println(value);
        }


        final String sentence = Stream.of("This","will", "be", "single", "sentence", "but", "without","some","words")
                .filter(word -> word.length() >2)
                .collect(Collectors.joining(" "));
        System.out.println(sentence);


        final Map<String,String> wordToUpperCaseVersion = Stream.of("Hello", "from", "Stream", "api")
                .collect(Collectors.toMap(Function.identity(), String::toUpperCase));
        System.out.println(wordToUpperCaseVersion);


        // groupingBy method
        System.out.println();
        Stream.of("This", "is", "an","example", "that", "groups","words","by","their","length")
                .collect(Collectors.groupingBy(String::length))
                .forEach((key, value) -> System.out.println(key+ " " + value));

        // findFirst method
        System.out.println("findFirst method example");

        List.of("who", "will", "be", "first").stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //findAny method
        System.out.println("findAny method example");
        List.of(7,27,13,41,83).stream()
                .filter(x -> x %2 == 0)
                .findAny()
                .ifPresent(System.out::println);


        // reduce method
        System.out.println("reduce method example");
        final Integer sum = List.of(2,5,9,19,14).stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        // parallel processing
        final List<String> result = Arrays.asList("Alice has a cat named Catson".split(" ")).parallelStream()
                //Arrays.asList("Alice has a cat named Catson".split(" ")).stream().sequential()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }

}

class Statistics {
    private double average;
    private List<Integer> values;

    public Statistics(double average, List<Integer> values) {
        this.average = average;
        this.values = values;
    }

    public double getAverage() {
        return average;
    }

    public List<Integer> getValues() {
        return values;
    }
}

