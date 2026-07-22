// 깊이 우선 탐색
// 스택, 재귀?

class Solution {
    static boolean[] visited;
    
    public static void dfs(int k, int n, int[][] computers) {
        if (visited[k]) return;
        visited[k] = true;
        
        for (int i=0; i<n; i++) {
            if (computers[k][i] == 1 && !visited[i]) {
                dfs(i, n, computers);
            }
        }
        
    }
    
    public int solution(int n, int[][] computers) {
        // 각 노드들 방문 여부
        int net = 0;
        visited = new boolean[n];
        
        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                net ++;
                dfs(i, n, computers);
            }
        }
        
        return net;
    }
}