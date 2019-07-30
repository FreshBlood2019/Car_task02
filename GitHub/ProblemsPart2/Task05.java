package ProblemsArrays;

public class Task05 {
    public static boolean contains(int[] massive, int item) {
        for (int n : massive){
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] specificValue = {23, 54, 12, 98};
        System.out.println(contains(specificValue, 23));
        System.out.println(contains(specificValue, 17));
    }
}
