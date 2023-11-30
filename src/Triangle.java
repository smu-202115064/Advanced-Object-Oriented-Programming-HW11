import java.util.Arrays;

public class Triangle extends Shape {
    public Triangle(String name, int[] coords, int idx) {
        super(name);
        minBoundsX = min(coords[idx+0], coords[idx+2], coords[idx+4]);
        minBoundsY = min(coords[idx+1], coords[idx+3], coords[idx+5]);
        maxBoundsX = max(coords[idx+0], coords[idx+2], coords[idx+4]);
        maxBoundsY = max(coords[idx+1], coords[idx+3], coords[idx+5]);
    }

    private int min(int ...args) {
        return Arrays.stream(args).reduce(Math::min).getAsInt();
    }

    private int max(int ...args) {
        return Arrays.stream(args).reduce(Math::max).getAsInt();
    }
}
