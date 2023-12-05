package Collections;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        User [] users = new User[]{
                new User("Peter", 40),
                new User("John", 23)
        };

        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

    }
}
