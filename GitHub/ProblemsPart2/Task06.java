package ProblemsArrays;

public class Task06 {
   public static int findTheIndex (int[] array_1, int t) {
       if (array_1 == null) return -1;
       int ln = array_1.length;
       int i = 0;
       while (i < ln) {
           if (array_1[i] == t) return i;
           else i = i + 1;
       }
       return -1;
   }

    public static void main(String[] args) {
        int[] array_1 = {12, 14, 13, 56, 88};
        System.out.println(findTheIndex(array_1, 12));
        System.out.println(findTheIndex(array_1, 56));
    }

}
