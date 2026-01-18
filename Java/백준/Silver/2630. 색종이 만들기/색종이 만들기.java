import java.util.*;

class Main{
    static int blue = 0;
    static int white = 0;
    static int[][] paperColor;
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        paperColor = new int[N][N];
        
        for (int i=0; i<N; i++) {
            for (int j = 0; j<N; j++) {
                paperColor[i][j] = sc.nextInt();
            }
        }
        // 재귀 탐색
        
        search(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }
    
    public static void search(int x, int y, int size) {
        // 색 검사
        int first = paperColor[y][x];
        
        boolean result = colorSearch(first, x, y, size);
        
        if (result) {
            if (first == 1) {
                blue ++;
            } else {
                white++;
            }
        } else {
            int mid = size / 2;
            
            search(x, y, mid);
            search(x+mid, y, mid);
            search(x, y + mid, mid);
            search(x+mid, y + mid, mid);
        }
    }
    
    public static boolean colorSearch(int first, int x, int y, int size) {
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (first != paperColor[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
}