import java.util.*;

class Solution {
    // 가능한 숫자 담을 set
    HashSet<Integer> set = new HashSet<>();
    // 방문 여부
    boolean[] visited;
    
    // 소수 판별
    public boolean isPrime(int n){
        if (n < 2){
            return false;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    // 가능한 숫자 조합 만들기
    void dfs(String numbers, String current, int depth){
        if (depth > numbers.length()){
            return;
        }
        
        for (int i=0; i<numbers.length(); i++){
            if (!visited[i]){
                visited[i] = true;
                String next = current + numbers.charAt(i);
                set.add(Integer.parseInt(next));
                dfs(numbers, next, depth + 1);
                // 다음 탐색을 위해 
                visited[i] = false;
            }
        }
    }
    
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        int answer = 0;
        
        dfs(numbers, "", 0);
        
        for (int num : set){
            if (isPrime(num)){
                answer ++;
            }
        }
        return answer;
    }
}