import java.util.*;

class Main {
    static int[] step;
    static int[] dp;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n];
        
        step = new int[n];
        for (int i=0; i<n; i++) {
            step[i] = sc.nextInt();
        }
        
        if (n==1) {
            System.out.println(step[0]);
            return;
        }
        
        if (n == 2) {
            System.out.println(step[0] + step[1]);
            return;
        }
        
        dp[0] = step[0];
        dp[1] = step[1] + step[0];
        dp[2] = Math.max(step[1], step[0]) + step[2];
        
        for (int i=3; i<n; i++){
            dp[i] = Math.max(
                dp[i-2], dp[i-3] + step[i-1]
            ) + step[i];
        }
        System.out.println(dp[n-1]);
    }
}