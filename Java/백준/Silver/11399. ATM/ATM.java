import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] dp = new int[N];
        int answer = 0;
        
        
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        dp[0] = arr[0];
         
        for(int i=1; i<N; i++){
            dp[i] = dp[i-1] + arr[i];
        }
        
        answer = Arrays.stream(dp).sum();
        
        System.out.println(answer);
    }
}