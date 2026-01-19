import java.util.*;

public class Main {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N][N];
        
        for (int i=0; i<N; i++) {
            String line = sc.next();
            for (int j = 0; j < N; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        
        check(0, 0, N);
    }
    
    static void check(int x, int y, int size) {
        boolean type = checkType(x, y, size);
        int startType = arr[x][y];
        
        if (type) {
            System.out.print(startType);
        } else {
            int mid = size / 2;
            
            System.out.print("(");
            
            check(x, y, mid);
            check(x, y+mid, mid);
            check(x+mid, y, mid);
            check(x+mid, y+mid, mid);
            
            System.out.print(")");
        }
        
    }
    
    static boolean checkType(int x, int y, int size) {
        int startType = arr[x][y];
        for (int i=x; i<x+size; i++) {
            for (int j=y; j<y+size; j++) {
                if (startType != arr[i][j]) return false;
            }
        }
        return true;
    }
}