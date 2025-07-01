import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        // prices 배열 길이
        int n = prices.length;
        // 주식 시간 저장
        int[] answer = new int[n];
        // 가격 변동 확인을 위한 스택
        Stack<Integer> st = new Stack<>();
        // 초기 비교값을 위해 0 푸시
        st.push(0);
        
        for(int i=1; i<n; i++){
            // 가격이 떨어질 경우
            while(!st.isEmpty() && prices[st.peek()] > prices[i]){
                int j = st.pop();   // 떨어진 인덱스 
                answer[j] = i - j;
            }
            st.push(i);
        }
        
        // stack에 남아있는 가격이 떨어지지 않은 인덱스
        while(!st.isEmpty()) {
            int j = st.pop();
            answer[j] = n - j - 1;
        }
        
        return answer;
    }
}