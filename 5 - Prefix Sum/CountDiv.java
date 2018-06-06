
class Solution {
    public int solution(int A, int B, int K) {
        A = (A % K == 0) ? A : A + K - (A % K);
        B = (B % K == 0) ? B : B - (B % K);
        return ((B - A) / K) + 1;
    }
}