class Solution {
    int answer = 0;
    
    public void dfs (int sum, int i, int target, int lastIdx, int[] numbers) {
        if (i == lastIdx) {
            if (sum == target) answer++;
            return;
        }
        
        dfs(sum + numbers[i], i+1, target, lastIdx, numbers);
        dfs(sum - numbers[i], i+1, target, lastIdx, numbers);
    }
    public int solution(int[] numbers, int target) {
        
        dfs(0, 0, target, numbers.length, numbers);
        
        return answer;
    }
}