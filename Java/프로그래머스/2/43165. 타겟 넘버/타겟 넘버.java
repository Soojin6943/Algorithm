/**
모든 정수들에 대해 +,- 접근
완전 탐색 = 깊이 우선 탐색 = 재귀, 스택
*/

class Solution {
    static int cnt = 0;
    
    static void dfs(int[] numbers, int target, int depth, int now) {
        if (numbers.length == depth) { 
            if (target == now) {
                cnt ++;
            }
            return;
        }
        
        dfs(numbers, target, depth + 1, now + numbers[depth]);
        dfs(numbers, target, depth + 1, now - numbers[depth]);
    }
    
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        
        return cnt;
    }
}