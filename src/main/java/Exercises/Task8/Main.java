package Exercises.Task8;

public class Main {
    public static void main(String[] args) {

        int packageSize = 15;
        PackageSize selectedSize = PackageSize.getPackageSize(packageSize);

        System.out.println("For a package size of " + packageSize + " cm, the recommended PackageSize is: " + selectedSize);
    }
}
