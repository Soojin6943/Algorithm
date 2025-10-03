import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    static List<List<Integer>> graph;
    static boolean[] visited;
    static int cnt = 0;
    
    static void dfs(int s){
        visited[s] = true;
        for(int i : graph.get(s)){
            if (!visited[i]){
                visited[i] = true;
                cnt ++;
                dfs(i);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        graph = new ArrayList<>();
        
        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        
        visited = new boolean[n+1];
        
        int m = sc.nextInt();
        for (int i=0; i<m; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            graph.get(start).add(end);
            graph.get(end).add(start);
        }
        
        dfs(1);
        System.out.println(cnt);
    }
}