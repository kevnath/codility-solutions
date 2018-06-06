import java.util.*;

class Solution {
    public int solution(String S) {
        Stack<Character> bracketStack = new Stack<Character>();
        for(char c : S.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                bracketStack.push(c);
            }
            else if(c == ')' || c == ']' || c == '}') {
                if(bracketStack.size() == 0)
                    return 0;
                char p = bracketStack.pop();
                if((c == ')' && p != '(') || (c == ']' && p != '[') || (c == '}' && p != '{'))
                    return 0;
            }
        }
        if(bracketStack.size() > 0)
            return 0;
        return 1;
    }
}