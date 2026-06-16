/**
원래라면 깊이 우선 탐색
하지만 너비 우선 탐색으로 연습
- 큐
- 방문 확인
*/

import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        // 현재 결과, 인덱스
        Deque<int[]> que = new ArrayDeque<>(); 
        
        // 초기 세팅
        que.offer(new int[]{0, 0});
        int cnt = 0;
        
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int now = cur[0];
            int idx = cur[1];
            
            // 종료 조건
            if (numbers.length == idx) {
                if (now == target) {
                    cnt ++;
                }
                continue;
            }
            
            que.add(new int[]{now + numbers[idx], idx + 1});
            que.add(new int[]{now - numbers[idx], idx + 1});
        }
        
        return cnt;
    }
}