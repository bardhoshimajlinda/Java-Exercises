package Exercises.Task8;

public enum PackageSize {
    SMALL(0, 10),
    MEDIUM(11, 30),
    LARGE(31, Integer.MAX_VALUE);

    private final int minSize;
    private final int maxSize;

    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(int packageSize) {
        for (PackageSize size : PackageSize.values()) {
            if (packageSize >= size.minSize && packageSize <= size.maxSize) {
                return size;
            }
        }
        throw new IllegalArgumentException("No matching PackageSize for the given size: " + packageSize);
    }
}
