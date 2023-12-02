package JavaAdvanceCoding.Exercise20_21_22;

public class Hexagon extends Shape{

    @Override
    public int calculatePerimeter(Integer... dimensions) {
        if (dimensions.length != 1) {
            throw new IllegalArgumentException("A hexagon should have exactly 1 dimension (side length).");
        }
        int sideLength = dimensions[0];
        return 6 * sideLength;
    }

    @Override
    public int calculateArea(Integer... dimensions) {
        if (dimensions.length != 1) {
            throw new IllegalArgumentException("A hexagon should have exactly 1 dimension (side length).");
        }
        int sideLength = dimensions[0];
        return (int) ((3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2));
    }
}
