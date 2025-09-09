import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = -1;
        
        int[][] arr = new int[N][M];
        for (int i=0; i<N; i++){
            String s = sc.next();
            for (int j=0; j<M; j++){
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                for (int di=-N; di<N; di++){
                    for (int dj=-M; dj<M; dj++){
                        if (di == 0 && dj == 0){
                            continue;
                        }
                        
                        int ni = i;
                        int nj = j;
                        int current = 0;
                        while (ni >= 0 && ni < N && nj >= 0 && nj < M){
                            current *= 10;
                            current += arr[ni][nj];
                            
                            int root = (int)(Math.sqrt(current));
                            if (root*root == current){
                                result = Math.max(result, current);
                            }
                            
                            ni += di;
                            nj += dj;
                        }
                    }
                }
            }
        }
        
        System.out.println(result);
    }
}