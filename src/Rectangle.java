import java.util.Arrays;

public class Rectangle extends Shape {
    public Rectangle(String name, int[] coords, int idx) {
        super(name);
        minBoundsX = Math.min(coords[idx+0], coords[idx+2]);
        minBoundsY = Math.min(coords[idx+1], coords[idx+3]);
        maxBoundsX = Math.max(coords[idx+0], coords[idx+2]);
        maxBoundsY = Math.max(coords[idx+1], coords[idx+3]);
    }
}
