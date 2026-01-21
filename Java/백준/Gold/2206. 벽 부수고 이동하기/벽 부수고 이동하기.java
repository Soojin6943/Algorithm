import java.util.*;

class Main {
    static int N, M;
    static int[][] map;
    static boolean[][][] visited;
    static int[] dn = {0, 0, 1, -1};
    static int[] dm = {1, -1, 0, 0};
    
    public static int bfs(int n, int m, int depth) {
        visited[n][m][0] = true;
        int breakWall = 0;
        
        Deque<int[]> que = new ArrayDeque<>(); // n, m, depth, break
        que.add(new int[]{n, m, 1, breakWall});
        
        while(!que.isEmpty()) {
            int[] cur = que.poll();
            if (cur[0] == N-1 && cur[1] == M-1) {
                return cur[2];
            }
            
            for (int i=0; i<4; i++) {
                int nn = cur[0] + dn[i];
                int nm = cur[1] + dm[i];
                
                if (nn < 0 || nm < 0 || nn >= N || nm >= M) continue;
                
                // 벽이지만 안 부순 상태 -> 부수기
                if (cur[3] == 0 && !visited[nn][nm][1] && map[nn][nm] == 1) {
                    visited[nn][nm][1] = true;
                    que.add(new int[]{nn, nm, cur[2] + 1, 1});
                }
                // 길이면 그냥 가기
                if (!visited[nn][nm][cur[3]] && map[nn][nm] == 0) {
                    visited[nn][nm][cur[3]] = true;
                    que.add(new int[]{nn, nm, cur[2] + 1, cur[3]});
                }
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        
        map = new int[N][M];
        visited = new boolean[N][M][2];
        sc.nextLine();
        
        for (int i=0; i<N; i++) {
            String str = sc.next();
            for (int j=0; j<M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        
        int result = bfs(0, 0, 1);

        System.out.println(result);
    }
}
