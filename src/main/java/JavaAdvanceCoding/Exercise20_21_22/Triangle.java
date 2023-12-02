package JavaAdvanceCoding.Exercise20_21_22;

public class Triangle extends Shape{

    @Override
    public int calculatePerimeter(Integer... dimensions) {
        if (dimensions.length != 3) {
            throw new IllegalArgumentException("A triangle should have exactly 3 dimensions (sideA, sideB, and sideC).");
        }
        int sideA = dimensions[0];
        int sideB = dimensions[1];
        int sideC = dimensions[2];
        return sideA + sideB + sideC;
    }

    @Override
    public int calculateArea(Integer... dimensions) {
        if (dimensions.length != 3) {
            throw new IllegalArgumentException("A triangle should have exactly 3 dimensions (sideA, sideB, and sideC).");
        }
        int sideA = dimensions[0];
        int sideB = dimensions[1];
        int sideC = dimensions[2];
        int s = (sideA + sideB + sideC) / 2;
        return (int) Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
