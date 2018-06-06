
class Solution {
    public int solution(int[] A) {
        int toEast = 0;
        int passingCars = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] == 0) {
                toEast++;
            }
            else {
                passingCars += toEast;
                if(passingCars > 1000000000) {
                    return -1;
                }
            }
        }
        return passingCars;
    }
}