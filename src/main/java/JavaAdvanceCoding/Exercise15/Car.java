package JavaAdvanceCoding.Exercise15;

public enum Car {
    FERRARI(300000, 500, true),
    PORSCHE(200000, 400, true),
    MERCEDES(150000, 350, true),
    BMW(120000, 300, true),
    OPEL(50000, 150, false),
    FIAT(30000, 100, false),
    TOYOTA(40000, 120, false);

    final int price;
    final int power;
    private final boolean premium;

    Car(int price, int power, boolean premium) {
        this.price = price;
        this.power = power;
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }
     public boolean isRegular() {
        return !premium;
     }

    public boolean isFasterThan(Car otherCar) {
        return this.power > otherCar.power;
    }
}
