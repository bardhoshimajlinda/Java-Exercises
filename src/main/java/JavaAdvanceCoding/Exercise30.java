package JavaAdvanceCoding;

import java.io.*;

/* Write a program that will read any file and save it in the same folder. The content and title of the new file should
be reversed (from the back). */
public class Exercise30 {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "File/input.txt";  // Provide the actual path to your input file
        String outputFilePath = getReversedFilePath(inputFilePath);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {


            StringBuilder fileContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }


            String reversedContent = reverseString(fileContent.toString());

            String reversedTitle = reverseString(new File(inputFilePath).getName());

            writer.write(reversedTitle);
            writer.newLine();
            writer.write(reversedContent);

            System.out.println("File content and title reversed are saved successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getReversedFilePath(String originalFilePath) {
        File originalFile = new File(originalFilePath);
        String originalFileName = originalFile.getName();
        int lastDotIndex = originalFileName.lastIndexOf('.');
        String nameWithoutExtension = lastDotIndex > 0 ? originalFileName.substring(0, lastDotIndex) : originalFileName;
        String reversedFileName = reverseString(nameWithoutExtension);
        String reversedFilePath = originalFile.getParent() + File.separator + reversedFileName + ".txt";

        return reversedFilePath;
    }

    private static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

}
