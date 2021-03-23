package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /** Building Queue with Stack */
        QueueWithTwoStack queue = new QueueWithTwoStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        int first = queue.dequeue();
        System.out.println(first);



        /** Building Queue With Array
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        queue.dequeue();
        int front = queue.dequeue();
        System.out.println(front);
        System.out.println(queue);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        System.out.println(queue);
        front = queue.dequeue();
        System.out.println(front);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        */


        /** Reversing a Queue
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue before reverse: \n" + queue);
        reverse(queue);
        System.out.println("Queue after reverse: \n" + queue);
        */


        /** Working with Queues
         * printer
         * web server
         * operating system
         * basically anyWhere Process job based on the order you received them.
         * FIFO --> first in first out
         * enqueue ---> adding an item to the back of the queue (add OR offer) ---> O(1)
         * dequeue ---> removing the item at the front of a queue (remove OR poll) ---> O(1)
         * peek OR element ---> getting the item at the front without removing it ---> O(1)
         * isEmpty ---> O(1)
         * isFull  ---> O(1)
         * LinkedList class in java implements the queue interface
         * Deque --> double ended queue --> queue has two end , add items from any direction
         * ArrayDeque internally uses the resizable array to store the item

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        int deletedItem = queue.remove();
        System.out.println(deletedItem);
        System.out.println(queue);

        */

    }

    public static void reverse(Queue<Integer> queue)
    {
        Stack<Integer> stack = new Stack<>();

        while(! queue.isEmpty() )
            stack.push(queue.remove());

        while (! stack.isEmpty() )
            queue.add(stack.pop());
    }
}
