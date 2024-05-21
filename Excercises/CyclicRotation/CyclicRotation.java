import java.util.*;

// https://app.codility.com/demo/results/trainingTMNJGM-DKT/
// full rotation means modulo by length
class Solution {
    public int[] solution(int[] A, int K) {
        int length = A.length;
        if (length == 0)
            return null;
        int[] B = Arrays.copyOf(A, length);
        int rotation = K % length;
        for (int o = 0; o < rotation; o++) {
            for (int i = 0; i < length; i++) {
                int index = (i + 1) % (length);
                // System.out.println("index: " + index + "i: " + A[i]) ;
                B[index] = A[i];
                // System.out.println("B: " + Arrays.toString(B));
                // System.out.println("A: " + Arrays.toString(A));
            }
            A = Arrays.copyOf(B, length);
        }
        return A;
    }
}