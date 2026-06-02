class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        
        while(true) {
            int pizza = 6 * i;
            if (pizza % n == 0) {
                answer = i;
                break;
            } 
            i++;
        }
        
        return answer;
    }
}