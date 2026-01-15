import java.util.*;

class Main {
    static boolean[] visited;
    static Deque<int[]> que = new ArrayDeque<>();
    
    static int bfs(int now, int target) {
        // 현재 지점 방문 처리
        visited[now] = true;
        que.add(new int[]{now, 0});
        
        while (!que.isEmpty()) {
            int[] cur = que.pollFirst();
            int n = cur[0];
            int time = cur[1];
            
            if (n == target) return time;
            
            int[] next = {n-1, n+1, 2*n};
            
            for (int i : next) {
                if (i < 0 || i > 100000) continue;
                if (!visited[i]) {
                    visited[i] = true;
                    que.addLast(new int[]{i, time+1});
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        visited = new boolean[100001];
        
        int result = bfs(N, K);
        
        System.out.println(result);
    }
}