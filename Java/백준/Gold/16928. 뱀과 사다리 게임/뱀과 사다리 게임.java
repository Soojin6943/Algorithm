import java.util.*;

public class Main {
    static HashMap<Integer, Integer> map;
    static boolean[] visited;
    
    public static void main(String[] args) {
        // 뱀과 사다리를 해시맵으로 저장
        // bfs
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사다리 수
        int M = sc.nextInt(); // 뱀의 수
        
        // 키 : 사다리 혹은 뱀의 위치, 값 : 이동 위치
        map = new HashMap<>();
        visited = new boolean[101];
        
        for (int i=0; i<N+M; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            
            map.put(key, value);
        }
        
        bfs(1, 100);
    }
    
    public static void bfs(int start, int end) {
        Deque<int[]> que = new ArrayDeque<>();
        visited[start] = true;
        
        que.add(new int[]{start, 0});
        
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            
            if (cur[0] == end) {
                System.out.println(cur[1]);
                return;
            }
            
            for (int i=1; i<=6; i++) {
                int nx = cur[0] + i;
                if (nx > 100) continue;
                
                if (map.containsKey(nx)) nx = map.get(nx);
                if (!visited[nx]) {
                    visited[nx] = true;
                    que.add(new int[]{nx, cur[1] + 1});
                }
            }
        }
    }
}