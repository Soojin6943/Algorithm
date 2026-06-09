/**
너비 우선 탐색

1 = 벽 없는 자리
도착 불가 = -1 출력
*/

import java.util.*;

class Solution {
    static int[] dx = new int[]{0, 0, 1, -1};
    static int[] dy = new int[]{1, -1, 0, 0};
    
    public static int bfs(Deque<int[]> que, boolean[][] visited, int[][] maps) {
        while(!que.isEmpty()) {
            int[] cur = que.pollFirst();
            
            for (int i=0; i<4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                
                if (nx == maps.length - 1 && ny == maps[0].length - 1) return cur[2] + 1;
                
                if (nx < 0 || nx >= maps.length 
                   || ny < 0 || ny >= maps[0].length
                   || visited[nx][ny] == true
                   || maps[nx][ny] == 0) continue;
                
                que.offer(new int[]{nx, ny, cur[2] + 1});
                visited[nx][ny] = true;
            }
        }
        return -1;
    }
    
    public int solution(int[][] maps) {
        Deque<int[]> que = new ArrayDeque<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        
        que.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        return bfs(que, visited, maps);
    }
}