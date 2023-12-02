package JavaAdvanceCoding.Exercise17;

public enum ConversionType {
    METERS_TO_YARDS {
        @Override
        public double convert(int value) {
            return value * 1.09361;
        }
    },
    YARDS_TO_METERS {
        @Override
        public double convert(int value) {
            return value / 1.09361;
        }
    },
    CENTIMETERS_TO_INCHES {
        @Override
        public double convert(int value) {
            return value * 0.393701;
        }
    },
    INCHES_TO_CENTIMETERS {
        @Override
        public double convert(int value) {
            return value / 0.393701;
        }
    },
    KILOMETERS_TO_MILES {
        @Override
        public double convert(int value) {
            return value * 0.621371;
        }
    },
    MILES_TO_KILOMETERS {
        @Override
        public double convert(int value) {
            return value / 0.621371;
        }
    };

    public abstract double convert(int value);
}
