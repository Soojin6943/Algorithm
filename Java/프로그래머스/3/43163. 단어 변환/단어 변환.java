/**
최소 몇 단계
너비우선탐색 - 큐
깊이 우선 재귀
*/
class Solution {
    static int result = 51;
    public int solution(String begin, String target, String[] words) {
        
        boolean[] visited = new boolean[words.length];
        dfs(begin, target, words, visited, 0);
        
        if (result == 51) return 0;
        
        return result;
        
    }
    
    public static void dfs(String now, String target, String[] words, boolean[] visited, int depth) {
        
        if (now.equals(target)) {
            result = Math.min(depth, result);
            return;
        }
        
        for (int i=0; i<words.length; i++) {
            if (visited[i] == false) {
                String next = words[i];
                int cnt = 0;
                for (int j=0; j<next.length(); j++) {
                    if (now.charAt(j) != next.charAt(j)) {
                        cnt ++;
                    }
                }
                if (cnt != 1) continue;
                visited[i] = true;
                dfs(next, target, words, visited, depth + 1);
                visited[i] = false;
            }
        }
    }
}