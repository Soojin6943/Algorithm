import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int K = sc.nextInt();
        for (int k=0; k<K; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int sum =0;
            for (int x1 = i-1; x1 < x; x1++)
                for (int y1 = j-1; y1 < y; y1++)
                    sum += arr[x1][y1];
            System.out.println(sum);
        }
        
    }
}
