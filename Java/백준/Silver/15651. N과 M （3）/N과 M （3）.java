import java.util.*;

class Main {
    // depth와 M 크기가 같아졌을때 반환
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    
    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i=0; i<N; i++) {
            arr[depth] = i+1;
            dfs(N, M, depth+1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        arr = new int[M];
        dfs(N, M, 0);
        
        System.out.println(sb);
    }
}