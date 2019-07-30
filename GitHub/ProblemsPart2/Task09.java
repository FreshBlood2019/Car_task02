package ProblemsArrays;

import java.util.Arrays;

public class Task09 {
    public static void main(String[] args) {
        int [] happyArray = {2, 6, 7, 9, 12, 45};
        int indexPosition = 3;
        int newValue = 44;

        System.out.println("The original array is: "+ Arrays.toString(happyArray));

        for (int i = happyArray.length-1; i > indexPosition; i-- ) {
            happyArray[i] =happyArray[i-1];
        }
        happyArray[indexPosition] = newValue;
        System.out.println("The new array is "+Arrays.toString(happyArray));
    }
}
