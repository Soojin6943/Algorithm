class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int idx = 1;
        int size = 1;
        while (num > 0){
            int n = num % 10;
            if (n == k){
                answer = idx;
            }
            num /= 10;
            idx ++;
            size ++;
        }
        
        if (answer != -1){
            answer = size - answer;
        }
        return answer;
    }
}