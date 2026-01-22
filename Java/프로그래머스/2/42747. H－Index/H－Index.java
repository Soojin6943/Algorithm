import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        // 0 1 3 5 6
        
        for (int i=citations.length-1; i>=0; i--) {
            int h = Math.min(citations[i], citations.length - i);
            answer = Math.max(answer, h);
        }
        return answer;
    }
}