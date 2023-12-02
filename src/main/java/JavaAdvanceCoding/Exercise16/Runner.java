package JavaAdvanceCoding.Exercise16;

public enum Runner {
    BEGINNER(39,50),
    INTERMEDIATE(40,60),
    ADVANCED(60,80);

    final private int minimumTime;
    final private int maximumTime;

    Runner(int minimumTime, int maximumTime) {
        this.maximumTime=maximumTime;
        this.minimumTime=minimumTime;
    }

    public static Runner getFitnessLevel(int time) {
        if (BEGINNER.maximumTime >= time) {
            return BEGINNER;
        } else if (INTERMEDIATE.minimumTime <= time && time <= INTERMEDIATE.maximumTime) {
            return INTERMEDIATE;
        } else if (ADVANCED.minimumTime <= time && time <= ADVANCED.maximumTime) {
            return ADVANCED;
        } else {
            return null;
        }
    }
}
