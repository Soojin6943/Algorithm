import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Deque<Integer> que = new ArrayDeque<>();
        
        for (int i=0; i<progresses.length; i++) {
            int day = ((100 - progresses[i] - 1) / speeds[i]);
            que.addLast(day);
        }
        
        List<Integer> cnts = new ArrayList<>();
        
        int tmp = que.pollFirst();
        int cnt = 1;
        while(!que.isEmpty()) {
            int now = que.pollFirst();
            if (tmp >= now) {
                cnt++;
                continue;
            }
            cnts.add(cnt);
            cnt = 1;
            tmp = now;
        }
          
        cnts.add(cnt);
        
        return cnts.stream().mapToInt(Integer::intValue).toArray();
    }
}