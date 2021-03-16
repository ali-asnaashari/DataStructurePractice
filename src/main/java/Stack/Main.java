package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /** Part1 - working with stack
         * push()
         * pop()
         * peek()
         * search
         * isEmpty()
         * **/
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

        int top = stack.pop();
        System.out.println(stack);
        System.out.println(top);

        // fetch the element present at the top of the Stack.
        // The element retrieved does not get deleted or removed from the Stack.
        int top2 = stack.peek();
        System.out.println(stack);
        System.out.println(top2);

        boolean status = stack.isEmpty();
        System.out.println(status);

        // search for an element in the stack and get its distance from the top.
        int value = stack.search(30);
        System.out.println(value);

    }
}