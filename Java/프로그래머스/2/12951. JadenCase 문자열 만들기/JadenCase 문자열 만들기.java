import java.util.*;

class Solution {
    public String solution(String s) {        
        s = s.toLowerCase();
        String[] str = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        
        for (String word : str) {
            if (word.length() > 0 && !Character.isDigit(word.charAt(0))) {
                char Upper = Character.toUpperCase(word.charAt(0));
                sb.append(Upper).append(word.substring(1));
            } else sb.append(word);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString();
    }
}