class Solution {
    public int solution(int left, int right) {
        // 1. left - right 반복문
        // 2. 약수 카운트 함수
        // 3. 결과에 따라 계산
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            int cnt = 0;
            
            for (int j=1; j<=i; j++){
                if (i % j == 0){
                    cnt += 1;
                }
            }
            
            if (cnt % 2 == 0){
                answer += i;
            } else answer -= i;
        }
        return answer;
    }
}