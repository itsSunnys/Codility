import java.util.*;
// https://app.codility.com/demo/results/trainingWJ7B6J-ZPN/
class Solution {
    public int solution(int N) {
        String binary_N = Integer.toBinaryString(N);
        char[] binary_array_N = binary_N.toCharArray();
        int max_count = 0;
        int current_count = 0;
        // always starts with one 
        // System.out.println("binary_N" + binary_N);
        for (int i = 1; i < binary_N.length(); i++){
            // System.out.println("max_count" + max_count);
            // System.out.println("current_count" + current_count);
            if (binary_array_N[i] == '1'){
                if (current_count > max_count) {
                    max_count = current_count;
                }
                current_count = 0;
            }
            else if (binary_array_N[i] == '0'){
                current_count = current_count + 1;
            }
        }
        return max_count;
    }
}