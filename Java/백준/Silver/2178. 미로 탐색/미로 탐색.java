
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited;
    static int[] dr = new int[]{0, 0, 1, -1};
    static int[] dc = new int[]{1, -1, 0, 0};
    static Deque<node> dq = new ArrayDeque<>();
    static int[][] cnt;
    static int[][] arr;

    static class node{
        int row;
        int col;

        node(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    static void bfs(node n, int N, int M) {
        visited[n.row][n.col] = true;
        dq.add(n);

        while(!dq.isEmpty()){
            node now = dq.pollFirst();

            for (int i=0; i<4; i++){
                int next_r = now.row + dr[i];
                int next_c = now.col + dc[i];

                if (next_r >= 0 && next_r < N && next_c >= 0 && next_c < M){
                    if (!visited[next_r][next_c] && arr[next_r][next_c] == 1){
                        visited[next_r][next_c] = true;
                        dq.add(new node(next_r, next_c));
                        cnt[next_r][next_c] = cnt[now.row][now.col] + 1;

//                        System.out.println(next_r + " " + next_c + " " +cnt[next_r][next_c]);
                    }
                }
            }
        }

    }
    public static void main(String[] args) throws IOException{
        // 최소 칸수 -> 너비 우선 탐색?
        // 시작 도착 위치 포함
        // 큐 사용 (데크)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
        String nm = br.readLine();
        StringTokenizer st = new StringTokenizer(nm);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];

        visited = new boolean[N][M];
        cnt = new int[N][M];
        cnt[0][0] = 1;

        // 미로 만들기
        for (int i=0; i<N; i++){
            String str = br.readLine();
            String[] ar = (str.split(""));
            for (int j=0; j<M; j++){
                arr[i][j] = Integer.parseInt(ar[j]);
//                System.out.print(arr[i][j]);
            }
//            System.out.println();
        }

        node start = new node(0, 0);

        bfs(start, N, M);

        System.out.println(cnt[N-1][M-1]);

    }
}
