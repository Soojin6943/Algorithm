import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        // 단어 자르는 크기는 1 ~ 문자열 절반까지만
        for (int i=1; i<=s.length()/2; i++) {
            int index = i;
            int size = 1;
            
            StringBuilder sb = new StringBuilder();
            String last = s.substring(0, i);
            sb.append(last);
            
            for (int j=i; j < s.length(); j += i) {
                String now = s.substring(j, Math.min(j + i, s.length()));
                if (last.equals(now)) {
                    size ++;
                } else {
                    if (size != 1) {
                        sb.append(size);
                        size = 1;
                    } 
                    sb.append(now);
                    last = now;
                }
            }
            
            if (size > 1) {
                sb.append(size);
            }
            
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}