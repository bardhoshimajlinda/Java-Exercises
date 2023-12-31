package JavaAdvanceCoding.Exercise8;
//Implement the Validator interface, which will include a boolean validate(Parcel input) method in its
//declaration. Create a Parcel class with the parameters:
//• int xLength
//• int yLength
//• int zLength
//• float weight
//• boolean isExpress
//The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is
//not less than 30, whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true. In
//case of errors, it should inform the user about them.
public class Exercise8 {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(30,15,2, 40.0F,false);
        Parcel parcel2 = new Parcel(31,40,200, 40F,false);
        Parcel parcel3 = new Parcel(31,40,200, 25F,false);
        parcel1.validate(parcel1);
        parcel2.validate(parcel2);
        parcel3.validate(parcel3);
    }
}
