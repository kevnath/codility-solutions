import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        for(int i = 0; i < A.length - 2; i++) {
            long pq = (long)A[i] + (long)A[i + 1];
            long r = (long)A[i + 2];
            if(pq > r) {
                return 1;
            }
        }
        return 0;
    }
}