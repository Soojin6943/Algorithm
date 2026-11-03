import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Deque<Integer> que = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        
        
        // day 계산
        for (int i=0; i<progresses.length; i++) {
            // 이게 + 1만 해줘도 되는가?
            int day = (100 - progresses[i] - 1) / speeds[i] + 1;
            
            que.addLast(day);
        }
        
        int max = que.pollFirst();
        int cnt = 1;
        
        while (!que.isEmpty()) {
            int now = que.pollFirst();
            
            if (now > max) {
                max = now;
                result.add(cnt);
                cnt = 1;
                continue;
            }
            
            cnt ++;
        }
        
        result.add(cnt);
        
        return result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}