package JavaAdvanceCoding.Exercise18_19;
/* 18. Create a Computer class with fields defining computer features: processor, ram, graphics card, company
and model. Implement setters, getters, constructor with all fields, toString(), equals() and hashcode() methods. Instantiate several objects and check how the methods work. */

/* 19. Create a Laptop class extending the Computer class from the previous task. The Laptop class should additionally contain the battery parameter.
Implement additional getters, setters, constructor and overwrite the toString(), equals() and hashcode() methods accordingly. Use a reference to parent class methods. */
public class Exercise18_19 {
    public static void main(String[] args) {

        //Exercise 18 :
        Computer computer1 = new Computer("Intel Core i7-10700K", 32, "NVIDIA GeForce RTX 3080", "Dell", "Alienware Aurora R10");
        Computer computer2 = new Computer("AMD Ryzen 9 5900X", 64, "AMD Radeon RX 6800 XT", "HP", "OMEN 30L");
        Computer computer3 = new Computer("AMD Ryzen 9 5900X", 64, "AMD Radeon RX 6800 XT", "HP", "OMEN 30L");


        System.out.println("Computer 1: " + computer1);
        System.out.println("Computer 2: " + computer2);
        System.out.println("Computer 3: " + computer3);

        System.out.println("Name of Computer 3 is: " + computer3.getCompany());

        System.out.println("Is computer 1 equals to computer 2? "+ computer1.equals(computer2));
        System.out.println("Is computer 2 equals to computer 3? "+ computer2.equals(computer3));

        System.out.println("HashCode of computer1: " + computer1.hashCode());
        System.out.println("HashCode of computer2: " + computer2.hashCode());
        System.out.println("HashCode of computer3: " + computer3.hashCode());
        System.out.println();


        //Exercise 19 :

        Laptop laptop1 = new Laptop("AMD Ryzen 9 5900X", 64, "AMD Radeon RX 6800 XT", "HP", "OMEN 30L",7);
        Laptop laptop2 = new Laptop("AMD Ryzen 9 5900X", 64, "AMD Radeon RX 6800 XT", "HP", "OMEN 30L",7);
        Laptop laptop3 = new Laptop("AMD Ryzen 7", 16, "AMD Radeon RX 5600M", "Dell", "XPS 13", 10);

        System.out.println("Laptop 1: " + laptop1);
        System.out.println("Laptop 2: " + laptop2);
        System.out.println("Laptop 3: " + laptop3);

        System.out.println("Is laptop 1 equals to laptop 2? " + laptop1.equals(laptop2));
        System.out.println("Is laptop 1 equals to laptop 3? " + laptop1.equals(laptop3));

        System.out.println("HashCode of laptop 2: " + laptop2.hashCode());


    }
}
