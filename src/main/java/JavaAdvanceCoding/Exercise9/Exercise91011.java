package JavaAdvanceCoding.Exercise9;

import java.util.List;

/* Create a Point2D class with fields double x, double y, getters, setters and constructor. Then create a Circle
class that will have a constructor:
Circle(Point2D center, Point2D point)
The first parameter specifies the center of the circle, the second is any point on the circle. Based on these
points, the Circle class is to determine:
• circle radius when calling double getRadius() method
• circle circumference when calling double getPerimeter() method
• circle area when calling double getArea() method
• * (challenging) three points on the circle every 90 degrees from the point given when calling the
List<Point2D> getSlicePoints() method

 Create a MoveDirection class with fields double x, double y as well as getters, setters and constructor.
Create a Movable interface with the move(MoveDirection moveDirection) method.
Implement the interface in the classes from the previous task (Point2D and Circle). When the
move(MoveDirection moveDirection) method is called, the objects are to change their position based on
the provided direction (MoveDirection).
Validate the offset by calling the other Circle methods.


Create a Resizable interface with the resize(double resizeFactor) method.
Implement the interface in the class from the previous task (Circle). When calling the resize(double
resizeFactor) method, the circle should change its size by a given factor (1.5, 0.5, 10.0, etc.).
Validate the resizing by calling the other Circle methods.
*/
public class Exercise91011 {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point2D(0d,0d), new Point2D(2d,2d));
        MoveDirection newPoint = new MoveDirection(1D,14D);
        System.out.println(circle.findRadius());
        circle.getArea();
        circle.getPerimeter();
        List<Point2D> point2DList = circle.getSlicePoints();
        for (Point2D point : point2DList){
            System.out.println("x : " + point.getX() + " y : " + point.getY());
        }

        System.out.println("_____________________________________");

        circle.move(newPoint);
        System.out.println(circle.getPoint().getX());
        System.out.println(circle.getPoint().getY());

        circle.resize(10D);
        System.out.println(circle.getRadius());
        circle.move(new MoveDirection(10D,10D));
    }
}
