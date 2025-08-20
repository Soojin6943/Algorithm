import java.util.*;
class Solution {
    class Node {
        String word;
        int cnt;
        
        public Node(String word, int cnt){
            this.word = word;
            this.cnt = cnt;
        }
    }
    
    public boolean covert(String begin, String target){
        int cnt = 0;
        
        for (int i=0; i<begin.length(); i++){
            if(begin.charAt(i) != target.charAt(i)){
                cnt ++;
            }
        }
        
        if (cnt == 1) return true;
        else return false;
    }
    
    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)){
            return 0;
        }
        
        // bfs를 위한 큐 + 방문 여부
        Queue<Node> que = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        
        // 시작 노드 추가 (시작 단어, 변환 횟수)
        que.add(new Node(begin, 0));
        
        while(!que.isEmpty()){
            // 현재 노드 꺼내기
            Node current = que.poll();
            
            // 현재 단어가 타겟이랑 같으면 변환 횟수 반환
            if (current.word.equals(target)) {
                return current.cnt;
            } else {
                // 단어 배열을 순회하며 다음 단어 찾음
                for(int i=0; i<words.length; i++){
                    if(!visited[i] && covert(current.word, words[i])){    // 변환 가능하면  
                        visited[i] = true;
                        que.add(new Node(words[i], current.cnt + 1));
                    }     
                }
            }
        }   
        // while 문 끝날때까지 못찾으면 0
        return 0;  
    }
}
