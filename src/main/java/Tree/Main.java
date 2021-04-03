package Tree;

public class Main {
    public static void main(String[] args) {

        /** Implement Tree (insert) */
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println("Done!");


        /** Tree
         * data structure that stores elements in a hierarchy.
         * refer to these elements as nodes.
         * lines that connect them as edges.
         * Each node contains a value or data , even store object.
         * root : the top node in tree
         * application: 1)people in our organization 2)DataBase 3)Auto completion 4)compilers -> syntax tree to parse expressions
         * binary tree = binary search tree -> because allow us to quickly look up data.
         * In a binary search tree, the value of any node is always greater than the value of leftChild
         * and smaller than rightChild
         * logarithmic time:
         *  lookUp --> o(log n)
         *  insert --> o(log n)
         *  delete --> o(log n)
         */

    }
}
