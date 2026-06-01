import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0, 0, 1});
        
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        visited[0][0] = true;
        
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};
        
        while(!que.isEmpty()) {
            int[] cur = que.poll();
            
            for (int i=0; i<4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                
                if (nx < 0 || nx >= maps.length ||
                   ny < 0 || ny >= maps[0].length
                   || visited[nx][ny] == true
                   || maps[nx][ny] == 0) {
                    continue;
                }
                
                if (nx == maps.length -1 && ny == maps[0].length -1) {
                    return cur[2] + 1;
                }
                
                que.add(new int[]{nx, ny, cur[2] + 1});
                visited[nx][ny] = true;
            }
        }
        
        return -1;
    }
}