class Solution {
    public int solution(int N) {
        int counter = 0;
        int max = 0;
        boolean hasFoundOne = false;
        
        while(N > 0) {
            if(N % 2 == 0) {
                counter++;
            }
            else {
                if(hasFoundOne && max < counter) {
                    max = counter;
                }
                hasFoundOne = true;
                counter = 0;
            }
            N /= 2;
        }
        
        return max;
    }
}