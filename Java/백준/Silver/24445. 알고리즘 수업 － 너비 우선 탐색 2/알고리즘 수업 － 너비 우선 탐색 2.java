import java.util.Scanner;
import java.util.Deque;
import java.util.Collections;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

public class Main {
    static boolean[] visited;
    static Deque<Integer> dp;
    static List<List<Integer>> graph;
    static int cnt = 0;
    static int[] time;
    static void bfs(int s){
        // 시작 지점 방문으로 체크
        visited[s] = true;

        // 큐에 넣기
        dp.add(s);

        // 탐색 시작
        while(!dp.isEmpty()){
            int now = dp.pollFirst();
            time[now] = ++cnt;
            for (int i : graph.get(now)){
                if(!visited[i]){
                    visited[i] = true;
                    dp.add(i);
                }
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        visited = new boolean[N+1];
        dp = new ArrayDeque<>();

        graph = new ArrayList<>();
        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for (int i=0; i<M; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        for(int i=0; i<=N; i++){
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        time = new int[N+1];

        bfs(K);

        for(int i=1; i<=N; i++){
            System.out.println(time[i]);
        }

    }
}
