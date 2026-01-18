import java.util.*;

class Main {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] box;
    static int N;
    static int M;
    static int minDay = 0;
    
    static void bfs () {
        Deque<int[]> que = new ArrayDeque<>();
        
        // 한번에 익은 토마토를 확인해야 함
        // 익은 토마토들 먼저 큐에 넣기
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (box[i][j] == 1) {
                    que.add(new int[]{j, i, 0});
                }
            }
        }
        
        while (!que.isEmpty()) {
            int[] now = que.poll();
            // 최대 일수 구하기
            if (minDay < now[2]) minDay = now[2];
            
            for (int i=0; i<4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                
                if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if (box[ny][nx] == 0) {
                    box[ny][nx] = 1;
                    que.add(new int[]{nx, ny, now[2] + 1});
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt(); // 가로
        N = sc.nextInt(); // 세로
        
        // 박스 상태 채우기
        box = new int[N][M];
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                box[i][j] = sc.nextInt();
            }
        }
        
        bfs();
        
        for (int[] b : box) {
            for (int i : b) {
                if (i == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        
        System.out.println(minDay);
        
    }
}