package JavaAdvanceCoding.Exercise26;

import java.util.ArrayList;
import java.util.List;

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
        Car car1 = new Car("Audi A3", "Compact luxury car", CarType.HATCHBACK);
        Car car2 = new Car("BMW 3 Series", "Compact executive car", CarType.SEDAN);
        Car car3 = new Car("Porsche 911", "Sports car", CarType.COUPE);

        List<Car> cars1 = new ArrayList<>();
        cars1.add(car1);
        cars1.add(car2);

        List<Car> cars2 = new ArrayList<>();
        cars2.add(car3);

        Model audiModel = new Model("Audi A3", 2010, cars1);
        Model bmwModel = new Model("BMW 3 Series", 2005, cars2);

        List<Model> audiModels = new ArrayList<>();
        audiModels.add(audiModel);
        List<Model> bmwModels = new ArrayList<>();
        bmwModels.add(bmwModel);

        Manufacturer bmwManufacturer = new Manufacturer("BMW", 1916, bmwModels);

        audiModels.stream().forEach(System.out::println);


    }
}
