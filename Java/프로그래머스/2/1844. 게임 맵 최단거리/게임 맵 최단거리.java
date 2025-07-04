import java.util.ArrayDeque;

class Solution {
    
    // 이동할 수 있는 방향을 나타내는 배열들
    private static final int[] rx = {0, 0, 1, -1};
    private static final int[] ry = {1, -1, 0, 0};
    
    private static class Node {
        int r, c;
        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    
    public int solution(int[][] maps) {
        // 맵의 크기를 저장하는 변수
        int N = maps.length;
        int M = maps[0].length;
        
        // 최단거리 저장할 배열
        int[][] dist = new int[N][M];
        
        // bfs 탐색을 위한 큐
        ArrayDeque<Node> queue = new ArrayDeque<>();
        
        // 시작 정점에 대해서 큐에 추가, 최단 거리 저장
        queue.addLast(new Node(0,0));
        dist[0][0] = 1;
        
        // 큐가 빌때까지 반복
        while (!queue.isEmpty()){
            Node now = queue.pollFirst();
            
            // 현재 위치에서 이동할 수 있는 모든 방향
            for (int i=0; i<4; i++){
                int nr = now.r + rx[i];
                int nc = now.c + ry[i];
                
                // 맵 밖으로 나가는 경우 예외 처리
                if (nr < 0 || nc < 0 || nr >= N || nc >= M){
                    continue;
                }
                
                // 벽인 경우 예외 처리
                if (maps[nr][nc]==0)
                    continue;
                
                // 이동한 위치가 처음 방문하는 경우, queue에 추가하고 거리 갱신
                if(dist[nr][nc]==0) {
                    queue.addLast(new Node(nr, nc));
                    dist[nr][nc] = dist[now.r][now.c] + 1;
                }
            }
        }
        
        // 최단 거리 반환, 도달 못하면 -1
        return dist[N-1][M-1] == 0 ? -1 : dist[N-1][M-1];
    }
}