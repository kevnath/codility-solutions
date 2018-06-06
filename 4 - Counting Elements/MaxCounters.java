
class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int max = 0;
        int lastMax = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] - 1 == N) {
                lastMax = max;
            }
            else {
                counters[A[i] - 1] = Math.max(counters[A[i] - 1], lastMax);
                counters[A[i] - 1]++;
                max = Math.max(counters[A[i] - 1], max);
            }
        }
        for(int i = 0; i < N; i++) {
            counters[i] = Math.max(counters[i], lastMax);
        }
        return counters;
    }
}