import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()){
            if (ch == '('){
                st.push('(');
            } else if (ch == ')' && !st.isEmpty()){
                st.pop();
            } else return false;
            
        }
        
        if (st.isEmpty()) return true;
        else return false;
    }
}