class Solution {
    
    public static void dfs(int now, int n, int[][] computers, boolean[] visited) {
        visited[now] = true;
        
        for (int i=0; i<n; i++) {
            if (computers[now][i] == 1 && !visited[i]) {
                dfs(i, n, computers, visited);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
    
        boolean[] visited = new boolean[n];
        int network = 0;
        
        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                dfs(i, n, computers, visited);
                network ++;
            }
        }
        
        return network;
    }
}