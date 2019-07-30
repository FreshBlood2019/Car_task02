package ProblemsArrays;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        int[] hello_array = {18, 29, 40, 28, 48};
        System.out.println("The original array is "+Arrays.toString(hello_array));
        int max = Integer.MAX_VALUE;
        int second_max = Integer.MAX_VALUE;
            for(int i = 0; i < hello_array.length; i++) {
                if(hello_array[i] == max) {
                    second_max = max;
                } else if (hello_array[i] < max) {
                    second_max = max;
                    max = hello_array[i];
                } else if (hello_array[i] < second_max) {
                    second_max = hello_array[i];
                }
        }
        System.out.println("The second lowest number is "+second_max);
    }
}
