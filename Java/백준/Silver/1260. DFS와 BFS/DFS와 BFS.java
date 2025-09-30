import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Collections;

public class Main {
    static List<List<Integer>> graph;
    static boolean[] visited;
    static Deque<Integer> dq;
    static StringBuilder sb;

    static void dfs(int s){
        visited[s] = true;
        sb.append(s).append(" ");
        for(int i : graph.get(s)){
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
    static void bfs(int s){
        visited[s] = true;
        dq.add(s);

        while(!dq.isEmpty()){
            int now = dq.pollFirst();
            sb.append(now).append(" ");
            for(int i : graph.get(now)){
                if (!visited[i]){
                    dq.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        graph = new ArrayList<>();
        for (int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        for(int i=0; i<=N; i++){
            Collections.sort(graph.get(i));
        }
        visited = new boolean[N+1];

        dq = new ArrayDeque<>();
        sb = new StringBuilder();

        dfs(V);
        sb.append("\n");

        for (int i=0; i<=N; i++){
            visited[i] = false;
        }

        bfs(V);
        System.out.println(sb);

    }
}
