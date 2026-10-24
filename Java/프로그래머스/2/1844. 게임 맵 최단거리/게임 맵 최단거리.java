import java.util.*;

class Solution {
    
    public int solution(int[][] maps) {
        int answer = -1;
        // 방문 여부
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        Deque<int[]> que = new ArrayDeque<>();
        
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        
        // 큐에 첫번째 넣기 (x, y, depth)
        que.addLast(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        // 큐가 빌때까지 반복
        // 사방으로 가기, 방문 했으면 넘어가고, 갈 수 있는지 확인하기
        while (!que.isEmpty()) {
            int[] now = que.pollFirst();
            for (int i=0; i<4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                
                if (nx == maps.length -1 && ny == maps[0].length -1 && maps[nx][ny] == 1) {
                    return now[2] + 1;
                }
                
                if (nx >= 0 && nx < maps.length
                    && ny >= 0 && ny < maps[0].length
                    && !visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    que.addLast(new int[]{nx, ny, now[2] + 1});
                }
            }
        }
        
        return answer;
    }
    
}