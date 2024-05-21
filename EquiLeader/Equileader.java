// https://app.codility.com/demo/results/trainingJGFUEF-5K8/
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int leader_count = 0;
        for (int i = 0; i < A.length; i++) {
            int[] first_half = Arrays.copyOfRange(A, 0, i + 1);
            int[] second_half = Arrays.copyOfRange(A, i + 1, A.length);
            // System.out.println("first_half" + Arrays.toString(first_half));
            // System.out.println("second_half" + Arrays.toString(second_half));
            if (find_leader(first_half) == find_leader(second_half)) {
                leader_count++;
            }
        }
        return leader_count;
    }

    public int find_leader(int[] A){
        Stack<Integer> stac = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (stac.isEmpty())
                stac.push(A[i]);
            else if (stac.peek() == A[i])
                stac.push(A[i]);
            else 
                stac.pop();
            // System.out.println("this is a debug message" + stac.toString());
        }
        if (!stac.isEmpty()) {
            return stac.peek();
        } else {
            return -1;
        }
    }
}
