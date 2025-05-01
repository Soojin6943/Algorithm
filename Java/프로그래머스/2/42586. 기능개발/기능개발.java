import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> day = new LinkedList<>();
        
        // 남은 날짜 체크
        for (int i=0; i<progresses.length; i++) {
            int nam = 100 - progresses[i];
            
            day.offer(nam % speeds[i] == 0 ? nam / speeds[i] : nam / speeds[i] + 1);
        }
        
        // [3,2,1,4,5,3]
        while (!day.isEmpty()){
            int p = day.peek();
            int cnt = 0;
            while (!day.isEmpty() && p >= day.peek()){
                day.poll();
                cnt += 1;
            }
            answer.add(cnt);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}