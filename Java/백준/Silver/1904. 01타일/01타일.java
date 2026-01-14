import java.util.*;

class Main{
    static long[] arr;
    
    public static void dp() {
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        
        for (int i=3; i<=1000000; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 15746;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        arr = new long[1000000 + 1];
        
        dp();
        
        System.out.println(arr[N]);
    }
}