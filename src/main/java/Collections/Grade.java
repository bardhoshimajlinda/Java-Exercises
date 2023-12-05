package Collections;

import java.util.Objects;

public class Grade {
    private int value;

    public Grade(int value) {
        this.value = value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return Objects.equals(value, grade.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Grade{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }

}
