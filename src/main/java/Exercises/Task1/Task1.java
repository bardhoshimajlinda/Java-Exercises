package Exercises.Task1;
public class Task1 {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(2.1f, 3.1f);

        System.out.println("Point2D coordinates: " + point2D);
        System.out.println("X coordinate: " + point2D.getX());
        System.out.println("Y coordinate: " + point2D.getY());

        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);

        System.out.println("Point3D coordinates: " + point3D);
        System.out.println("X coordinate: " + point3D.getX());
        System.out.println("Y coordinate: " + point3D.getY());
        System.out.println("Z coordinate: " + point3D.getZ());
    }
}
