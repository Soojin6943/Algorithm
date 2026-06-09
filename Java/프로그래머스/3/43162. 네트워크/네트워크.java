/**
깊이 우선 탐색

- 연결된 노드 확인
- 방문 확인

스택, 재귀
*/
class Solution {
    
    
    public static void dfs(int now, boolean[] visited, int[][] computers) {
        visited[now] = true;
        
        for (int i=0; i<computers.length; i++) {
            if (computers[now][i] == 1 && !visited[i]) {
                dfs(i, visited, computers);
            }
        }
            
    }
    
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int cnt = 0;
        
        for (int i=0; i<n; i++) {
            if (visited[i] == false) {
                cnt++;
                dfs(i, visited, computers); 
            }
        }
        
        return cnt;
    }
}