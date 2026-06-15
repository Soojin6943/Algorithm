/**
너비 우선 탐색
큐 - 지금 숫자, 인덱스
*/

import java.util.*;

class Solution {
    
    public int solution(int[] numbers, int target) {
        Deque<int[]> que = new ArrayDeque<>();     // 현재 값, 인덱스
        
        que.add(new int[]{0, 0});   // 초기 시작 세팅
        int cnt = 0;
        
        while(!que.isEmpty()) {
            int[] cur = que.pollFirst();
            int now = cur[0];
            int idx = cur[1];
            
            if (idx == numbers.length) {
                if (target == now) {
                    cnt ++;
                    continue;
                }
                continue;
            }
            
            que.add(new int[]{now + numbers[idx], idx + 1});
            que.add(new int[]{now - numbers[idx], idx + 1});
        }
        
        return cnt;
    }
}