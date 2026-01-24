import java.util.*;

class Solution {
    // 깊이 우선 탐색 
    // 연결된 노드 전부 방문 처리 -> 새로운 노드 발견시 네트워크 +1
    boolean[] visited;
    List<List<Integer>> graph;
    
    private void dfs(int n) {
        visited[n] = true;
        
        for (int i : graph.get(n)) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[n];
        graph = new ArrayList<>();
        
        for (int i=0; i<n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (computers[i][j] == 1) {
                    graph.get(i).add(j);
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer ++;
                dfs(i);
            } 
        }
        
        return answer;
    }
}