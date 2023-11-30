public class Shape implements Selectable {
    @Override
    public int getMinBoundsX() {
        return 0;
    }

    @Override
    public int getMinBoundsY() {
        return 0;
    }

    @Override
    public int getMaxBoundsX() {
        return 0;
    }

    @Override
    public int getMaxBoundsY() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isSelected(int x, int y) {
        return false;
    }

    @Override
    public void print() {

    }
}
