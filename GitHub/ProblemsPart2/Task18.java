package ProblemsArrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        int[] greenArray = {23, 59, 39, 10, 38};
        System.out.println("The original array is "+ Arrays.toString(greenArray));
            int min = Integer.MAX_VALUE;
            int second_min = Integer.MAX_VALUE;
                for (int i = 0; i < greenArray.length; i++) {
                    if (greenArray[i] == min) {
                        second_min = min;
                    } else if (greenArray[i] < min) {
                        second_min = min;
                        min = greenArray[i];
                    } else if (greenArray[i] < second_min) {
                        second_min = greenArray[i];
                    }
                }
        System.out.println("The second smallest number is "+second_min);
    }
}
