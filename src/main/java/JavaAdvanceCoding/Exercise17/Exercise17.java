package JavaAdvanceCoding.Exercise17;
//Create a ConversionType enum class with the constants METERS_TO_YARDS, YARDS_TO_METERS,
//CENTIMETERS_TO_ICHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
//Enum should have a Convertertype parameter used to perform calculations for a given type.
//Then create a MeasurementConverter class that will have the convert(int value, ConvertionType conversionType) method and based on the value and type of conversion, used the Converter of the given
//type and returned the result.
public class Exercise17 {
    public static void main(String[] args) {
        int value = 100;

        double resultMetersToYards = MeasurementConverter.convert(value, ConversionType.METERS_TO_YARDS);
        System.out.println(value + " meters is equal to " + resultMetersToYards + " yards.");

        double resultCentimetersToInches = MeasurementConverter.convert(value, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(value + " centimeters is equal to " + resultCentimetersToInches + " inches.");

        double resultMilesToKilometers = MeasurementConverter.convert(value, ConversionType.MILES_TO_KILOMETERS);
        System.out.println(value + " miles is equal to " + resultMilesToKilometers + " kilometres.");

    }
}
