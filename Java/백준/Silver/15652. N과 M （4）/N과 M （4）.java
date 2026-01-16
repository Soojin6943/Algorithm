import java.util.*;

class Main {
    static int[] arr;
    
    static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i=1; i<=N; i++) {
            if (depth != 0) {
                if (arr[depth-1] > i) continue;
            } 
            
            arr[depth] = i;
            dfs(N, M, depth + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        arr = new int[M];
        
        dfs(N, M, 0);
    }
}