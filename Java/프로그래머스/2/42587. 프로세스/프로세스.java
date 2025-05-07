import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // 높은 숫자 우선순위
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        // 우선 순위 큐 
        for(int p : priorities){
            queue.add(p);
        }
        
        while(!queue.isEmpty()){
            for (int i=0; i<priorities.length; i++){
                if (queue.peek() == priorities[i]){
                    queue.poll();
                    answer += 1;
                    
                    if (i == location){
                    return answer;
                    }
                }
                
            }
        }
        
        return answer;
    }
}