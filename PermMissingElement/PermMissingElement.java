class Solution {
    public int solution(int[] A) {
        long n = A.length + 1;
        long sum = (n + 1) * n / 2; // main idea/summation formula
        long missing_number = sum; // initial setting (sum)
        
        // important to note only ONE element is missing
        for (int i = 0; i < A.length; i++){
            // minus other elements
            missing_number = missing_number - A[i]; 
        }
        return (int)missing_number;
    }
}
