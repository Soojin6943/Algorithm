import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // 우선 순위 큐에 스코빌 지수 담기
        for (int i : scoville){
            pq.offer(i);
        }
        
        // 
        while (pq.peek() < K && pq.size() >= 2){
            int first = pq.poll();
            int second = pq.poll();
            int newS = first + second*2;
            pq.offer(newS);
            answer ++;
        }
        
        if (pq.peek() < K){
            answer = -1;
        }
    
        return answer;
    }
}