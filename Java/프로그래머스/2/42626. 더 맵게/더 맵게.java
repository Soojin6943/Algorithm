import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int s : scoville) {
            pq.offer(s);
        }
        
        while(true) {
            if (pq.size() <= 1) break;
            
            int f = pq.poll();
            int s = pq.poll();
            
            if (f >= K) break;
            
            int newS = f + (s * 2);
            pq.offer(newS);
            answer++;
        }
        
        return answer;
    }
}