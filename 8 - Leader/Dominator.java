import java.util.*;

class Solution {
    public int solution(int[] A) {
        if(A.length == 0)
            return -1;
            
        Map<Integer, List<Integer> > map = new HashMap<Integer, List<Integer> >();
        for(int i = 0; i < A.length; i++) {
            if(!map.containsKey(A[i])) {
                List<Integer> indexes = new ArrayList<Integer>();
                indexes.add(i);
                map.put(A[i], indexes);
            }
            else {
                List<Integer> indexes = map.get(A[i]);
                indexes.add(i);
                map.put(A[i], indexes);
            }
        }
        
        int max = Integer.MIN_VALUE;
        int keyMax = -1;
        for(Integer i : map.keySet()) {
            int indexSize = map.get(i).size();
            if(indexSize > (A.length / 2) && max < indexSize) {
                max = indexSize;
                keyMax = i;
            }
        }
        if(keyMax == -1)
            return -1;
        return map.get(keyMax).get(0);
    }
}