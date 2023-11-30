package JavaAdvanceCoding.Exercise12_13;
import java.util.List;
import java.util.SortedMap;

//Exercise 12 : Create a Manufacturer class that will contain fields: name, year of establishment, country. Include all
//necessary methods and constructor parameters. Implement the hashCode() and equals() methods.
//Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list
//(Manufacturer), and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3). Include all
//necessary methods and constructor parameters. Implement the hashcode() and equals() methods.
public class Exercise12 {
    public static void main(String[] args) {

        // Exercise 12
        Manufacturer manufacturer1 = new Manufacturer("Toyota", 1937, "Japan");
        Manufacturer manufacturer2 = new Manufacturer("Toyota", 1937, "Japan");
        Manufacturer manufacturer3 = new Manufacturer("Toyota", 1937, "Japan");


        System.out.println("Manufacturer 1: " + manufacturer1);
        System.out.println("Manufacturer 2: " + manufacturer2);
        System.out.println("Are manufacturers equal? " + manufacturer1.equals(manufacturer2));
        // Equal objects have the same hash code.
        System.out.println("Hash code for manufacturer 1: " + manufacturer1.hashCode());
        System.out.println("Hash code for manufacturer 2: " + manufacturer2.hashCode());
        System.out.println();

        Car car1 = new Car("Camry", "LE", 22000, 1920,EngineType.V12, List.of(manufacturer1,manufacturer2));
        Car car2 = new Car("Camry", "LE", 21000, 1920,EngineType.V12, List.of(manufacturer1,manufacturer2));
        Car car3 = new Car("Camry", "LE", 29000, 1920,EngineType.V12, List.of(manufacturer1,manufacturer2));
        Car car4 = new Car("Camry", "LE", 30000, 1920,EngineType.V12, List.of(manufacturer1,manufacturer2, manufacturer3));

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Are cars equals? " + car1.equals(car2));
        System.out.println("Hash code for car 1: " + car1.hashCode());
        System.out.println("Hash code for car 2: " + car2.hashCode());

        // Exercise 13
        CarService carService = new CarService();
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);


        System.out.println("Cars in the List: ");
        carService.returnCars();

        carService.removeCar(car1);

        System.out.println("Cars with V12 Engine: ");
        List<Car> v12Cars = carService.getCarsWithV12Engine();
        for (Car car : v12Cars) {
            System.out.println(car);
        }

        carService.getCarsProducedBefore1999();

        System.out.println("Most Expensive Car:");
        Car mostExpensiveCar = carService.getMostExpensiveCar();
        if (mostExpensiveCar != null) {
            System.out.println(mostExpensiveCar);
        }

        System.out.println("Mos cheapest Car: ");
        Car mostCheapestCar = carService.getMostCheapestCar();
        if (mostCheapestCar != null) {
            System.out.println(mostCheapestCar);
        }

        System.out.println("Car with at least 3 manufacturers: ");
        Car carWithAtLeast3Manufacturers = carService.getCarWithAtLeast3Manufacturers();
        System.out.println(carWithAtLeast3Manufacturers);


        System.out.println("All Cars Sorted in Ascending Order:");
        List<Car> ascendingSortedCars = carService.getCarsSorted(false);
        for (Car car : ascendingSortedCars) {
            System.out.println(car);
        }

        System.out.println( "Is this car part of the list? " +  carService.isCarOnList(car4));

        System.out.println("Cars by a specific manufacturer ");

        List<Car> list = carService.getCarsByManufacturer(manufacturer2);
        for (Car car : list) {
            System.out.println(car);
        }

        System.out.println("List of cars manufactured by the manufacturer with the year of establishment < 2000");
        List<Car> result = carService.getCarsByManufacturerYearComparison(2000, "<");
        for (Car car: result) {
            System.out.println(car);
        }

    }
}
