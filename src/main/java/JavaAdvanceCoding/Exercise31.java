package JavaAdvanceCoding;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
//Write a program that will count the occurrences of each word in a text file and then save the results in the form of a table in a new file.
public class Exercise31 {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "File/input.txt";
        String outputFilePath = "File/count.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            String[] words = content.toString().split("\\s+");

            Map<String, Integer> wordOccurrences = new HashMap<>();
            for (String word : words) {
                String normalizedWord = word.toLowerCase();
                wordOccurrences.put(normalizedWord, wordOccurrences.getOrDefault(normalizedWord, 0) + 1);
            }

            StringBuilder table = new StringBuilder();
            table.append("Word\tOccurrences\n");
            for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
                table.append(entry.getKey()).append("\t").append(entry.getValue()).append("\n");
            }

            writer.write(table.toString());

            System.out.println("Word occurrences table created and saved successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
