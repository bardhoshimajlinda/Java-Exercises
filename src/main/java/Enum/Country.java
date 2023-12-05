package Enum;

public enum Country {
    ALBANIA("Average"),
    CHINA("Height"),
    INDIA("High"),
    RUSSIA("LOW"),
    AUSTRALIA("LOW");


    private String populationDensity;
    private Country(String populationDensity) {
        this.populationDensity=populationDensity;
    }

    public String getPopulationDensity() {
        return populationDensity;
    }
}
