package LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class Palindrome {

    Stack<Integer> stack = new Stack<>();

    private void TreverseLinkedList (LinkedList<Integer> linkedList){

        for (int item = 0; item < linkedList.size(); item++) {
            stack.push(linkedList.get(item));
        }
    }

    public boolean isPalindrome(LinkedList<Integer> linkedList){
        TreverseLinkedList(linkedList);

        for (int item = 0; item < linkedList.size() ;  item++) {
            if(!linkedList.get(item).equals(stack.pop()))
                return false;
        }

        return true;
    }


}
