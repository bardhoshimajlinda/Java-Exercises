package JavaAdvanceCoding.Exercise15;
//Create a Car enum class with FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA etc. constants.
//Each vehicle has its own parameters, e.g. price, power, etc. Enum should contain boolean isPremium() and
//boolean isRegular() methods. The isPremium() method should return the opposite result to the call of the
//isRegular() method.
//In addition, the boolean isFasterThan() method should be declared and implemented as part of the enum
//class. This method should accept the Car type object and display information that the indicated vehicle is
//faster or not than the vehicle provided in the argument. To do this, use the compareTo() method.
public class Exercise15 {
    public static void main(String[] args) {
        Car opel = Car.OPEL;
        Car fiat = Car.FIAT;

        System.out.println(Car.BMW.isFasterThan(opel));
        System.out.println(opel.isPremium());
        System.out.println(opel.isRegular());

        if (fiat.isFasterThan(opel)) {
            System.out.println("Fiat is faster than Opel.");
        } else {
            System.out.println("Opel is faster than or as fast as Fiat.");
        }

    }
}
