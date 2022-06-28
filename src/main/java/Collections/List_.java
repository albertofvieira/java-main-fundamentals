package Collections;

import java.util.ArrayList;
import java.util.List;

public class List_ {

    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("Green");
        colors.add(123);

        List<String> colors2 = new ArrayList<>();
        colors2.add("White");
        colors2.add("Black");
        colors2.add("Blue");

        System.out.println(colors2.contains("Blue"));
        System.out.println(colors.contains("Blue"));

        // Immutable Collection
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);

    }
}