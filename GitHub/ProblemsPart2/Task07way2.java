package ProblemsArrays;

import java.util.Arrays;

public class Task07way2 {
    public static void main(String[] args) {
        int[] damnArray = {2, 6, 5, 8};
        damnArray = Arrays.copyOf(damnArray, 3);
        System.out.println(Arrays.toString(damnArray));
    }
}
