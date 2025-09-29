

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // 누적합 저장
        int[] arr = new int[N];

        arr[0] = sc.nextInt();
        for (int i=1; i<N; i++){
            arr[i] = arr[i-1] + sc.nextInt();
        }

        int max = arr[K-1];
        for (int i=K; i<N; i++){
            max = Math.max(max, arr[i] - arr[i-K]);
        }

        System.out.println(max);
    }
}
