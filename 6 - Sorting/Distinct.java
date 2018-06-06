import java.util.*;

class Solution {
    public int solution(int[] A) {
        Set<Integer> mySet = new HashSet<Integer>();
        for(int i = 0; i < A.length; i++) {
            mySet.add(A[i]);
        }
        return mySet.size();
    }
}