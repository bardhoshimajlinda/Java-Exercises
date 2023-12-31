package Collections;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(User o) {
        return this.getAge() -o.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
