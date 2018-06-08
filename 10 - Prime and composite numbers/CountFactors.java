import java.util.*;

class Solution {
    public int solution(int N) {
        int div = 1;
        int count = 0;
        while( ((long)div * (long)div) < (long)N) {
            if(N % div == 0) {
                count += 2;
            }
            div++;
        }
        if(((long)div * (long)div) == (long)N) count++;
        return count;
    }
}