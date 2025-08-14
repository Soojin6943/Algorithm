import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        
        char[] ans = answer.toCharArray();
        Arrays.sort(ans);
        return new String(ans);
    }
}