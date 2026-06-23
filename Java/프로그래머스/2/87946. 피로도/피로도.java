class Solution {
    static boolean[] visited;
    static int answer = 0;
    static int cnt = 0;
    
    public static void dfs(int now, int[][] dungeons, int depth) {
        
        if (dungeons.length == depth) {
            answer = depth;
            return;
        }
                
        
        for (int i=0; i<dungeons.length; i++) {
            if (visited[i]) continue;
            if (now < dungeons[i][0]) {
                answer = Math.max(answer, depth);
                continue;
            }
            
            visited[i] = true;
            dfs(now - dungeons[i][1], dungeons, depth + 1);
            visited[i] = false;
        }
    }
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        
        for (int i=0; i<dungeons.length; i++) {
            visited[i] = true;
            
            if (k < dungeons[i][0]) {
                continue;
            }
            
            dfs(k - dungeons[i][1], dungeons, 1);
            
            visited[i] = false;
        }
        
        return answer;
    }
}