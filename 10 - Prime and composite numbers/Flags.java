import java.util.*;

class Solution {
    public int solution(int[] A) {
        ArrayList<Integer> peaks = new ArrayList<Integer>();
        for(int i = 1; i < A.length - 1; i++) {
            if(A[i] > A[i-1] && A[i] > A[i+1]) {
                peaks.add(i);
            }
        }
        if(peaks.size() <= 2)
            return peaks.size();
        int maxFlag = ((int)Math.sqrt(A.length)) + 1;
        int distance = maxFlag;
        for(int i = maxFlag - 2; i > 0; i--, distance--) {
            int leftFlag = peaks.get(0);
            int rightFlag = peaks.get(peaks.size() - 1);
            int notUsedFlag = i;
            
            for(int j = 1; j < peaks.size() - 1; j++) {
                int distLeft = peaks.get(j) - leftFlag;
                int distRight = rightFlag - peaks.get(j);
                if(distLeft >= distance && distRight >= distance) {
                    notUsedFlag--;
                    if(notUsedFlag == 0) return i + 2;
                    leftFlag = peaks.get(j);
                }
                if(distRight <= distance * notUsedFlag)
                    break;
            }
            if(notUsedFlag == 0) return i + 2;
        }
        return 2;
    }
}