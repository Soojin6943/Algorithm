import java.util.*;

class Main{
    static boolean[] visited;
    static int[] arr;
    
    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i=1; i<=N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                dfs(N, M, depth+1);
                visited[i] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        visited = new boolean[N+1];
        arr = new int[M];
        
        dfs(N, M, 0);
    }
}