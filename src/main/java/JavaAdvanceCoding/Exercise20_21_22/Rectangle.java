package JavaAdvanceCoding.Exercise20_21_22;

public class Rectangle extends Shape{

    @Override
    public int calculatePerimeter(Integer... dimensions) {
        if (dimensions.length != 2) {
            throw new IllegalArgumentException("A rectangle should have exactly 2 dimensions (length and width).");
        }
        int length = dimensions[0];
        int width = dimensions[1];
        return 2 * (length + width);
    }

    @Override
    public int calculateArea(Integer... dimensions) {
        if (dimensions.length != 2) {
            throw new IllegalArgumentException("A rectangle should have exactly 2 dimensions (length and width).");
        }
        int length = dimensions[0];
        int width = dimensions[1];
        return length * width;
    }
}
