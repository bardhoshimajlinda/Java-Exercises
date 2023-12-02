package JavaAdvanceCoding.Exercise20_21_22;
/* 20. Create an abstract Shape class with the abstract methods calculatePerimeter() for calculating the perimeter and calculateArea() for calculating the area.
Create Rectangle, Triangle, Hexagon classes, extending the Shape class, and implementing abstract methods accordingly. Verify the solution correctness. */
/* 21.Create an abstract 3DShape class that extends the Shape class from the previous task. Add an additional method calculateVolume().
Create Cone and Qube classes by extending the 3DShape class, properly implementing abstract methods. Verify the solution correctness.*/
/* 22.Create a Fillable interface with the fill() method. Implement the method in the 3DShape class from the
previous task or separately in the Cone and Qube classes.
The fill() method should take a parameter, e.g. int, and check whether after the action of filling the figure:
• will pour too much water into the figure and overflow,
• fill the figure with water to the brim,
• not pouring enough water.
For each situation, it should write the status information in the console. Use the calculateVolume() method. */

public class Exercise20_21_22 {
    public static void main(String[] args) {

        //Exercise 20:
        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter(2, 5));
        System.out.println("Rectangle Area: " + rectangle.calculateArea(6,9));

        Triangle triangle = new Triangle();
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter(1,2,3));
        System.out.println("Triangle Area: " + triangle.calculateArea(5,6,7));

        Hexagon hexagon = new Hexagon();
        int perimeter = hexagon.calculatePerimeter(4);
        int area = hexagon.calculateArea(4);

        System.out.println("Hexagon Perimeter: " + perimeter);
        System.out.println("Hexagon Area: " + area);

        //Exercise 21:
        Cone cone = new Cone();
        int coneArea = cone.calculateArea(3, 4);
        int coneVolume = cone.calculateVolume(3, 4);

        Qube cube = new Qube();
        int cubePerimeter = cube.calculatePerimeter(2);
        int cubeVolume = cube.calculateVolume(2);

        System.out.println("Cone Area: " + coneArea);
        System.out.println("Cone Volume: " + coneVolume);
        System.out.println("Qube Perimeter: " + cubePerimeter);
        System.out.println("Qube Volume: " + cubeVolume);

        //Exercise 22:
       // cone.fill(50);
        cone.fill(10,10);
        cube.fill(10,10);

    }
}
