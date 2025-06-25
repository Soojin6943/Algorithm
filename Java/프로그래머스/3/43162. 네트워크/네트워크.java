class Solution {
    private static boolean[] visit;
    private static int[][] computer;
    
    private static void dfs(int now) {
        // 현재 노드 방문 처리
        visit[now] = true;
        for (int i=0; i<computer[now].length; i++){
            // 연결되어 있지만 방문하지 않은 노드
            if (computer[now][i] == 1 && !visit[i]){
                dfs(i);
            }
        }
        
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        computer = computers;
        visit = new boolean[n];
        
        for (int i=0; i<n; i++){
            if (!visit[i]){
                dfs(i);
                answer ++;
            }
        }
        return answer;
    }
}