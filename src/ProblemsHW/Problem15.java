package ProblemsHW;

public class Problem15 {
    public static void main (String[] args) {
        int x;

        for(x=0; x<=100; x++)
            System.out.print(x + " ");
        System.out.println();
    }
}
class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            System.out.print(i);
            i++;
        }
    }
}
class DoWhile {
    public static void main(String[] args) {
        int n = 0;

        do {
            System.out.println(n);
        } while (++n <= 100);
    }
}
