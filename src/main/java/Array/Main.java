package Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

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

    }
}
