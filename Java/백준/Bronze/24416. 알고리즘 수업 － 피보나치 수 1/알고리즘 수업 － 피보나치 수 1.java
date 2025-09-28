import java.util.Scanner;

public class Main{
    static int fib_cnt;
    static int fibonacci_cnt;
    public static int fib(int n){
        if (n == 1 || n == 2){
            fib_cnt++;
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
    
    static int[] dp;
    public static int fibonacci(int n){
        for (int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
            fibonacci_cnt++;
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib_cnt = 0;
        dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        fibonacci_cnt = 0;
        
        fib(n);
        fibonacci(n);
        
        System.out.println(fib_cnt + " " + fibonacci_cnt);
        
    }
}