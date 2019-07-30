package ProblemsArrays;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] numericArray = {3, 7, 2, 9, 28};
        String[] stringArray = {"Apples, ","pineapples.","carrots, ", "bananas, "};
        Arrays.sort(numericArray);
        Arrays.sort(stringArray);
        System.out.println("A sorted numeric array: "+Arrays.toString(numericArray));
        System.out.println("A sorted string array: "+Arrays.toString(stringArray));
    }
}
