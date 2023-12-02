package JavaAdvanceCoding.Exercise20_21_22;

public class Cone extends ThreeDShape{
    @Override
    public int calculatePerimeter(Integer... dimensions) {
        // Cone doesn't have perimeter
        throw new UnsupportedOperationException("Cone does not have a perimeter.");
    }

    @Override
    public int calculateArea(Integer... dimensions) {
        if (dimensions.length != 2) {
            throw new IllegalArgumentException("A cone should have exactly 2 dimensions (radius and slant height).");
        }
        int radius = dimensions[0];
        int slantHeight = dimensions[1];
        return (int) (Math.PI * radius * (radius + slantHeight));
    }

    @Override
    public int calculateVolume(Integer... dimensions) {
        if (dimensions.length != 2) {
            throw new IllegalArgumentException("A cone should have exactly 2 dimensions (radius and height).");
        }
        int radius = dimensions[0];
        int height = dimensions[1];
        return (int) ((1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height);
    }

    @Override
    public void fill(Integer... param) {
        if (calculateVolume(param[0], param[1]) > 1047.1975511965977) {
            System.out.println("Cone is overflown with water");
        } else if (calculateVolume(param[0], param[1]) == 1047.1975511965977) {
            System.out.println("Cone is filled with water to the brim");
        } else {
            System.out.println("Cone is not pouring enough water");
        }
    }


}
