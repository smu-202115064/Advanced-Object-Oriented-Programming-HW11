import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 도형을 생성할 때 다음 좌표를 활용할 것
        // 왼쪽은 도형에서 사용할 좌표, 오른쪽은 도형의 이름을 나타냄
                         // coordinates             // shape name
        int[] coords = { 36, 33, 66, 53,            // R1
                         24, 22, 31, 34, 22, 35,    // T1
                         27, 35, 57, 55,            // g1_R1
                         36, 60, 66, 80,            // g1_R2
                         29, 30, 30, 48, 30, 43,    // g1_T1
                         31, 39, 31, 48, 45, 11 };  // g1_T2
                         
        // Selectable을 저장할 수 있는 ArrayList를 생성하고, Rectangle R1, Triangle T1을 추가
        List<Selectable> lst = new ArrayList<>();

        lst.add(new Rectangle("R1", coords, 0));
        lst.add(new Triangle("T1", coords, 4));

        // Group을 생성하고 Rectangle g1_R1, g1_R2을 그룹에 추가
        Group g1 = new Group(1);

        g1.add(new Rectangle("g1_R1", coords, 10));
        g1.add(new Rectangle("g1_R2", coords, 14));

        // 그룹에 Triangle g1_T1, g1_T2를 추가, 
        // 생성된 그룹을 ArrayList에 추가
        g1.add(new Triangle("g1_T1", coords, 18));
        g1.add(new Triangle("g1_T2", coords, 24));

        lst.add(g1);

        // ArrayList에 있는 각 Selectable의 정보를 화면에 출력하고, 
        // 좌표 (20, 20), (30, 30), (40, 40)이 BoundingBox애 포함되는지 출력
        for (Selectable o : lst) {
            o.print();
            for (int coord = 20; coord <= 40; coord += 10) {
                Boolean isSelected = o.isSelected(coord, coord);
                System.out.printf("%s is selected at (%d, %d): %s\n", o.getName(), coord, coord, isSelected);
            }
            System.out.println();
        }
    }
}
