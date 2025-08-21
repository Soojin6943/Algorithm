import java.util.*;

public class Main{
    public static int check(int k){
        int sum = k;
        while (k > 0){
            sum += k % 10;
            k = k / 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int answer = 0;
        for (int i=1; i<n; i++){
            if (check(i) == n){
                answer = i;
                break;
            }
        }
        
        System.out.println(answer);
    }
}