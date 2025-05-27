import java.util.HashMap;
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        HashMap<Integer, Double> fails = new HashMap<>();
        
        int[] challenge = new int[N+2]; 
        
        // stage 별 유저 수 (challenge[1]의 값 = 1의 머물고 있는 유저 수)
        for (int i=0; i<stages.length; i++){
            int st = stages[i];
            challenge[st] += 1;
        }
        // [0, 1, 3, 2, 1, 0, 1] 5단계까지
        
        
        // 실패율 계산 
        // 전체 도전자
        double p = stages.length;   // 반드시 더블이어야 함. 인트 선언시 0, 1 둘 중 하나 나옴
        for (int i=1; i<=N; i++){
            if(challenge[i] == 0) {
                fails.put(i, 0.);
            } else {
                double fail = challenge[i] / p;
                fails.put(i, fail);
                p -= challenge[i];
            }
            
        }
        
        // 정렬(실패율(값) 내림차순 -> 키 출력)
        return fails.entrySet().stream().sorted((o1, o2) -> 
        o1.getValue().equals(o2.getValue()) ? Integer.compare(o1.getKey(), o2.getKey()) : Double.compare(o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();


    }
}