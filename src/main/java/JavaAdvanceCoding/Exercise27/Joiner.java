package JavaAdvanceCoding.Exercise27;

public class Joiner<T> {
    private String separator;
    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... elements) {
        if(elements == null || elements.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder(elements[0].toString());

        for (int i = 1; i < elements.length; i++ ) {
            result.append(separator).append(elements[i]).toString();
        }

        return result.toString();
    }
}
