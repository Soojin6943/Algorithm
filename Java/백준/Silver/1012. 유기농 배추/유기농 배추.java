import java.util.*;

public class Main{
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = new int[]{0, 0, 1, -1};
    static int[] dy = new int[]{1, -1, 0, 0};
    
    static void dfs(int x, int y, int N, int M) {
        visited[y][x] = true;
        
        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
            if (map[ny][nx] == 1 && !visited[ny][nx]) {
                dfs(nx, ny, N, M);
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스
        
        while (T-- > 0) {
            int M = sc.nextInt(); // 가로 길이
            int N = sc.nextInt(); // 세로 길이
            int K = sc.nextInt(); // 배추 개수
            
            // 배추 밭
            map = new int[N][M]; 
            for (int i=0; i<K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
            
                map[y][x] = 1;
            }
        
            // 방문 여부
            visited = new boolean[N][M];
        
            // 벌레 개수 찾기
            int worm = 0;
            for (int i=0; i<M; i++) {
                for (int j=0; j<N; j++) {
                    if (map[j][i] == 1 && !visited[j][i]) {
                        worm ++;
                        dfs(i, j, N, M);
                    }
                }
            }
        
            System.out.println(worm);
        }
    }
}