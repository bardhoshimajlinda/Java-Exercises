package JavaAdvanceCoding.Exercise32;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*Write a program that will be able to save the list of items (e.g. cars) to a file in such a format that it can also read
this file and create a new list of items and write it to the console.*/
public class Exercise32 {
    public static void main(String[] args) {
        List<String> cars = List.of("Toyota", "Honda", "Ford", "Chevrolet");

        saveToFile(cars, "File/cars.txt");

        List<String> newCars = readFromFile("File/cars.txt");
        System.out.println("List of cars read from 'File/cars.txt':");
        System.out.println(newCars);
    }

    public static void saveToFile(List<String> items, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String item : items) {
                writer.write(item);
                writer.newLine();
            }
            System.out.println("List of items saved to '" + filename + "'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFromFile(String filename) {
        List<String> items = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                items.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }
}