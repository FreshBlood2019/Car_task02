package ProblemsArrays;

import java.util.Arrays;

public class Task07 {
    public static void main(String[] args) {
    int [] aNiceArray = {52, 46, 28, 18, 69};
        System.out.println("The array before the removal: "+ Arrays.toString(aNiceArray));
            int removeIndex = 1;
            int k;
                for (k = removeIndex; k < aNiceArray.length-1; k++); {
            aNiceArray[k] = aNiceArray[k+1];
        }
        System.out.println("The array after the removal: "+Arrays.toString(aNiceArray));
    }
}
