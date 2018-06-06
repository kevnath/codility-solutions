class Solution {
    public int[] solution(int[] A, int K) {
        if(A.length == 0) return new int[0];
        if(K % A.length == 0) return A;
        
        int[] newArray = new int[A.length];
        int firstIdxAfterRotate = A.length - (K % A.length);
        int idx = 0;
        for(int j = firstIdxAfterRotate; j < A.length; j++) {
            newArray[idx] = A[j];
            idx++;
        }
        for(int k = 0; k < firstIdxAfterRotate; k++) {
            newArray[idx] = A[k];
            idx++;
        }
        return newArray;
    }
}