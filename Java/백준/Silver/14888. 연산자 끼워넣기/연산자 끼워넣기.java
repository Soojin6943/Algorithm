import java.util.Scanner;

public class Main{
    static int result;
    static int[] arr;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    static void bfs(int idx, int p, int m, int q, int d, int r) {
        if (p == 0 && m == 0 && q == 0 && d == 0){
            max = Math.max(max, r);
            min = Math.min(min, r);
        }
        if (p > 0){
            bfs(idx + 1, p -1, m, q, d, r + arr[idx]);
        }
        if (m > 0){
            bfs(idx + 1, p, m-1, q, d,r - arr[idx]);
        }
        if (q > 0){
            bfs(idx + 1, p, m, q-1, d, r * arr[idx]);
        }
        if (d > 0){
            bfs(idx + 1, p, m, q, d-1, r / arr[idx]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int p = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int d = sc.nextInt();
        
        result = arr[0];
        bfs(1, p, m, q, d, result);

        System.out.println(max);
        System.out.println(min);
    }
}