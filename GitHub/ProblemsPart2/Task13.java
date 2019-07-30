package ProblemsArrays;

public class Task13 {
    public static void main(String[] args) {
        String[] word_array = {"cat", "dog", "rat", "cat", "pet", "dog"};
            for (int i = 0; i <word_array.length-1; i++) {
                for (int j = i + 1; j < word_array.length; j++) {
                    if ((word_array[i].equals(word_array[j])) && (i != j)) {
                        System.out.println("Duplicate value of an array is "+word_array[j]);
                    }
                }
            }
    }
}
