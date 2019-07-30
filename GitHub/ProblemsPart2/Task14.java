package ProblemsArrays;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[] array_one = {6, 8, 1, 5};
        int[] array_two = {2, 5, 2, 6};
        System.out.println("Array one is "+ Arrays.toString(array_one));
        System.out.println("Array two is "+ Arrays.toString(array_two));
            for(int i = 0; i < array_one.length; i++) {
                for (int j = 0; j <array_two.length; j++) {
                    if (array_one[i] == array_two[j]) {
                        System.out.println("Common element is "+(array_one[i]));
                    }
                }
            }
    }
}
