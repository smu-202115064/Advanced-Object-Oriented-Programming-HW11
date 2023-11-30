public class Shape extends AbstractSelectable {
    public Shape(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.printf("%s:\n", getName());
        System.out.printf("minBoundsX: %d, minBoundsY: %d\n", getMinBoundsX(), getMinBoundsY());
        System.out.printf("maxBoundsX: %d, maxBoundsY: %d\n", getMaxBoundsX(), getMaxBoundsY());
    }
}
