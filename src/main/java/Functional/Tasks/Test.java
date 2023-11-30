package Functional.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //Find people age less or equal 18
        //Then change implementation to find first 10 people
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Anna",23));
        personList.add(new Person("Rei",22));
        personList.add(new Person("Lui",24));
        personList.add(new Person("Zara",20));
        personList.add(new Person("Michel",32));
        personList.add(new Person("Lus",29));
        personList.add(new Person("Asi",8));
        personList.add(new Person("John",10));
        personList.add(new Person("Clark",23));
        personList.add(new Person("Sam",27));
        personList.add(new Person("Zoi",29));
        personList.add(new Person("Lucas",24));
        personList.add(new Person("Poem",12));
        personList.add(new Person("Maria",18));
        personList.add(new Person("Mail",25));

       List<Person> newList = personList.stream()
                .filter(person -> person.getAge()<=18)
                .limit(10)
                .toList();

       for (Person person:newList){
           System.out.println(person.getName() + " " + person.getAge());
       }

       personList.stream()
               .filter(person -> person.getAge() <= 18)
               .limit(10)
               .forEach(person -> System.out.println(person.getName() + " " + person.getAge()));

    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
