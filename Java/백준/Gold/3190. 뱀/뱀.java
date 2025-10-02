import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    static int[] dr = new int[]{0, -1, 0, 1};
    static int[] dc = new int[]{-1, 0, 1, 0};
    static Queue<Move> que;
    static int[][] board;
    static Queue<Node> tail_q = new LinkedList<>();
    static int N;
    static int time;
    static class Move{
        int times;
        String dir;

        public Move(int times, String dir){
            this.dir = dir;
            this.times = times;
        }
    }
    static class Node{
        int row;
        int col;
        public Node(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    static void gameCheck(){
        // 현재 방향
        int status = 2;
        int status_r = dr[status];
        int status_c = dc[status];
        time = 0;
        int now_r = 0;
        int now_c = 0;
        tail_q.add(new Node(now_r, now_c));

        while(true) {
            time++;

            // 앞으로 이동
            now_r += status_r;
            now_c += status_c;

            // 벽이면 게임 종료
            if (now_c < 0 || now_c >= N || now_r < 0 || now_r >= N) {
                return;
            }

            // 다음칸이 내 몸이면 게임 종료
            if (board[now_r][now_c] == 1) {
                return ;
            }

            if (board[now_r][now_c] == 2) {  // 이동한 칸이 사과
                board[now_r][now_c] = 1;
            } else {
                board[now_r][now_c] = 1;
                Node tail = tail_q.poll();
                board[tail.row][tail.col] = 0;
            }

            tail_q.add(new Node(now_r, now_c));

            if (!que.isEmpty() && que.peek().times == time) {
                Move next = que.poll();
                if (next.dir.equals("D")) {
                    status = (status + 1) % 4;
                } else {
                    status = (status + 4 - 1) % 4;
                }
                status_r = dr[status];
                status_c = dc[status];
            }

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int K = sc.nextInt();

        board = new int[N][N];

        for (int i=0; i<K; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();

            // 사과 있음 0부터 시작이라 1씩 빼줌
            board[r-1][c-1] = 2;
        }

        int m = sc.nextInt();
        que = new LinkedList<>();
        // 회전에 대한 값 받아야 함
        for (int i=0; i<m; i++){
            int t = sc.nextInt();
            String[] st = sc.nextLine().split("");

            que.add(new Move(t, st[1]));
        }

        gameCheck();
        System.out.println(time);
    }
}
