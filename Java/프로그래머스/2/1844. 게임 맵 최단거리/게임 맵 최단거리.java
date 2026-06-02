/**
필요 
- 큐 (x, y, depth)
- 초기 넣기
- 방문확인
- 
*/
import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        visited[0][0] = true;
        
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        while(!queue.isEmpty()) {
            int[] next = queue.poll();
            
            for (int i=0; i<4; i++) {
                int nx = next[0] + dx[i];
                int ny = next[1] + dy[i];
                
                if (nx < 0 || nx >= maps.length
                   || ny < 0 || ny >= maps[0].length
                   || visited[nx][ny] == true
                   || maps[nx][ny] == 0) {
                    continue;
                }
                
                queue.add(new int[]{nx, ny, next[2] + 1});
                visited[nx][ny] = true;
                
                if (nx == maps.length - 1 && ny == maps[0].length -1) {
                    return next[2] + 1;
                }
            }
        }
        
        return -1;
    }
    
}