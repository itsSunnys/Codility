// https://app.codility.com/demo/results/training7JJGKV-QZG/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            map.put(A[i], true);
        };

        while(count < A.length + 1) {
            count++;
            if (map.containsKey(count)) continue;
            else return count;
        };

        return count + 1;
    }
}