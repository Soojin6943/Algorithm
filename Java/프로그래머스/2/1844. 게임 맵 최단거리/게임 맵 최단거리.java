/**
너비 우선 탐색 

도착할 수 없을 때 -1
지나가는 칸 최솟값 구하기
1은 벽이 없는 자리
*/

import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        // 기본 세팅
        Queue<int[]> que = new LinkedList<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        
        // 시작점 세팅
        que.add(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        // 갈 수 있는 방향 좌표
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, 1, -1};
        
        // 너비 우선 탐색
        while(!que.isEmpty()) {
            int[] cur = que.poll();
            
            for (int i=0; i<4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                // 목적지
                if (nx == maps.length -1 && ny == maps[0].length -1) return cur[2] + 1;
                
                // 불가능
                if (nx < 0 || nx >= maps.length
                   || ny < 0 || ny >= maps[0].length
                   || visited[nx][ny] == true
                   || maps[nx][ny] == 0) {
                    continue;
                }
                
                que.add(new int[]{nx, ny, cur[2] + 1});
                visited[nx][ny] = true;
            }
        }
        return -1;
    }
}