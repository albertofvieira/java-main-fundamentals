package Collections;

import java.util.Stack;

public class Stack_ {

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        // Pick top element of stack
        System.out.println(myStack.peek());

        // Size
        System.out.println(myStack.size());

        // Remove top element
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println(myStack);

        // Add item to top
        myStack.push(6);
        System.out.println(myStack);

    }
}
