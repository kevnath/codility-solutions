import java.util.*;

class Solution {
    public int solution(String S) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : S.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            }
            else if(c == ')') {
                if(stack.size() == 0) {
                    return 0;
                }
                char p = stack.pop();
                if(p != '(')
                    return 0;
            }
        }
        if(stack.size() > 0)
            return 0;
        return 1;
    }
}