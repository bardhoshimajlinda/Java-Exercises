package Input_Output;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* Write a Java program that takes 8 names from user and saves them into an array, find:
        1. the name that has the longest length
        2. the name that has the shortest length
        3. the average length of the names and you will save this data in a file*/

public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String names [] = new String[8];
        for (int i=0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println("Longest name " + largestName(names));
        System.out.println("Shortest name " + shorterName(names));
        System.out.println("Average " + average(names));

        FileWriter out = new FileWriter("file/names.txt");
        out.write("Longest name in the list is " + largestName(names));
        out.write("\nShortest name in your list is" + shorterName(names));
        out.write("\nThe average length of the provided names is " + average(names));
        out.close();

    }

    public static String largestName(String [] names) {
        String largestName = names[0];

        for (String name : names) {
            if (name.length() > largestName.length()) {
                largestName = name;
            }
        }
        return largestName;
    }

    public static String shorterName(String [] names) {
        String shorterName = names[0];
        for (String name : names) {
            if (name.length() < shorterName.length()) {
                shorterName = name;
            }
        }
        return shorterName;
    }


    public static int average(String [] names) {
        int sum = 0;
        for (String name : names) {
            sum += name.length();
        }
        return sum/names.length;
    }
}

