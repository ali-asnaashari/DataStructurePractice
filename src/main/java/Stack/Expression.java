package Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> leftBrackets = Arrays.asList('(','<','[','{');
    private final List<Character> rightBrackets = Arrays.asList(')','>',']','}');

    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }
    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }

    public boolean isBalanced(String input){
        Stack<Character> stack =  new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (isLeftBracket(input.charAt(i)))
                stack.push(input.charAt(i));

            if (isRightBracket(input.charAt(i))){
                if (stack.isEmpty()) return false;

                Character top = stack.pop();
                if (!bracketMatch(top,input.charAt(i))) return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean bracketMatch(char left,char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
