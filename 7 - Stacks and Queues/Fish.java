import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        Stack<Integer> down = new Stack<Integer>();
        int fish = 0;
        
        for(int i = 0; i < A.length; i++) {
            if(B[i] == 1) {
                down.push(A[i]);
            }
            else {
                while(!down.isEmpty() && down.peek() < A[i]) {
                    down.pop();
                }
                if(down.isEmpty()) {
                    fish++;
                }
            }
        }
        return fish + down.size();
    }
}