import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int pos1 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int pos2 = A[0] * A[1] * A[A.length -1];
        return pos1 >= pos2 ? pos1 : pos2;
    }
}