package ProblemsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();

        int[] numbers = new int[n];
        Arrays.fill(numbers, a);

        System.out.println(Arrays.toString(numbers));
    }
}
