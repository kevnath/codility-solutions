// import java.util.*;

class Solution {
    public int solution(int[] A) {
        if(A.length <= 1)
            return 0;
		//Kadane Algorithm
        int globalMax = 0;
        int currMax = 0;
        int minPrice = A[0];
        for(int i = 1; i < A.length; i++) {
            currMax = A[i] - minPrice;
            if(currMax < 0)
                currMax = 0;
            if(A[i] < minPrice)
                minPrice = A[i];
            if(globalMax < currMax)
                globalMax = currMax;
        }
        return globalMax;
    }
}