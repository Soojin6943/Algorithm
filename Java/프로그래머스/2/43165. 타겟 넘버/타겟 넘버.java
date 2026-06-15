/**
완전 탐색 = 깊이 우선 탐색
- 스택 or 재귀
- 더하거나 빼거나
*/ 
class Solution {
    static int cnt = 0;
    public static void dfs(int[] numbers, int target, int depth, int now) {
        // 종료 조건 (마지막 결과가 타겟과 같으면 카운트)
        if (numbers.length == depth) {
            if (now == target) {
                cnt++;
                System.out.println(cnt);
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