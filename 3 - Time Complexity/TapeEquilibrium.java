
class Solution {
    public int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        for(int i = 0; i < A.length - 1; i++) {
            left += A[i];
            int right = sum - left;
            int res = Math.abs(right - left);
            if(res < min) {
                min = res;
            }
        }
        return min;
    }
}