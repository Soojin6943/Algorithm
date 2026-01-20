// 퀸 이동 : 상하, 좌우, 대각선 
// 이중 for : N * N 만큼 
// 방문 가능한 곳 true
// N개 이상 두면 백트레킹

import java.util.*;

class Main {
    static boolean[] col;
    static boolean[] diag1;
    static boolean[] diag2;
    static int N;
    static int count = 0;
    
    public static void dfs(int row) {
        if (row == N) {
            count++;
            return;
        }
        
        
        for (int i=0; i<N; i++) {
            if (!col[i] && !diag1[row + i] && !diag2[row - i + N - 1]) {
                col[i] = diag1[row + i] = diag2[row - i + N - 1] = true;
                dfs(row + 1);
                col[i] = diag1[row + i] = diag2[row - i + N - 1] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        
        col = new boolean[N];
        diag1 = new boolean[2 * N];
        diag2 = new boolean[2 * N];
        
        dfs(0);
        
        System.out.println(count);
    }
}