import java.util.*;
class Solution {
    // 이동 방향
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};
    
    // 위치 정보를 저장할 클래스
    private static class Point {
        int nx, ny;
        
        public Point(int nx, int ny){
            this.nx = nx;
            this.ny = ny;
        }
    }
    
    private static char[][] map;
    private static int N, M;
    
    public int solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();
        
        // 미로에 대한 정보를 배열로 저장
        map = new char[N][M];
        for (int i=0; i<N; i++){
            map[i] = maps[i].toCharArray();
        }
        
        Point start = null, end = null, lever = null;
        
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                if (map[i][j] == 'S') start = new Point(j, i);
                else if (map[i][j] == 'E') end = new Point(j, i);
                else if (map[i][j] == 'L') lever = new Point(j, i);
            }
        }
        
        // 시작 지점 -> 레버, 레버 -> 출구까지의 최단 거리를 각각 구함
        int startLever = bfs(start, lever);
        int leverEnd = bfs(lever, end);
        
        // 도팍 불가능한 경우는 -1, 도착 가능한 경우는 최단 거리를 반환
        if (startLever == -1 || leverEnd == -1) return -1;
        else return startLever + leverEnd;
        
    }
    
    // start -> end bfs
    private static int bfs(Point start, Point end){
        // 너비 우선 참색 초기 과정
        int[][] dist = new int[N][M];
        ArrayDeque<Point> queue = new ArrayDeque<>();
        dist[start.ny][start.nx] = 1;
        queue.add(start);
        
        while (!queue.isEmpty()){
            Point now = queue.poll();
            
            // 네 방향으로 이동
            for (int i=0; i<4; i++){
                int nextX = now.nx + dx[i];
                int nextY = now.ny + dy[i];
                
                // 범위를 벗어나는 경우 예외 처리
                if (nextX < 0 || nextX >= M || nextY < 0 || nextY >= N)
                    continue;
                
                // 이미 방문한 지점인 경우 탐색하지 않음
                if (dist[nextY][nextX]>0){
                    continue;
                }
                
                // X가 아닌 지점만 이동 가능
                if (map[nextY][nextX]=='X'){
                    continue;
                }
                
                // 거리 1 증가
                dist[nextY][nextX] = dist[now.ny][now.nx] + 1;
                
                // 다음 정점을 큐에 넣음
                queue.add(new Point(nextX, nextY));
                
                // 도착점에 도달하면 최단 거리를 반환
                if (nextX == end.nx && nextY == end.ny)
                    return dist[end.ny][end.nx] - 1;
            }
        }
        return -1;
    }
}