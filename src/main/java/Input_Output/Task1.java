package Input_Output;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Write a Java program to read input from the Java console.
public class Task1 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Input you're name: ");
            String name = br.readLine();
            System.out.println("Your name is : " + name);
    }
}
