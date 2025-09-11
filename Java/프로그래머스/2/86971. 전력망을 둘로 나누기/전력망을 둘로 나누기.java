import java.util.ArrayList;

class Solution {
    static ArrayList<ArrayList<Integer>> graph;
    public static int dfs(int start, boolean[] visited) {
        visited[start] = true;
        int cnt = 1;
    
        for (int i : graph.get(start)){
            if (!visited[i]){
                cnt += dfs(i, visited);
            }
        }
        
        return cnt;
    }
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        graph = new ArrayList<>();
        for (int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        
        for (int i=0; i<wires.length; i++){
            graph.get(wires[i][0]-1).add(wires[i][1]-1);
            graph.get(wires[i][1]-1).add(wires[i][0]-1);
        }
        
        for (int i=0; i<wires.length; i++){
            int first = wires[i][0] -1;
            int second = wires[i][1] -1;
            
            boolean[] visited = new boolean[n+1];
            
            graph.get(first).remove(Integer.valueOf(second));
            graph.get(second).remove(Integer.valueOf(first));
            
            int firstDeep = dfs(first, visited);
            int secondDeep = dfs(second, visited);
            
            int d = Math.abs(firstDeep - secondDeep);
            answer = Math.min(answer, d);
            
            graph.get(first).add(second);
            graph.get(second).add(first);
        }
        
        
        
        return answer;
    }
}