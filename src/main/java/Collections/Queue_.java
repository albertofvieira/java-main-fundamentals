package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ {

    public static void main(String[] args) {

       // Queue<>
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll()); // remove first
        System.out.println(queue);



    }
}
