package Stack;

import java.util.Stack;

public class ConvertPostfixToInfix {

    private String expression;
    Stack<String> stack = new Stack<>();

    public ConvertPostfixToInfix(String expression) {
        this.expression = expression;
    }

    public String convertToInfix(){

        for (char ch : expression.toCharArray()){

            if (isOperand(ch)) {
                stack.push(ch + "");
            }
            else{
                String firstOperand = stack.peek();
                stack.pop();
                String secondtOperand = stack.peek();
                stack.pop();
                stack.push("(" + secondtOperand + ch + firstOperand + ")");
            }
        }

        return stack.peek();
    }

    private boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z' ) || (ch >= 'A' && ch <= 'Z' ) || (ch >= '0' && ch <= '9');
    }

}
