package Input_Output;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputOutputPackage {
    public static void main(String[] args) throws IOException {
        // Streams of bytes
//        FileInputStream inputStream = new FileInputStream("file/input.txt");
//        FileOutputStream outputStream = new FileOutputStream("file/output.txt");
//        int nextByte;
//        while ((nextByte = inputStream.read()) != -1) {
//            outputStream.write(nextByte);
//        }
//        outputStream.close();
//        inputStream.close();


        // Character streams

//        FileWriter writer = new FileWriter("file/output.txt");
//        FileReader reader = new FileReader("file/input.txt");
//        int nextChar;
//        while ((nextChar=reader.read()) != -1) {
//            writer.write(nextChar);
//        }
//        writer.close();
//        reader.close();

        // Buffered stream

//        BufferedReader bufferedReader = new BufferedReader(new FileReader("file/input.txt"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file/output.txt"));
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            bufferedWriter.write(line);
//            bufferedWriter.newLine();
//        }
//        bufferedWriter.close();
//        bufferedReader.close();


        List<String> nameList = new ArrayList<>();
        nameList.add("Anna");
        nameList.add("Jack");
        nameList.add("John");
        nameList.add("Leo");

        BufferedWriter bw = new BufferedWriter(new FileWriter("file/output.txt"));
        for (String name : nameList) {
            bw.write(name);
            bw.newLine();
        }
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("file/output.txt"));
        String line;
        while ((line=br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }
}
