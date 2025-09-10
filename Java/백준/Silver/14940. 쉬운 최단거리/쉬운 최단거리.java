import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int N;
    static int M;
    static boolean[][] visited;
    static int[][] result;
    static int[][] arr;
    
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    
    // 너비우선탐색 - 큐 사용
    public static void bfs (int startY,int startX){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startY, startX});
        visited[startY][startX] = true;
        result[startY][startX] = 0;
        
        while(!q.isEmpty()){
            int[] now = q.poll();
            int y = now[0];
            int x = now[1];
            
            for (int i=0; i<4; i++){
                int ny = y + dy[i];
                int nx = x + dx[i];
                
                // 범위
                if (ny < 0 || ny >= N || nx < 0 || nx >= M){
                    continue;
                }
                // 방문 확인
                if (visited[ny][nx]) {
                    continue;
                }
                // 0 확인
                if (arr[ny][nx] == 0){
                    continue;
                }
                
                visited[ny][nx] = true;
                result[ny][nx] = result[y][x] + 1;
                q.add(new int[]{ny, nx});
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        arr = new int[N][M];
        // 방문 확인
        visited = new boolean[N][M];
        // 거리
        result = new int[N][M];
        
        int startX = 0, startY = 0;
        
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 2){
                    startX = j;
                    startY = i;
                }
            }
        }
        
        bfs(startY, startX);
        
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                if (arr[i][j] == 0){
                    sb.append(0 + " ");
                } else if (!visited[i][j]){
                    sb.append(-1 + " ");
                } else {
                    sb.append(result[i][j] + " ");
                }
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
        
    }
}