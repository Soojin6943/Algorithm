import java.util.*;

class Main {
    static long[] result = new long[101];
    static void dp() {
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;
        result[3] = 1;
        
        for (int i=4; i<=100; i++) {
            result[i] = result[i-2] + result[i-3];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        dp();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            
            System.out.println(result[N]);
        }
    }
}