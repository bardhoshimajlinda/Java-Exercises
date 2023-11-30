package JavaAdvanceCoding.Exercise12_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Exercise 13 : Create a CarService class that will contain a list of cars and implement the following methods:
//1. adding cars to the list,
//2. removing a car from the list,
//3. returning a list of all cars,
//4. returning cars with a V12 engine,
//5. returning cars produced before 1999,
//6. returning the most expensive car,
//7. returning the cheapest car,
//8. returning the car with at least 3 manufacturers,
//9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
//10. checking if a specific car is on the list,
//11. returning a list of cars manufactured by a specific manufacturer,
//12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =,
//=,! = from the given.
public class CarService {
    private List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    //1. adding cars to the list
    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Car added: " + car);
    }

    //2. removing a car from the list
    public void removeCar(Car car) {
        if (cars.remove(car)) {
            System.out.println("Car removed: " + car);
        } else {
            System.out.println("Car not found in the list: " + car);
        }
    }

    //3. returning a list of all cars
    public void returnCars() {
//        return new ArrayList<>(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    //4. returning cars with a V12 engine
     public List<Car> getCarsWithV12Engine() {
        List<Car> v12Cars  = new ArrayList<>();
        for (Car car: cars) {
            if (car.getEngineType().equals(EngineType.V12)) {
                v12Cars .add(car);
            }
        }
        return v12Cars;
     }

    //5. returning cars produced before 1999
    public void getCarsProducedBefore1999() {
        List<Car> list = new ArrayList<>();
        for (Car car: cars) {
            if (car.getYearOfManufacture() < 1999) {
                list.add(car);
            }
        }
        System.out.println("Cars produced before 1999 " + list);
    }

    //6. returning the most expensive car
    public Car getMostExpensiveCar() {
        if (cars.isEmpty()) {
            System.out.println("No cars in the list.");
            return null;
        }
        Car mostExpensiveCar = cars.get(0);
        for (Car car: cars) {
            if (car.getPrice() > mostExpensiveCar.getPrice()) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    //7. returning the cheapest car
    public Car getMostCheapestCar() {
        if (cars.isEmpty()) {
            System.out.println("No cars in the list.");
            return null;
        }
        Car mostCheapestCar = cars.get(0);
        for (Car car: cars) {
            if (car.getPrice() < mostCheapestCar.getPrice()) {
                mostCheapestCar = car;
            }
        }
        return mostCheapestCar;
    }

    //8. returning the car with at least 3 manufacturers
    public Car getCarWithAtLeast3Manufacturers() {
    for (Car car : cars) {
        if (car.getManufacturers().size() >= 3) {
            return car;
        }
    }
    System.out.println("No car with at least 3 manufacturers found.");
    return null;

    }

    //9. returning a list of all cars sorted according to the passed parameter: ascending / descending
    public List<Car> getCarsSorted(boolean ascending) {
       List<Car> sortedCars = new ArrayList<>(cars);
        if (ascending) {
            sortedCars.sort(Comparator.comparing(Car::getPrice));
        } else {
            sortedCars.sort((car1, car2) -> Integer.compare(car2.getPrice(), car1.getPrice()));
        }
        return sortedCars;
    }



    //10. checking if a specific car is on the list

    public boolean isCarOnList(Car carToBeChecked) {
        return cars.contains(carToBeChecked);
    }


    //11. returning a list of cars manufactured by a specific manufacturer

    public List<Car> getCarsByManufacturer(Manufacturer targetManufacturer) {
        List<Car> carsByManufacturer = new ArrayList<>();
        for (Car car : cars) {
            List<Manufacturer> manufacturers = car.getManufacturers();
            if (manufacturers.contains(targetManufacturer)) {
                carsByManufacturer.add(car);
            }
        }
        return carsByManufacturer;
    }


    //12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =, =,! = from the given.
    public List<Car> getCarsByManufacturerYearComparison(int year, String operator) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            for (Manufacturer manufacturer : car.getManufacturers()) {
                int manufacturerYear = manufacturer.getYearOfEstablishment();

                switch (operator) {
                    case "<":
                        if (manufacturerYear < year) {
                            filteredCars.add(car);
                        }
                        break;
                    case ">":
                        if (manufacturerYear > year) {
                            filteredCars.add(car);
                        }
                        break;
                    case "<=":
                        if (manufacturerYear <= year) {
                            filteredCars.add(car);
                        }
                        break;
                    case ">=":
                        if (manufacturerYear >= year) {
                            filteredCars.add(car);
                        }
                        break;
                    case "==":
                        if (manufacturerYear == year) {
                            filteredCars.add(car);
                        }
                        break;
                    case "!=":
                        if (manufacturerYear != year) {
                            filteredCars.add(car);
                        }
                        break;
                    default:
                        System.out.println("Invalid operator: " + operator);
                }
            }
        }
        return filteredCars;
    }

}
