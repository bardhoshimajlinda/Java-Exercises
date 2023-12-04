package Exercises.Task2;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("John","Tirane","Business Informatics",2021,1550.5);

        System.out.println("Student " + student);
        System.out.println("Type of study " + student.getTypeOfStudy());
        System.out.println("Study price " + student.getStudyPrice());


        Lecturer lecturer = new Lecturer("Dr. Smith", "456 University Ave", "Physics", 60000.00);

        System.out.println("Lecturer " + lecturer);
        System.out.println("Lecturer specialization " + lecturer.getSpecialization());
        System.out.println("Lecturer salary " + lecturer.getSalary());


    }
}
