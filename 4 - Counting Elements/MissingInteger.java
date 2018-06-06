import java.util.*;

class Solution {
    public int solution(int[] A) {
        Set<Integer> numSet = new HashSet<Integer>();
        for(int i = 0; i < A.length; i++) {
            if(A[i] > 0) {
                numSet.add(A[i]);
            }
        }
        List<Integer> myList = new ArrayList<Integer>(numSet);
        Collections.sort(myList);
        int min = 1000001;
        for(int i = 0; i < myList.size(); i++) {
            if(myList.get(i) != i + 1) {
                return i + 1;
            }
        }
        return myList.size() + 1;
    }
}