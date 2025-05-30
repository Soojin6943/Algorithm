import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        HashMap<Character, Character> map = new HashMap<>();
        
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        String ss = s + s;
        
        A: for (int i=0; i<s.length(); i++){
            Stack<Character> stack = new Stack<>();

            for (int j=0; j<s.length(); j++){
                char c = ss.charAt(i + j);
                if (!map.containsKey(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || !stack.pop().equals(map.get(c))) continue A;
                }
            }
            
            if (stack.isEmpty())
                answer ++;
        }
        return answer;
    }
}