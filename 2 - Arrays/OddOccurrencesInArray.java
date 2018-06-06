import java.util.*;

class Solution {
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < A.length; i++) {
            if(!map.containsKey(A[i])) {
                map.put(A[i], 1);
            }
            else {
                map.put(A[i], map.get(A[i]) + 1);
            }
        }
        int answer = -1;
        for(Integer key : map.keySet()) {
            if(map.get(key) % 2 != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}