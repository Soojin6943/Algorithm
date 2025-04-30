import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 카운트를 위함 정렬
        Arrays.sort(d);
        int i = 0;
        
        for (int m : d){
            if (budget < m){
                break;
            }
            budget -= m;
            answer += 1;
        }
        
        return answer;
    }
}