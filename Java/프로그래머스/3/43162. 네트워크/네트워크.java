// 깊이 우선 탐색
// 완전 탐색


class Solution {
    public static void dfs(int now, int[][] computers, boolean[] visited) {
        if (visited[now]) return;
        visited[now] = true;
        
        for (int i=0; i<computers.length; i++) {
            if (computers[now][i] == 1 && !visited[i]) {
                dfs(i, computers, visited);
            }
        }
    }
    public int solution(int n, int[][] computers) {
        int cnt = 0;
        boolean[] visited = new boolean[n];
        
        for (int i=0; i<n; i++) {
            
            if (!visited[i]) {
                cnt ++;
                
                dfs(i, computers, visited);
            }
        }
        
        return cnt;
    }
}