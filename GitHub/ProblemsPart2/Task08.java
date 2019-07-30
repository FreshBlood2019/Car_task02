package ProblemsArrays;

import java.util.Arrays;

public class Task08 {
    public static void main(String[] args) {
        int[] againArray = {12, 16, 18, 23, 27, 35};
        int[] freshArray = new int[6];

        System.out.println("The old array is "+ Arrays.toString(againArray));

        for (int i =0; i < againArray.length; i++) {
            freshArray[i] = againArray[i];
        }
        System.out.println("The new array is "+Arrays.toString(freshArray));
    }
}
