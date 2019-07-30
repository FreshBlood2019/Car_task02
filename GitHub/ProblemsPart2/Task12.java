package ProblemsArrays;

public class Task12 {
    public static void main(String[] args) {
        int[] similar_array = {1, 2, 5, 5, 6, 6, 7, 2};
            for (int i = 0; i < similar_array.length - 1; i++) {
                for (int j = i + 1; j < similar_array.length; j++) {
                    if ((similar_array[i] == similar_array[j]) && (i != j)) {
                        System.out.println("Duplicate Element : " + similar_array[j]);
                }
            }
        }
    }
}