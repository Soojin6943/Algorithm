import java.util.*;

class Main {
    static int[][][] tomato;
    static int[] dh = {1, -1, 0, 0, 0, 0};
    static int[] dn = {0, 0, 1, -1, 0, 0};
    static int[] dm = {0, 0, 0, 0, 1, -1};
    static int day = 0;
    static int H, M, N;
    
    public static void bfs() {
        Deque<int[]> que = new ArrayDeque<>(); // int[]{h, n, m, day}
        
        // 익어있는 토마토 전부 큐에 담기
        for (int h=0; h<H; h++) {
            for (int n=0; n<N; n++) {
                for (int m=0; m<M; m++) {
                    if (tomato[h][n][m] == 1) que.add(new int[]{h, n, m, 0});
                }
            }
        }
        
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            day = Math.max(day, cur[3]);
            
            for (int i=0; i<6; i++) {
                int nh = cur[0] + dh[i];
                int nn = cur[1] + dn[i];
                int nm = cur[2] + dm[i];
                
                // 범위 확인
                if (nh < 0 || nn < 0 || nm < 0 || nh >= H || nn >= N || nm >= M) continue;
                
                // 다음 토마토가 안 익어있으면 익히고 큐에 넣기
                if (tomato[nh][nn][nm] == 0) {
                    tomato[nh][nn][nm] = 1;
                    que.add(new int[]{nh, nn, nm, cur[3] + 1});
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt(); // 가로
        N = sc.nextInt(); // 세로
        H = sc.nextInt(); // 높이
        
        // 토마토 배열
        tomato = new int[H][N][M];
        for (int h=0; h<H; h++) {
            for (int n=0; n<N; n++) {
                for (int m=0; m<M; m++) {
                    tomato[h][n][m] = sc.nextInt();
                }
            }
        }
        
        bfs();
        
        for (int h=0; h<H; h++) {
            for (int n=0; n<N; n++) {
                for (int m=0; m<M; m++) {
                    if (tomato[h][n][m] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(day);
    }
}