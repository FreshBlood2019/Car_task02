package ProblemsArrays;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 5, 7, 12, 56};
        int sum = Arrays.stream(numbers).sum();
            System.out.println(sum);
    }
}
