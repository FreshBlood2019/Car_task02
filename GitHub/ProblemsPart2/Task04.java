package ProblemsArrays;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        double[] elements = new double[] {1.2, 3.4, 5.6, 7.2};
        double sum = Arrays.stream(elements).sum();
        System.out.println(sum/elements.length);
    }
}
