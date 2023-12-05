package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
       try {
           readFile("myFile.txt");
       } catch (FileNotFoundException fnfe){
           System.out.println("Hey that file do not exist.");
       }
    }

    private static void readFile(String fileName) throws FileNotFoundException{
//        try {
//            FileReader reader = new FileReader(fileName);
//        } catch (FileNotFoundException fnfe) {
//            System.out.println("Hey that file does not exist");
//        }

        FileReader reader = new FileReader(fileName);
    }
}
