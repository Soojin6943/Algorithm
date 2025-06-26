import java.util.*;

class Solution {
    private int answer;
    
    private void dfs (int[] numbers, int target, int depth,int res){
        if (depth == numbers.length){   // 마지막 노드이면
            if (res == target)  // 타겟노드와 결과가 같으면 1 증가
                answer += 1;
        } else {
            // + 계산
            dfs(numbers, target, depth+1, res + numbers[depth]);
            // - 계산
            dfs(numbers, target, depth+1, res - numbers[depth]);
        }
    }
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
}