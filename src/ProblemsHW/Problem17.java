package ProblemsHW;

public class Problem17 {
    public static void main(String[] args) {
        double[] ints = new double[]{23, 24, 25, 26, 27, 30};
        for (int i = 0; i < ints.length; i++) {
            int max = Integer.MAX_VALUE;
            {
                ints[i] = i / max;
                System.out.println(ints[i]);
            }
        }
    }
}
