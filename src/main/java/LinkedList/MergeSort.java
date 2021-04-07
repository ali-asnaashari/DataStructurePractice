package LinkedList;

public class MergeSort {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    private Node sortedMerge(Node listA, Node listB) {
        Node result = null;

        // Base cases
        if (listA == null)
            return listB;
        if (listB == null)
            return listA;

        if (listA.data <= listB.data) {
            result = listA;
            result.next = sortedMerge(listA.next, listB);
        }
        else {
            result = listB;
            result.next = sortedMerge(listA, listB.next);
        }
        return result;
    }

    public Node mergeSort(Node h) {
        // Base case
        if (h == null || h.next == null) {
            return h;
        }

        // get the middle of the list
        Node middle = getMiddle(h);
        Node nextofmiddle = middle.next;

        // set the next of middle node to null
        middle.next = null;

        // Apply mergeSort on left list
        Node left = mergeSort(h);

        // Apply mergeSort on right list
        Node right = mergeSort(nextofmiddle);

        // Merge the left and right lists
        Node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }


    private Node getMiddle(Node head) {
        if (head == null)
            return head;

        Node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList(Node head) {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

}
