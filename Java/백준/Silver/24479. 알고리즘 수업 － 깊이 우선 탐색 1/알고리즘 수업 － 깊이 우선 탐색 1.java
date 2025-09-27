import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    static boolean[] visited;
    static int cnt = 0;
    static int[] line;
    
    public static void dfs(List<List<Integer>> graph, int s) {
        visited[s] = true;
        cnt ++;
        line[s] = cnt;
        
        for(int i : graph.get(s)){
            if (!visited[i]){
                dfs(graph, i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 정점의 수
        int N = sc.nextInt();
        // 간선의 수
        int M = sc.nextInt();
        // 시작 정점
        int R = sc.nextInt();
        
        line = new int[N+1];
        visited = new boolean[N+1];
        
        for (int i=0; i<N+1; i++){
            visited[i] = false;
        }
        
        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i<= N; i++){
            graph.add(new ArrayList<>());
        }
        
        for (int i=0; i<M; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            graph.get(start).add(end);
            graph.get(end).add(start);
        }
        
        // 오름차순 정렬
        for(int i=1; i<=N; i++){
            Collections.sort(graph.get(i));
        }
        
        dfs(graph, R);
        
        for (int i=1; i<=N; i++){
            System.out.println(line[i]);
        }
    }
}