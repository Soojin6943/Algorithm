import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 테스터케이스 T
        int T = sc.nextInt();
        
        for (int t=0; t<T; t++){
            // 건물의 개수
            int N = sc.nextInt();
            // 건설 순서 규칙의 개수
            int K = sc.nextInt();
            // 건물 당 건축 시간
            int[] times = new int[N+1];
            
            for (int i=1; i<=N; i++){
                times[i] = sc.nextInt();
            }
            
            // 그래프 (건물 관계), 진입 차수
            List<List<Integer>> graph = new ArrayList<>();
            for (int i=0; i<=N; i++){
                graph.add(new ArrayList<>());
            }
            int[] indegree = new int[N + 1];
            
           // 규칙 입력
            for (int i=0; i<K; i++){
                int start = sc.nextInt();
                int end = sc.nextInt();
                
                graph.get(start).add(end);
                indegree[end]++;
            }
            
            int W = sc.nextInt();
            
            int[] dp = new int[N + 1];
            Queue<Integer> q = new LinkedList<>();
            
            for (int i=1; i<=N; i++){
                dp[i] = times[i];
                if (indegree[i] == 0){
                    // 0이면 시작 가능한 건물
                    q.add(i);
                }
            }
            while (!q.isEmpty()) {
                int cur = q.poll();
                
                for (int next : graph.get(cur)){
                    dp[next] = Math.max(dp[next], dp[cur] + times[next]);
                    if (--indegree[next] == 0){
                        q.add(next);
                    }
                }
            }
            
            System.out.println(dp[W]);
        }
        
        
        
        
        
    }
}