package JavaAdvanceCoding.Exercise20_21_22;

public class Qube extends ThreeDShape{
    @Override
    public int calculatePerimeter(Integer... dimensions) {
        if (dimensions.length != 1) {
            throw new IllegalArgumentException("A cube should have exactly 1 dimension (side length).");
        }
        int sideLength = dimensions[0];
        return 12 * sideLength;
    }

    @Override
    public int calculateArea(Integer... dimensions) {
        if (dimensions.length != 1) {
            throw new IllegalArgumentException("A cube should have exactly 1 dimension (side length).");
        }
        int sideLength = dimensions[0];
        return (int) (6 * Math.pow(sideLength, 2));
    }

    @Override
    public int calculateVolume(Integer... dimensions) {
        if (dimensions.length != 1) {
            throw new IllegalArgumentException("A cube should have exactly 1 dimension (side length).");
        }
        int sideLength = dimensions[0];
        return (int) Math.pow(sideLength, 3);
    }

    @Override
    public void fill(Integer... param) {
        if (calculateVolume(param[0]) > 8) {
            System.out.println("Cube is overflown with water");
        } else if (calculateVolume(param[0]) == 8) {
            System.out.println("Cube is filled with water to the brim");
        } else {
            System.out.println("Cube is not pouring enough water");
        }
    }
}
