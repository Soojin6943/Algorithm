import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] room = new int[N][M];

        // 방향 상태 (북, 동, 남, 서) 반시계는 반대
        int[] row = new int[]{-1, 0, 1, 0};
        int[] col = new int[]{0, 1, 0, -1};

        int start_r = sc.nextInt();
        int start_c = sc.nextInt();
        int status = sc.nextInt();

        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                room[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        int now_r = start_r;
        int now_c = start_c;

        while(true){
            // 현재 칸 청소
            if (room[now_r][now_c] == 0){
                room[now_r][now_c] = 2;
                cnt ++;
            }

            boolean moved = false;

            for(int i=0; i<4; i++){
                status = (status + 3) % 4;
                int next_r = now_r + row[status];
                int next_c = now_c + col[status];

                if (next_r >= 0 && next_r < N && next_c >= 0 && next_c < M){
                    if (room[next_r][next_c] == 0){
                        now_r = next_r;
                        now_c = next_c;
                        moved = true;
                        break;
                    }
                }
            }

            // 4방향 전부 못가면 후진
            if (!moved){
                int back = (status + 2) % 4;
                int back_r = now_r + row[back];
                int back_c = now_c + col[back];

                if (room[back_r][back_c] == 1){
                    break;
                } else {
                    now_r = back_r;
                    now_c = back_c;
                }
            }
        }

        System.out.println(cnt);

    }
}
