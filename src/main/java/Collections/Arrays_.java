package Collections;

import java.util.Arrays;

public class Arrays_ {

    public static void main(String[] args) {

        String[] colors = new String[5];
        colors[0] = "White";
        colors[1] = "Black";
        colors[2] = "Blue";
        colors[3] = "Purple";
        colors[4] = "Yellow";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[2]);

        // Error
        //System.out.println(colors[5]);

        int[] numbers = { 100, 200 };

        System.out.println(Arrays.toString(numbers));

        Arrays.stream(numbers).forEach(System.out::println);

        char[][] board = new char[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }

        System.out.println(Arrays.deepToString(board));
    }
}
