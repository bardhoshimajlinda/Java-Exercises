package JavaAdvanceCoding.Exercise26;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Using functional programming mechanisms based on the given structure, display:
1. a list of all Models,
2. a list of all cars,
3. list of all manufacturer names,
4. list of all manufacturers' establishment years,
5. list of all model names,
6. list of all years of starting production of models,
7. list of all car names,
8. list of all car descriptions,
9. only models with an even year of production start,
10. only cars from manufacturers with an even year of foundation,
11. only cars with an even year of starting production of the model and an odd year of establishing the
manufacturer,
12. only CABRIO cars with an odd year of starting model production and an even year of establishing the
manufacturer,
13. only cars of the SEDAN type from a model newer than 2019 and the manufacturer's founding year less than
1919
 */
public class Exercise26 {
    public static void main(String[] args) {
        Car car1 = new Car("Car1", "Description1", CarType.COUPE);
        Car car2 = new Car("Car2", "Description2", CarType.CABRIO);
        Car car3 = new Car("Car3", "Description3", CarType.SEDAN);
        Model model1 = new Model("Model1", 2018, Arrays.asList(car1, car2));
        Model model2 = new Model("Model2", 2020, Arrays.asList(car3));
        Manufacturer manufacturer1 = new Manufacturer("Manufacturer1", 1910, Arrays.asList(model1, model2));
        Manufacturer manufacturer2 = new Manufacturer("Manufacturer2", 1920, Arrays.asList(model1, model2));

        List<Manufacturer> manufacturers = Arrays.asList(manufacturer1, manufacturer2);


        //1. a list of all Models
        List<Model> models = manufacturers.stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .toList();
        System.out.println("All models " + models);

        //2. a list of all cars
//        List<Car> cars = models.stream()
//                .flatMap(model -> model.cars.stream())
//                .collect(Collectors.toList());
//        System.out.println("All cars "+ cars);

        // or like this:

        List<Car> cars = manufacturers.stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .flatMap(model -> model.cars.stream())
                .collect(Collectors.toList());
        System.out.println(cars);


        //3. list of all manufacturer names
        List<String> manufacturerNames = manufacturers.stream()
                .map(manufacturer -> manufacturer.name)
                .toList();
        System.out.println("Manufacturer names: " + manufacturerNames);


        //4. list of all manufacturers' establishment years
        List<Integer> establishmentYears = manufacturers.stream()
                .map(manufacturer -> manufacturer.yearOfCreation)
                .collect(Collectors.toList());
        System.out.println("Establishment Years: " + establishmentYears);


        //5. list of all model names
        List<String> modelNames = manufacturers.stream()
                .flatMap(manufacturer -> manufacturer.models.stream())
                .map(model -> model.name)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Model names " + modelNames );


        //6. list of all years of starting production of models
        List<Integer> productionStartingYears = models.stream()
                .map(model -> model.productionStartYear)
                .collect(Collectors.toList());
        System.out.println("All years of starting production of models " + productionStartingYears);


        //7. list of all car names
        List<String> carNames = models.stream()
                .flatMap(car -> car.cars.stream())
                .map(car -> car.name)
                .collect(Collectors.toList());
        System.out.println("Car names: " + carNames);


        //8. list of all car descriptions
        List<String> carDescription = cars.stream()
                .map(car -> car.description)
                .collect(Collectors.toList());
        System.out.println("Car descriptions " + carDescription);

        //9. only models with an even year of production start
        List<Model> modelsWithEvenYearOfProduction = models.stream()
                .filter(model -> model.productionStartYear %2 == 0)
                .collect(Collectors.toList());
        System.out.println("Models with an even year of production start " + modelsWithEvenYearOfProduction);

        //10. only cars from manufacturers with an even year of foundation
        List<Car> carsFromEvenYearManufacturers = manufacturers.stream()
                .filter(manufacturer -> manufacturer.yearOfCreation %2 == 0)
                .flatMap(manufacturer -> manufacturer.models.stream())
                .flatMap(model -> model.cars.stream())
                .toList();
        System.out.println("Cars from manufacturers with an even year of foundation: " + carsFromEvenYearManufacturers);


        //11. only cars with an even year of starting production of the model and an odd year of establishing the manufacturer
        List<Car> evenYearOfStartingProductionAndOddYearOfEstablishing = manufacturers.stream()
                .filter(manufacturer -> manufacturer.yearOfCreation %2 != 0)
                .flatMap(manufacturer -> manufacturer.models.stream())
                .filter(model -> model.productionStartYear %2 == 0)
                .flatMap(model -> model.cars.stream())
                .collect(Collectors.toList());

        if (evenYearOfStartingProductionAndOddYearOfEstablishing.isEmpty()) {
            System.out.println("No cars found with the specified conditions.");
        } else {
            System.out.println("Cars with an even year of starting production of the model and an odd year of establishing the manufacturer " + evenYearOfStartingProductionAndOddYearOfEstablishing);
        }


        //12. only CABRIO cars with an odd year of starting model production and an even year of establishing the manufacturer
        List<Car> cabrioCars = manufacturers.stream()
                .filter(manufacturer -> manufacturer.yearOfCreation % 2 == 0)
                .flatMap(manufacturer -> manufacturer.models.stream())
                .filter(model -> model.productionStartYear % 2 != 0)
                .flatMap(model -> model.cars.stream())
                .filter(car -> car.carType.equals(CarType.CABRIO))
                .collect(Collectors.toList());

        if (cabrioCars.isEmpty()) {
            System.out.println("No cars found with the specified conditions.");
        } else {
            System.out.println("CABRIO cars with an odd year of starting model production and an even year of establishing the manufacturer " + cabrioCars);
        }


        //13. only cars of the SEDAN type from a model newer than 2019 and the manufacturer's founding year less than 1919
        List<Car> sedanCars = manufacturers.stream()
                .filter(manufacturer -> manufacturer.yearOfCreation < 1919)
                .flatMap(manufacturer -> manufacturer.models.stream())
                .filter(model -> model.productionStartYear > 2019)
                .flatMap(model -> model.cars.stream())
                .collect(Collectors.toList());

        if (cabrioCars.isEmpty()) {
            System.out.println("No cars found with the specified conditions.");
        } else {
            System.out.println("Cars of the SEDAN type from a model newer than 2019 and the manufacturer's founding year less than 1919 " + sedanCars);
        }

    }
}
