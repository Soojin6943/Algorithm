import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if (stack.isEmpty() && c == ')') return false;
            
            if (c == '(') stack.push("(");
            
            if (c == ')') stack.pop(); 
        }
        
        if (stack.isEmpty()) return true;
        return false;
        
    }
}