// https://app.codility.com/demo/results/trainingJBYJW5-VH7/
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        if (A.length == 0) return 0;
        int[] prefix_array = new int[A.length];
        int min_position = 1;
        int offset = 0;
        prefix_array[0] = A[0];
        prefix_array[1] = (A[1] + A[0])/2;
        if (A.length == 2) return prefix_array[1];
       
        for (int i = 2; i < A.length; i++) {
            // System.out.println("this is a debug message" + Arrays.toString(prefix_array));
            // System.out.println("prefix_array" + min_position);

            int slice_two = (A[i] + prefix_array[i-1])/2;
            int slice_three = (A[i] + prefix_array[i-1] + prefix_array[i-2])/3;
            prefix_array[i] = Math.min(slice_three, slice_two);
            if (slice_two < slice_three) {
                offset = 1;
            }
            else {
                offset = 2;
            }
            if (prefix_array[i] < prefix_array[i-1] && prefix_array[i] != A[min_position])         min_position = i - offset;
        }
        return min_position; 
        }
    }