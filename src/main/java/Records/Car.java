package Records;

public record Car(String model,
                  String producer,
                  int wheelSize) {

    public Car(String model, String producer) { // additional constructor
        this(model, producer, 4);                 // we MUST call canonical constructor with "this"
    }
}
