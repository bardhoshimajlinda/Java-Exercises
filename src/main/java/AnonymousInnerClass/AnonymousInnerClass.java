package AnonymousInnerClass;

/*There are 2 different ways to create an anonymous inner class :
   1. Create a subclass of an existing class
   2. By implementing an interface */

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();

        Animal bigfoot = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("grawlenemdkf");
            }
        };
        bigfoot.makeNoise();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm an anonymous runnable");
            }
        };
        runnable.run();

    }
}
