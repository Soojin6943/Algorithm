import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        for (int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)){
                answer.append(Character.toLowerCase(c));
            } else {
                answer.append(Character.toUpperCase(c));
            }
        }
        return answer.toString();
    }
}