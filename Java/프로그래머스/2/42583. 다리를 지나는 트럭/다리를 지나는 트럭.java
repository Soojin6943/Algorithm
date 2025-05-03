import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        // 현재 다리 상황 큐
        Queue<Integer> bridge = new LinkedList<>();
        
        // 시작 세팅 : 다리 위 길이만큼 차 없음 (0으로 넣어줌)
        for(int i=0; i<bridge_length; i++){
            bridge.add(0);
        }
        
        int time = 0; 
        int sum = 0;
        int i=0;
        
        while (!bridge.isEmpty()){  
            // 대기 트럭만큼 반복
            // 한번 할 때 마다 초 카운트
            time += 1;
            sum -= bridge.poll();
            
            if (i < truck_weights.length){
                if(weight >= sum+truck_weights[i]) {  // 용량 초과 X + 길이 초과 X
                    sum += truck_weights[i];
                    bridge.add(truck_weights[i]);
                    i ++;
                } else {
                    bridge.add(0); // 못 올라가면 0
                }
            }
        }
        
        return time;
    }
}