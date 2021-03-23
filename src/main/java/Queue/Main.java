package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
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
         */
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        int deletedItem = queue.remove();
        System.out.println(deletedItem);
        System.out.println(queue);
    }
}
