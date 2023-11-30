package JavaAdvanceCoding.Exercise12_13;

import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private int price;
    private int yearOfManufacture;
    private EngineType engineType;
    private List<Manufacturer> manufacturers;

    public Car(String name, String model, int price, int yearOfManufacture, EngineType engineType, List<Manufacturer> manufacturers) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.engineType = engineType;
        this.manufacturers = manufacturers;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && engineType == car.engineType && Objects.equals(manufacturers, car.manufacturers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, engineType, manufacturers);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", engineType=" + engineType +
                ", manufacturers=" + manufacturers +
                '}';
    }

}
