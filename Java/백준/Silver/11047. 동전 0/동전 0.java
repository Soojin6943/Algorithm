import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int answer = 0;
        
        int[] moneys = new int[N];
        for (int i=0; i<N; i++){
            moneys[i] = sc.nextInt();
        }
        
        for (int i=N-1; i>=0; i--){
            if (moneys[i] > K){
                continue;
            } 
            if (K <= 0){
                break;
            }
            
            answer += K / moneys[i];
            K -= (moneys[i]*(K/moneys[i]));
        }
        
        System.out.println(answer);
    }
}