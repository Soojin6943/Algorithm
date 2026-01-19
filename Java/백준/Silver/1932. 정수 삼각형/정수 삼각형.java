import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[][] tri = new int[N][N];
        
        for (int i=0; i<N; i++) {
            for (int j=0; j<=i; j++) {
                tri[i][j] = sc.nextInt();
            }
        }
        
        for (int i=1; i<N; i++) {
            for (int j=0; j<=i; j++) {
                if(j-1 < 0) tri[i][j] = tri[i-1][0] + tri[i][j];
                else if (j == i) tri[i][j] = tri[i-1][j-1] + tri[i][j];
                else tri[i][j] = Math.max(tri[i-1][j-1] + tri[i][j], tri[i-1][j] + tri[i][j]);
            }
        }
        
        Arrays.sort(tri[N-1]);
        System.out.println(tri[N-1][N-1]);
    }
}