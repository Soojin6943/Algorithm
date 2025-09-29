
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static boolean[] visited;
    static Deque<Integer> deque = new ArrayDeque<>();
    static List<List<Integer>> graph;
    static int cnt = 0;
    static int[] result;

    static void bfs(int n) {
        visited[n] = true;

        deque.add(n);

        while(!deque.isEmpty()){
            int now = deque.pollFirst();
            result[now] = ++cnt;

            for (int i : graph.get(now)){
                if (!visited[i]){
                    visited[i] = true;
                    deque.addLast(i);
                }
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();

        visited = new boolean[N+1];

        graph = new ArrayList<>();
        for (int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for (int i=1; i<=M; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        // sort
        for (int i=0; i<=N; i++){
            Collections.sort(graph.get(i));
        }

        result = new int[N+1];

        bfs(R);

        for (int i=1; i<=N; i++){
            System.out.println(result[i]);
        }
    }
}
