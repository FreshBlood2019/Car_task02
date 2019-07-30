package ProblemsHW;

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        int m, s, v, r = 0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        s = m;
        while (m > 0) {
            v = m % 10;
            r = r * 10 + v;
            m /= 10;
        }
        if (s == r)
            System.out.println("The number is a palindrome");
        else
            System.out.println("The number is not a paindrome");
    }
}
