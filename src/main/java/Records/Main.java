package Records;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Corolla", "Toyota", 4);

        System.out.println("Car model: " + car.model());
        System.out.println("Car producer: "+ car.producer());
        System.out.println("Wheel Size: " + car.wheelSize());

        System.out.println(car);
        System.out.println(car.hashCode());
    }
}
