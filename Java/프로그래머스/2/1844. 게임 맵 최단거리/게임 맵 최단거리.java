import java.util.*;

class Solution {
    // 검은색 0 = 이동 불가, 흰색 1 = 이동 가능
    // 동, 서, 남, 북 이동 가능
    // 맵 내 이동, 벗어나기 불가능
    // 상대 진영까지 최소 거리 구하기 <- 너비 우선 탐색
    // 도착 할 수 없을 때는 -1
    
    boolean[][] visited;
    int[] dn = {0, 0, 1, -1};
    int[] dm = {1, -1, 0, 0};
    
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        
        visited = new boolean[n][m];
        
        answer = bfs(maps, 0, 0, n, m);
        return answer;
    }
    
    private int bfs(int[][] maps, int sn, int sm, int n, int m) {
        Deque<int[]> que = new ArrayDeque<>();
        
        visited[sn][sm] = true;
        que.add(new int[]{sn, sm, 1});
        
        while(!que.isEmpty()) {
            int[] cur = que.poll();
            // 상대 진영인지 확인
            if (cur[0] == n-1 && cur[1] == m-1) {
                return cur[2];
            }
            for (int i=0; i<4; i++) {

                // 다음 이동 칸
                int nn = cur[0] + dn[i];
                int nm = cur[1] + dm[i];

                if (nn < 0 || nm < 0 || nn >= n || nm >= m) continue;

                if (!visited[nn][nm] && maps[nn][nm] == 1) {
                    visited[nn][nm] = true;
                    que.add(new int[]{nn, nm, cur[2] + 1});
                }
            }
        }
        return -1;
    }
}