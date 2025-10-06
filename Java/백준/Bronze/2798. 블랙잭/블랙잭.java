import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int answer = 0;
        boolean same = false;
        
        for (int i=0; i<N-2; i++){
            if (same){
                    break;
            }
            for (int j=i+1; j<N-1; j++){
                if (same){
                    break;
                }
                for (int k=j+1; k<N; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum > M){
                        break;
                    }
                    int d = M - sum;
                    
                    if (sum == M){
                        same = true;
                        answer = M;
                        break;
                    }
                    
                    if (min > d){
                        min = d;
                        answer = sum;
                    }
                }
            }
        }
        
        System.out.println(answer);
    }
}