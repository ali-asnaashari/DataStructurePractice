package Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Array numbers = new Array(3);
        numbers.insert(100);
        numbers.insert(200);
        numbers.insert(300);
        numbers.insert(400);
        numbers.print();
        System.out.println(numbers.indexOf(200));
        System.out.println(numbers.indexOf(500));



        /** Part3 - Create removeAt method
        Array numbers = new Array(3);
        numbers.insert(100);
        numbers.insert(200);
        numbers.insert(300);
        numbers.insert(400);
        numbers.print();
        numbers.removeAt(0);
        numbers.print();
        numbers.removeAt(3);
        // Error Occurred
        numbers.print();
        **/


        /** Part2 - Create Dynamic Array Class - print & insert Method
        Array numbers = new Array(3);
        numbers.insert(100);
        numbers.insert(200);
        numbers.insert(300);
        numbers.insert(400);
        numbers.print();
        **/


        /** Part1 - Definition & Built-in Method
        // Definition Array
        int[] numbers = new int[3];
        // Output , combination of the Type of array followed by an @ sign and
        // generated based on the address of object in memory , This is not useful.
        System.out.println(numbers);

        // All items in Numeric array are initialized to zero.
        System.out.println(Arrays.toString(numbers));

        // change value
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(Arrays.toString(numbers));

        // Another Definition
        String[] names = {"ali","ahmad","sina"};
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));
        **/

    }
}
