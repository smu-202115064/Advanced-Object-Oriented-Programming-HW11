public abstract class AbstractSelectable implements Selectable {
    private String name;

    /** Note:
     * access modifier로 protected가 더 적절해 보이지만, 수업에서는 public or private 만 사용하기로 했으므로,
     * 상속받은 클래스에서 아래의 필드를 수정할 수 있도록 하기 위해 public 접근 제한자를 부여함.
     */
    public int minBoundsX;
    public int minBoundsY;
    public int maxBoundsX;
    public int maxBoundsY;

    public AbstractSelectable(String name) {
        this.name = name;
        minBoundsX = 0;
        minBoundsY = 0;
        maxBoundsX = 0;
        maxBoundsY = 0;
    }

    @Override
    public int getMinBoundsX() {
        return minBoundsX;
    }

    @Override
    public int getMinBoundsY() {
        return minBoundsY;
    }

    @Override
    public int getMaxBoundsX() {
        return maxBoundsX;
    }

    @Override
    public int getMaxBoundsY() {
        return maxBoundsY;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isSelected(int x, int y) {
        return x >= getMinBoundsX() && x <= getMaxBoundsX() && y >= getMinBoundsY() && y <= getMaxBoundsY();
    }

    abstract public void print();
}
