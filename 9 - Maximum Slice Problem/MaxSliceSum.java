
class Solution {
    public int solution(int[] A) {
        int globalMax = A[0];
        int currMax = A[0];
        
        for(int i = 1; i < A.length; i++) {
            currMax += A[i];
            if(currMax < A[i]) {
                currMax = A[i];
            }
            if(globalMax < currMax) {
                globalMax = currMax;
            }
        }
        
        return globalMax;
    }
}