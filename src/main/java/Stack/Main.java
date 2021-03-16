package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /** Part3 - StringBalancing **/
        String str = "([1*2])";
        String str1 = "([>1*2)]";
        String str2 = "(]<1*2>[)";
        Expression expression = new Expression();
        System.out.println(expression.isBalanced(str));
        System.out.println(expression.isBalanced(str1));
        System.out.println(expression.isBalanced(str2));


        /** Part2 - Reversing a String
        String str = "Ali";
        StringReverser reverser = new StringReverser();
        String result = reverser.revers(str);
        System.out.println(result);
         **/


        /** Part1 - working with stack
         * push()
         * pop()
         * peek()
         * search
         * isEmpty()

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
         **/
    }
}
