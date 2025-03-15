import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String nn = n + "";
        String[] ch = nn.split("");
        int[] ci = new int[ch.length];
        
        for(int i=0; i<ch.length; i++){
            ci[i] = Integer.parseInt(ch[i]);
        }
        
        Arrays.sort(ci);
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<ci.length; i++){
            sb.append(ci[ci.length - i-1]);
        }
        
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}