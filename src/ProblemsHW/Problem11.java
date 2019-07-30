package ProblemsHW;

public class Problem11 {
    public static void main (String[] args) {
        int h = 10;
        int f = 19;
        int w = 12;
        if (h > f && h > w) {
            System.out.println("The biggest number is "+h);}
        else if (f > h && f > w) {
            System.out.println("The biggest number is "+f);}
        else {
            System.out.println("The biggest number is "+w);}
    }
}
