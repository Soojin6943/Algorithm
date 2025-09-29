import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    static boolean[] visited;
    static int[] deep;
    static List<ArrayList<Integer>> graph;
    static int cnt = 1;

    static void dfs (int start){
        visited[start] = true;
        deep[start] = cnt++;
        for(int i : graph.get(start)) {
            if(!visited[i]){
                dfs(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        visited = new boolean[N+1];
        deep = new int[N+1];

        graph = new ArrayList<>();
        for (int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for (int i=0; i<M; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        for (int i=0; i<=N; i++){
            graph.get(i).sort(Comparator.reverseOrder());
        }

        dfs(R);
        for (int i=1; i<=N; i++){
            sb.append(deep[i]).append("\n");
        }

        System.out.println(sb);

    }
}