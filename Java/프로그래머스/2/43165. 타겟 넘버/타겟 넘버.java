/**
깊이 우선 탐색 - 모든 넘버 다 써야함
+ / - 경우 탐색

최종 값이 target 이면 카운트
*/
class Solution {
    static int cnt = 0;
    
    public static void dfs(int now, int depth, int target, int[] numbers) {
        
        // 종료 조건
        if(depth == numbers.length) {
            if (now == target) cnt ++;
            return;
        }
        
        dfs(now + numbers[depth], depth + 1, target, numbers);
        dfs(now - numbers[depth], depth + 1, target, numbers);
    }
    
    public int solution(int[] numbers, int target) {
        
        dfs(0, 0, target, numbers);
        
        return cnt;
        
    }
}