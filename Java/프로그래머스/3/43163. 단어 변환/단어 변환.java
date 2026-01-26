import java.util.*;

class Solution {
    boolean visited[];
    class Word {
        String name;
        int depth;
        
        Word(String name, int depth) {
            this.name = name;
            this.depth = depth;
        }
    }
    private int bfs(String begin, String target, String[] words) {
        Deque<Word> que = new ArrayDeque<>();
        que.add(new Word(begin, 0));
        
        while (!que.isEmpty()) {
            Word cur = que.poll();
            
            if (cur.name.equals(target)) {
                return cur.depth;
            }
            
            for (int j=0; j<words.length; j++) {
                int cnt = 0;
                for (int i=0; i<begin.length(); i++) {
                    if (words[j].charAt(i) != cur.name.charAt(i)) cnt ++;
                }
                
                if (cnt == 1 && !visited[j]) {
                    visited[j] = true;
                    que.add(new Word(words[j], cur.depth + 1));
                }
            }
        }
        return 0;
    }
    
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        visited = new boolean[words.length];
        answer = bfs(begin, target, words);
        return answer;
    }
}