import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        
        int[] arr = new int[n + 1];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int start = 0, end = 0, sum = 0;
        int result = Integer.MAX_VALUE;
        
        while (true){
            if (end > n){
                break;
            }
            
            if (sum < s){
                sum += arr[end];
                end ++;
            } else if (sum >= s){
                result = Math.min(result, end - start);
                sum -= arr[start];
                start++;
            } 
           
        }
        if (result == Integer.MAX_VALUE){
            result = 0;
        }
        System.out.println(result);
    }
}