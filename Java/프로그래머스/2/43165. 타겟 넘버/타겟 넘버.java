/** 
깊이 우선 탐색
- 스택, 재귀

*/
class Solution {
    
    static int cnt = 0;
    
    static void dfs(int now, int idx, int[] numbers, int target) {
        if (idx == numbers.length) {
            if (now == target) {
                cnt ++;
            }
            return;
        }
        dfs(now + numbers[idx], idx + 1, numbers, target);
        dfs(now - numbers[idx], idx + 1, numbers, target);
        
    }
    
    public int solution(int[] numbers, int target) {
        
        dfs(0, 0, numbers, target);
        
        return cnt;
    }
}