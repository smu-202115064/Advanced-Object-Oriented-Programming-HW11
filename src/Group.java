import java.util.ArrayList;
import java.util.List;

public class Group extends AbstractSelectable {
    private List<Selectable> selectables;

    public Group(int num) {
        super("Group: " + num);
        selectables = new ArrayList<>();
    }

    public void add(Selectable o) {
        selectables.add(o);
        minBoundsX = Math.min(minBoundsX, o.getMinBoundsX());
        minBoundsY = Math.min(minBoundsY, o.getMinBoundsY());
        maxBoundsX = Math.max(maxBoundsX, o.getMinBoundsX());
        maxBoundsY = Math.max(maxBoundsY, o.getMinBoundsY());
    }
}
