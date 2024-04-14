// https://app.codility.com/demo/results/trainingGHJQ32-XGC/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++)
            set.add(A[i]);

        return set.size();
    }
}