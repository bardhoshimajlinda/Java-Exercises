package Input_Output;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialization Process
//        ObjectOutputStream outputStream = new ObjectOutputStream( new FileOutputStream("file/output.txt"));
//
//        Student student = new Student(23,"Leo");
//        outputStream.writeObject(student);

        //Deserialization process

//        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file/output.txt"));
//        Student student1 = (Student) inputStream.readObject();



        List<Student> students = new ArrayList<>();
        students.add(new Student(23, "John"));
        students.add(new Student(24, "Anna"));

        File file = new File("file/stream.ser");

        storeStudentsInFile(students,file);
        System.out.println(deserializeProcess(file));

    }

    public static void storeStudentsInFile(List<Student> students, File file){
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
            for (Student student : students){
                outputStream.writeObject(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Student> deserializeProcess(File file){
        List<Student> studentList = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                try {
                    Student student = (Student) inputStream.readObject();
                    studentList.add(student);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }
}

