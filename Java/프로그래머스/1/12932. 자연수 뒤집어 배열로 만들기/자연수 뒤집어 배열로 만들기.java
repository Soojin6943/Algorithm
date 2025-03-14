import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        
        // 1.자연수를 문자열로
        String s = n + "";
        // 2. 문자열 쪼개기
        String[] ss = s.split("");
        
        // System.out.println(ss[0]);  // 스플릿 확인
        int[] answer = new int[ss.length];
        
        for (int i=0; i<ss.length; i++){
            
            answer[i] = Integer.parseInt(ss[ss.length-i-1]);
        }
        
        return answer;
    }
}