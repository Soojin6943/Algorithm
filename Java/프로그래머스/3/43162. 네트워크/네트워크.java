// 깊이 우선 탐색 
// 재귀

class Solution {
    private static boolean[] visited;
    private static int cnt;
    
    public int solution(int n, int[][] computers) {
        // 컴퓨터 하니씩 방문 여부 탐색
        // 처음 가는 컴퓨터면 카운팅
        
        visited = new boolean[n];
        
        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                cnt++;
                dfs(i, n, computers);
            }
        }
        
        return cnt;
    }
    
    private static void dfs(int now, int n, int[][] computers) {
        for (int i=0; i<n; i++) {
            if (computers[now][i] == 1 && !visited[i]) {
                visited[i] = true;
                dfs(i, n, computers);
            }
        }
        return;
    }
}