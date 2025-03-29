import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int num = phone_number.length() - 4;
        for(int i=0; i<num; i++){
            answer += "*";
        }
        
        for (int i=0; i<4; i++){
            answer += phone_number.charAt(num+i);
        }
        return answer;
    }
}