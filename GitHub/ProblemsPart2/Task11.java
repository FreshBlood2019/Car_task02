package ProblemsArrays;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int [] funny_array = {586, 293, 203, 394, 953};
        System.out.println("The original array is "+ Arrays.toString(funny_array));
        for (int i = 0; i < funny_array.length / 2; i++) {
            int fun = funny_array[i];
            funny_array[i] = funny_array[funny_array.length - i - 1];
            funny_array[funny_array.length -i -1] = fun;
        }
        System.out.println("Reverse array is "+Arrays.toString(funny_array));
    }
}
