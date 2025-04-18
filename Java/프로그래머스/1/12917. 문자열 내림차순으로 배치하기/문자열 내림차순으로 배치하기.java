import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";

        String[] ch = s.split("");
        Arrays.sort(ch, Collections.reverseOrder());
        answer = String.join("", ch);
        
        
        // for(int i=0; i<s.length(); i++){
        //     if (Character.isLowerCase(ch[i])){
        //         place = i;
        //         break;
        //     }
        // }
        
        // String result = String.valueOf(ch);
        // answer = result.substring(place, result.length()) + result.substring(0, place);
        return answer;
    }
}