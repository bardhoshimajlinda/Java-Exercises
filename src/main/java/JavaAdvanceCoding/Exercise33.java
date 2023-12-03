package JavaAdvanceCoding;

import java.io.File;

/*Write a program that will display all photos (.png, .jpg) in a given directory and subdirectories.*/
public class Exercise33 {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\CRS\\Downloads";
        displayPhotos(directoryPath);
    }

    public static void displayPhotos(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path");
            return;
        }
        displayPhotosRecursive(directory);
    }

    private static void displayPhotosRecursive(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    displayPhotosRecursive(file);
                } else {
                    String fileName = file.getName();
                    if (fileName.toLowerCase().endsWith(".png") || fileName.toLowerCase().endsWith(".jpg")) {
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }
        }
    }
}
