class Solution {
    public int solution(int num) {
        // int로 하면 정수 오버플로우 발생으로 인해 실패
        long answer = num;
        int cnt = 0;
        
        if (answer == 1) return 0;
        
        while (answer != 1){
            if (cnt >= 500) return -1;
            
            if (answer % 2 == 0){
                answer = answer / 2;
                cnt ++;
            } else {
                answer = answer * 3 + 1;
                cnt ++;
            }
            
        }
        return cnt;
    }
}