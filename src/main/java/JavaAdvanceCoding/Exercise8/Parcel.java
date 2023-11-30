package JavaAdvanceCoding.Exercise8;

public class Parcel implements Validator {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate(Parcel input) {
        int sum=xLength+yLength+zLength;
        if (sum>300){
            System.out.println("The sum of the dimensions is bigger 300");
        }
        else if (xLength<=30 || yLength<=30 || zLength<=30){
            System.out.println("one of the sizes x , y , z is less than 30");
        }
        else if (isExpress==false && weight>30.0){
            System.out.println("Weight for isExpress false bigger than 30");
        }
        else if (isExpress==true && weight>15.0){
            System.out.println("Weight for isExpress true bigger than 15");
        }
        else  System.out.println("All conditions are met!");
        return true;
    }

}
