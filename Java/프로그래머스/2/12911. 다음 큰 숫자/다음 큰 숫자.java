class Solution {
    // 2진수 카운트 함수
    public int bin_cnt(int num){
        int cnt = 0;
        while (num > 0){
            if (num % 2 == 1)
                cnt += 1;
            num = num / 2;
        }
        return cnt;
    }
    
    public int solution(int n) {
        int answer = 0;
        int n_cnt = bin_cnt(n);
        
        while(true){
            n = n+1;
            if (n_cnt == bin_cnt(n)){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}