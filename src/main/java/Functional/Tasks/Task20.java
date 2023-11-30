package Functional.Tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.
public class Task20 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna Maria", 15, "X" ));
        students.add(new Student("John Rey", 14, "X" ));
        students.add(new Student("Alex Lui", 15, "X" ));

        //Sort the list based on the age using lambda expression
        students.sort(Comparator.comparing(Student::getAge));

        for (Student student : students) {
            System.out.println(student.getAge() + " " + student.getName());
        }
    }
}

class Student {
    private String name, SClass;
    private int age;

    public Student(String name,  int age, String SClass) {
        this.name = name;
        this.age = age;
        this.SClass = SClass;
    }

    public String getName() {
        return name;
    }

    public String getSClass() {
        return SClass;
    }

    public int getAge() {
        return age;
    }
}
