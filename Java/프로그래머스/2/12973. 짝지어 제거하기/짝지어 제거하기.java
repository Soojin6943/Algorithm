/**
- 소문자 문자열
- 같은 알파벳이 2개 붙어 있는 짝
- 그 둘을 제거 후 앞뒤 이어 붙이기
- 성공 1, 실패 0
*/

import java.util.*;

class Solution
{
    public int solution(String s)
    {
        // 스택 사용
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            
            if(stack.isEmpty()) {
                stack.push(c);
            } else {
                if (c == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
    
        if (stack.isEmpty()){
            return 1;
        } else {
            return 0;
        }
    }
}