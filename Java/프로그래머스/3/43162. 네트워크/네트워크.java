import java.util.*;

class Solution {
    
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];        
        Queue<Integer> que = new LinkedList<>();
        
        // 네트워크 갯수
        int cnt = 0;
        
        // 모든 컴퓨터에서 시작
        for (int i=0; i<n; i++) { 
            if (visited[i]) continue;
            
            if (!visited[i]) {
                visited[i] = true;
                cnt ++;
            }
            
            que.add(i);
            
            while (!que.isEmpty()) {
                int now = que.poll();
                
                for (int j=0; j<n; j++) {
                    if (computers[now][j] == 1 && !visited[j]) {
                        que.add(j);
                        visited[j] = true;
                    }
                }
            }
        }
        
        return cnt;
    }
}