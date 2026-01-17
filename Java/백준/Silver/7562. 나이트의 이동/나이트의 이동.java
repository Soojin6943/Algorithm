import java.util.*;

class Main{
    static int[][] chess;
    static boolean[][] visited;
    static int[] dx = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = new int[]{-2, -1, 1, 2, -2, -1, 1, 2};
    
    public static void bfs(int startX, int startY, int targetX, int targetY) {
        visited[startX][startY] = true;
        Deque<int[]> que = new ArrayDeque<>();
        int depth = 0;
        
        que.add(new int[]{startX, startY, depth});
        
        while(!que.isEmpty()) {
            int[] cur = que.pollFirst();
            if (cur[0] == targetX && cur[1] == targetY){
                System.out.println(cur[2]);
                return;
            }
            
            for (int i=0; i<8; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx >= 0 && ny >= 0 && nx < chess.length && ny < chess.length && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    que.add(new int[]{nx, ny, cur[2] + 1});
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        // 테스트 케이스만큼 수행
        while (T-- > 0) {
            int I = sc.nextInt();
            int startX = sc.nextInt();
            int startY = sc.nextInt();
            int targetX = sc.nextInt();
            int targetY = sc.nextInt();
            
            chess = new int[I][I];
            visited = new boolean[I][I];
            
            bfs(startX, startY, targetX, targetY);
            
        }
    }
}