package ProblemsArrays;

import java.util.Arrays;

public class Task10 {
    static int max;
    static int min;

    public static void max_min(int smallArray[]) {
        max = smallArray[0];
        min = smallArray[0];
        int len = smallArray.length;
        for (int i = 1; i < len -1; i = i + 2) {
            if (i + 1 > len) {
                if (smallArray[i] > max) max = smallArray[i];
                if (smallArray[i] < min) min = smallArray[i];
            }
            if (smallArray[i] > smallArray[i +1]) {
                if (smallArray[i] > max) max = smallArray[i];
                if (smallArray[i + 1] < min) min = smallArray[i + 1];
            }
            if (smallArray[i] < smallArray[i +1]) {
                if (smallArray[i] < min) min = smallArray[i];
                if (smallArray[i + 1] > max) max = smallArray[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        int [] smallArray = {27, 2, 67, 109, 34};
            max_min(smallArray);
        System.out.println(" Original Array: "+ Arrays.toString(smallArray));
        System.out.println(" Maximum value for the above array = " + max);
        System.out.println(" Minimum value for the above array = " + min);
    }
}
