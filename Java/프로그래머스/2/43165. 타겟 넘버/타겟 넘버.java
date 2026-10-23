// 전부 탐색 필요
// + , - 한 번 씩
// DFS -> 스택 or 재귀 -> 재귀 선택
        
// dfs(depth, sum, target, numbers)
// depth 해당 인덱스 sum에 더하거나 빼기
// depth가 마지막인데 sum이랑 타겟이 같으면 카운트
class Solution {
    private static int cnt = 0;
    
    public int solution(int[] numbers, int target) {
        
        dfs(0, 0, target, numbers);
        return cnt;
    }
    
    private static void dfs(int depth, int sum, int target, int[] numbers) {
        // 종료 조건
        if (depth == numbers.length) {
            if (sum == target) cnt++;
            return;
        }
        
        dfs(depth + 1, sum + numbers[depth], target, numbers);
        dfs(depth + 1, sum - numbers[depth], target, numbers);
    }
}