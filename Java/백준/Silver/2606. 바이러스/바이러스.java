import java.util.*;

class Main{
    static boolean[] visited;
    static List<List<Integer>> graph;
    static int cnt = 0;
    
    static void dfs(int n) {
        visited[n] = true;
        
        for(int i : graph.get(n)) {
            if (!visited[i]) {
                cnt ++;
                dfs(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        visited = new boolean[N+1];
        graph = new ArrayList<>();
        
        for (int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i=0; i<M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            graph.get(start).add(end);
            graph.get(end).add(start);
        }
        
        dfs(1);
        System.out.println(cnt);
    }
}